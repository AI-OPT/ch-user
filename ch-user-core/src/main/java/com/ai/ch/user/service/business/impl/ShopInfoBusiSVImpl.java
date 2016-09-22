package com.ai.ch.user.service.business.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.ShopInfoVo;
import com.ai.ch.user.api.shopinfo.params.ShopScoreKpiVo;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import com.ai.ch.user.service.atom.interfaces.IDepositRuleAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopInfoAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopRankRuleAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopScoreKpiAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopStatDataAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;

@Component
@Transactional
public class ShopInfoBusiSVImpl implements IShopInfoBusiSV {

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
	
	@Override
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ShopInfoCriteria example= new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		if(request.getUserId()!=null&&!"".equals(request.getUserId())){
			criteria.andUserIdEqualTo(request.getUserId());
		}
		
		if(request.getShopName()!=null&&!"".equals(request.getShopName())){
			criteria.andShopNameEqualTo(request.getShopName());
		}
		
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		if(!list.isEmpty())
			BeanUtils.copyProperties(list.get(0), response);
		return response;
	}

	@Override
	public int insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException {
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		return shopInfoAtomSV.insert(shopInfo);
	}

	@Override
	public int updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException {
		ShopInfo shopInfo = new ShopInfo();
		BeanUtils.copyProperties(request, shopInfo);
		shopInfo.setCreateTime(DateUtil.getSysDate());
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria =example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		return shopInfoAtomSV.updateByExampleSelective(shopInfo, example);
	}

	@Override
	public QueryDepositRuleResponse queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException {
		CtDepositRuleCriteria example = new CtDepositRuleCriteria();
		CtDepositRuleCriteria.Criteria criteria  = example.createCriteria();
		criteria.andProductCatIdEqualTo(request.getProductCatId());
		List<CtDepositRule> list = depositRuleAtomSV.selectByExample(example);
		QueryDepositRuleResponse response = new QueryDepositRuleResponse();
		if(!list.isEmpty()){
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;
	}

	@Override
	public QueryShopScoreKpiResponse queryShopScoreKpi(QueryShopScoreKpiRequest request)
			throws BusinessException, SystemException {
		QueryShopScoreKpiResponse response = new QueryShopScoreKpiResponse();
		ShopScoreKpiCriteria example = new ShopScoreKpiCriteria();
		ShopScoreKpiCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		List<ShopScoreKpi> list = shopScoreKpiAtomSV.selectByExample(example);
		List<ShopScoreKpiVo> responseList = new ArrayList<ShopScoreKpiVo>();
		for (ShopScoreKpi shopScoreKpi : list) {
			ShopScoreKpiVo shopScoreKpiVo = new ShopScoreKpiVo();
			BeanUtils.copyProperties(shopScoreKpi, shopScoreKpiVo);
			responseList.add(shopScoreKpiVo);
		}
		response.setList(responseList);
		return response;
	}

	@Override
	public int updateShopStatData(UpdateShopStatDataRequest request) throws BusinessException, SystemException {
		ShopStatDataCriteria example = new ShopStatDataCriteria();
		ShopStatDataCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		ShopStatData shopStatData = new ShopStatData();
		BeanUtils.copyProperties(request, shopStatData);
		return shopStatDataAtomSV.updateByExampleSelective(shopStatData, example);
	}

	@Override
	public int insertShopStatData(InsertShopStatDataRequest request) throws BusinessException, SystemException {
		ShopStatData record = new ShopStatData();
		BeanUtils.copyProperties(request, record);
		return shopStatDataAtomSV.insert(record);
	}

	@Override
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)
			throws BusinessException, SystemException {
		QueryShopStatDataResponse response = new QueryShopStatDataResponse();
		ShopStatDataCriteria example = new ShopStatDataCriteria();
		ShopStatDataCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopStatData> list = shopStatDataAtomSV.selectByExample(example);
		if(!list.isEmpty())
			BeanUtils.copyProperties(list.get(0), response);
		return response;
	}

	@Override
	public Integer queryShopRank(QueryShopRankRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		
		//店铺评级统计数据
		ShopStatDataCriteria shopStatDataExample = new ShopStatDataCriteria();
		ShopStatDataCriteria.Criteria shopStatDataCriteria = shopStatDataExample.createCriteria();
		shopStatDataCriteria.andUserIdEqualTo(request.getUserId());
		List<ShopStatData> shopStatDataList = shopStatDataAtomSV.selectByExample(shopStatDataExample);
		Long servCharge = 0L;
		//获取佣金
		if(shopStatDataList.isEmpty())
			throw new BusinessException("统计数据不存在");
		else
			servCharge = shopStatDataList.get(0).getServCharge(); 
		//店铺评级指标
		BigDecimal h =new BigDecimal("0");
		BigDecimal a=new BigDecimal("0");
		ShopScoreKpiCriteria shopScoreKpiExample = new ShopScoreKpiCriteria();
		ShopScoreKpiCriteria.Criteria shopScoreKpiCriteria = shopScoreKpiExample.createCriteria();
		shopScoreKpiCriteria.andTenantIdEqualTo(request.getTenantId());
		List<String> strList = new ArrayList<String>();
		strList.add("h");
		strList.add("a");
		shopScoreKpiCriteria.andKpiNameIn(strList);
		List<ShopScoreKpi> shopScoreList = shopScoreKpiAtomSV.selectByExample(shopScoreKpiExample);
		for (ShopScoreKpi shopScoreKpi : shopScoreList) {
			if("h".equals(shopScoreKpi.getKpiName()))
				h = shopScoreKpi.getWeight();
			else if("a".equals(shopScoreKpi.getKpiName()))
				a = shopScoreKpi.getWeight();
		}
		//计算分数公式   score=h(a*佣金+b*订单+.....)
		BigDecimal score = h.multiply((a.multiply(BigDecimal.valueOf(servCharge))));
		
		Integer rank=0;
		//查询score在平台评级规则表中的rank
		ShopRankRuleCriteria shopRankRuleExample = new ShopRankRuleCriteria();
		ShopRankRuleCriteria.Criteria shopRankRuleCriteria = shopRankRuleExample.createCriteria();
		shopRankRuleCriteria.andTenantIdEqualTo(request.getTenantId());
		shopRankRuleCriteria.andMinScoreLessThan(score.longValue());
		shopRankRuleCriteria.andMaxScoreGreaterThan(score.longValue());
		List<ShopRankRule> shopRankRuleList = shopRankRuleAtomSV.selectByExample(shopRankRuleExample);
		if(shopRankRuleList.isEmpty())
			throw new BusinessException("评分不在规则之内");
		else
			rank = shopRankRuleList.get(0).getRank();
		return rank;
	}

	@Override
	public Long queryShopDeposit(QueryShopDepositRequest request) throws BusinessException, SystemException {
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		Long deposit=0L;
		if(list.isEmpty())
			throw new BusinessException("店铺信息不存在");
		else{
			if(list.get(0).getDepositBalance()!=null)
				deposit=list.get(0).getDepositBalance();
			else{
				CtDepositRuleCriteria ctDepositRuleExample = new CtDepositRuleCriteria();
				CtDepositRuleCriteria.Criteria ctDepositRuleCriteria = ctDepositRuleExample.createCriteria();
				ctDepositRuleCriteria.andProductCatIdEqualTo(list.get(0).getBusiType());
				List<CtDepositRule> ctDepositRules = depositRuleAtomSV.selectByExample(ctDepositRuleExample);
				if(list.isEmpty())
					throw new BusinessException("默认保证金不存在");
				else
				deposit = ctDepositRules.get(0).getDefaultDeposit();
			}
		}
		return deposit;
	}

	@Override
	public QueryShopInfoBatchResponse queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException {
		QueryShopInfoBatchResponse response = new QueryShopInfoBatchResponse();
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andCreateTimeGreaterThan(request.getBeginTime());
		criteria.andCreateTimeLessThan(request.getEndTime());
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		List<ShopInfoVo> responseList = new ArrayList<ShopInfoVo>();
		for (ShopInfo shopInfo : list) {
			ShopInfoVo shopInfoVo = new ShopInfoVo();
			BeanUtils.copyProperties(shopInfo, shopInfoVo);
			responseList.add(shopInfoVo);
		}
		response.setList(responseList);
		return response;
	}

	@Override
	public boolean checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException {
		
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}
		if(!StringUtil.isBlank(request.getUserId())){
			criteria.andUserIdEqualTo(request.getUserId());
		}

		if(StringUtil.isBlank(request.getShopName())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:店铺名称不能为空");
		}
		criteria.andShopNameEqualTo(request.getShopName());
		
		List<ShopInfo> list = shopInfoAtomSV.selectByExample(example);
		
		if(CollectionUtil.isEmpty(list)){
			return true;
		}else if(!StringUtil.isBlank(request.getUserId())){
			ShopInfo shopInfo = list.get(0);
			if(shopInfo.getUserId().equals(request.getUserId())){
				return true;
			}
		}
		return false;
	}
}
