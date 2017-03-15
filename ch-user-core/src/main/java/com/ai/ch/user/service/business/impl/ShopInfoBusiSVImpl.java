package com.ai.ch.user.service.business.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.score.impl.ScoreSVImpl;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopBalanceRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import com.ai.ch.user.service.atom.interfaces.IDepositRuleAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopInfoAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopInfoLogAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopRankRuleAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopScoreKpiAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopStatDataAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;

@Component
@Transactional
public class ShopInfoBusiSVImpl implements IShopInfoBusiSV {

	static final Log LOG = LogFactory.getLog(ScoreSVImpl.class);

	@Autowired
	private IShopInfoAtomSV shopInfoAtomSV;

	@Autowired
	private IDepositRuleAtomSV depositRuleAtomSV;

	@Autowired
	private IShopScoreKpiAtomSV shopScoreKpiAtomSV;

	@Autowired
	private IShopStatDataAtomSV shopStatDataAtomSV;

	@Autowired
	private IShopRankRuleAtomSV shopRankRuleAtomSV;

	@Autowired
	private IShopInfoLogAtomSV shopInfoLogAtomSV;

	@Override
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		if (request.getUserId() != null && !"".equals(request.getUserId())) {
			criteria.andUserIdEqualTo(request.getUserId());
		}
		if (request.getShopName() != null && !"".equals(request.getShopName())) {
			criteria.andShopNameEqualTo(request.getShopName());
		}
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		if (!CollectionUtil.isEmpty(list)) {
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;
	}

	@Override
	public int insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException {
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfo.setStatus(0);
		shopInfoAtomSV.insert(shopInfo);
		
		// 插入日志表
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(request, shopInfoLog);
		shopInfoLog.setOperId(request.getOperId());
		shopInfoLog.setOperName(request.getOperName());
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfoLogAtomSV.insert(shopInfoLog);
		return 1;
	}

	@Override
	public void updateShopInfo(UpdateShopInfoRequest request,ShopInfo shopInfo) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		if (CollectionUtil.isEmpty(list)) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "更新数据不存在");
		}
		shopInfoAtomSV.updateByExampleSelective(shopInfo, example);
		
		// 插入日志表
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(shopInfo, shopInfoLog);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfoLogAtomSV.insert(shopInfoLog);
	}

	@Override
	public QueryDepositRuleResponse queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException {
		CtDepositRuleCriteria example = new CtDepositRuleCriteria();
		CtDepositRuleCriteria.Criteria criteria = example.createCriteria();
		criteria.andProductCatIdEqualTo(request.getProductCatId());
		List<CtDepositRule> list = depositRuleAtomSV.selectByExample(example);
		QueryDepositRuleResponse response = new QueryDepositRuleResponse();
		if (!CollectionUtil.isEmpty(list)) {
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;
	}

	@Override
	public List<ShopScoreKpi> queryShopScoreKpi(QueryShopScoreKpiRequest request)
			throws BusinessException, SystemException {
		ShopScoreKpiCriteria example = new ShopScoreKpiCriteria();
		ShopScoreKpiCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		List<ShopScoreKpi> list = shopScoreKpiAtomSV.selectByExample(example);
		return list;
	}

	@Override
	public void updateShopStatData(UpdateShopStatDataRequest request) throws BusinessException, SystemException {
		ShopStatDataCriteria example = new ShopStatDataCriteria();
		ShopStatDataCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		ShopStatData shopStatData = new ShopStatData();
		BeanUtils.copyProperties(request, shopStatData);
		shopStatDataAtomSV.updateByExampleSelective(shopStatData, example);
	}

	@Override
	public void insertShopStatData(InsertShopStatDataRequest request) throws BusinessException, SystemException {
		ShopStatData record = new ShopStatData();
		BeanUtils.copyProperties(request, record);
		shopStatDataAtomSV.insert(record);
	} 

	@Override
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)
			throws BusinessException, SystemException {
		QueryShopStatDataResponse response = new QueryShopStatDataResponse();
		ShopStatDataCriteria example = new ShopStatDataCriteria();
		ShopStatDataCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopStatData> list = shopStatDataAtomSV.selectByExample(example);
		if (!CollectionUtil.isEmpty(list)) {
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;
	}

	@Override
	public Integer queryShopRank(QueryShopRankRequest request,BigDecimal score) throws BusinessException, SystemException {
		Integer rank = 0;
		// 查询score在平台评级规则表中的rank
		ShopRankRuleCriteria shopRankRuleExample = new ShopRankRuleCriteria();
		ShopRankRuleCriteria.Criteria shopRankRuleCriteria = shopRankRuleExample.createCriteria();
		shopRankRuleCriteria.andTenantIdEqualTo(request.getTenantId());
		shopRankRuleCriteria.andMinScoreLessThan(score.longValue());
		shopRankRuleCriteria.andMaxScoreGreaterThan(score.longValue());
		List<ShopRankRule> shopRankRuleList = shopRankRuleAtomSV.selectByExample(shopRankRuleExample);
		if (CollectionUtil.isEmpty(shopRankRuleList)) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "评分不在规则之内");
		} else {
			rank = shopRankRuleList.get(0).getRank();
		}
		return rank;
	}

	@Override
	public Long queryShopDeposit(QueryShopDepositRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId().trim());
		criteria.andUserIdEqualTo(request.getUserId().trim());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		Long deposit = 0L;
		if (CollectionUtil.isEmpty(list)) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "店铺信息不存在");
		} else {
			// 若保证金未设置,默认0
			deposit=(null==list.get(0).getDepositBalance()?0L:list.get(0).getDepositBalance());
		}
		return deposit;
	}

	@Override
	public List<ShopInfo> queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andCreateTimeGreaterThan(request.getBeginTime());
		criteria.andCreateTimeLessThan(request.getEndTime());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		return list;
	}

	@Override
	public List<ShopInfo> checkShopNameOnly(QueryShopInfoRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId().trim());
		criteria.andShopNameEqualTo(request.getShopName().trim());
		List<ShopInfo> shopInfos = shopInfoAtomSV.selectByExample(example);
		return shopInfos;
	}

	@Override
	public void saveShopAuditInfo(SaveShopAuditInfoRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId().trim());
		criteria.andUserIdEqualTo(request.getUserId().trim());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		if (!CollectionUtil.isEmpty(list)) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "店铺id已存在");
		}
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		// 0/1/2:未开通/已开通/注销
		shopInfo.setStatus(0);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfoAtomSV.insert(shopInfo);
		
		// 插入日志表
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(shopInfo, shopInfoLog);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfoLogAtomSV.insert(shopInfoLog);
	}

	@Override
	public void updateShopStatus(UpdateShopStatusRequest request,ShopInfo shopInfo) throws BusinessException, SystemException {
		ShopInfoCriteria shopExample = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria shopCriteria = shopExample.createCriteria();
		shopCriteria.andTenantIdEqualTo(request.getTenantId());
		shopCriteria.andUserIdEqualTo(request.getUserId());
		int count = shopInfoAtomSV.updateByExampleSelective(shopInfo, shopExample);
		if (count == 0) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "更新记录失败");
		}
		
		// 店铺日志表
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(shopInfo, shopInfoLog);
		shopInfoLog.setUpdateTime(DateUtil.getSysDate()); 
		ShopInfoLogCriteria shopLogExample = new ShopInfoLogCriteria();
		ShopInfoLogCriteria.Criteria shopLogCriteria =shopLogExample.createCriteria();
		shopLogCriteria.andTenantIdEqualTo(request.getTenantId());
		shopLogCriteria.andUserIdEqualTo(request.getUserId());
		shopInfoLogAtomSV.updateByExampleSelective(shopInfoLog,shopLogExample);
	}

	@Override
	public QueryShopInfoResponse queryShopInfoById(QueryShopInfoByIdRequest request)
			throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		if (CollectionUtil.isEmpty(list)) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "查询数据不存在");
		}
		BeanUtils.copyProperties(list.get(0), response);
		response.setDepositBalance(null==response.getDepositBalance()?0L:response.getDepositBalance());
		return response;
	}

	@Override
	public void setShopDeposit(SetShopDepositRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setDepositBalance(request.getDepositBalance());
		shopInfoAtomSV.updateByExampleSelective(shopInfo, example);
	}

	@Override
	public void setShopBalance(SetShopBalanceRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		shopInfoAtomSV.updateByExampleSelective(shopInfo, example);
	}

	@Override
	public List<ShopScoreKpi> queryShopKpi(QueryShopKpiRequest request) throws BusinessException, SystemException {
		ShopScoreKpiCriteria example = new ShopScoreKpiCriteria();
		ShopScoreKpiCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		List<ShopScoreKpi> shopScoreKpis = shopScoreKpiAtomSV.selectByExample(example);
		return shopScoreKpis;
	}

	@Override
	public void updateShopAuditInfo(UpdateShopAuditInfoRequest request) throws BusinessException, SystemException {
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		// 0/1/2:未开通/已开通/注销
		shopInfo.setStatus(0);
		ShopInfoCriteria idExample = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria idCriteria = idExample.createCriteria();
		idCriteria.andTenantIdEqualTo(request.getTenantId());
		idCriteria.andUserIdEqualTo(request.getUserId());
		int count = shopInfoAtomSV.updateByExampleSelective(shopInfo, idExample);
		if (count == 0) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "更新记录失败");
		}
		
		//插入日志表 
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(shopInfo, shopInfoLog);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		shopInfoLogAtomSV.insert(shopInfoLog);
	}
}
