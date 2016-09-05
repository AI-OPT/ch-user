package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResposne;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.ShopScoreKpiVo;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import com.ai.ch.user.service.atom.interfaces.IDepositRuleAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopInfoAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopScoreKpiAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopStatDataAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.DateUtil;

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
	
	@Override
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ShopInfoCriteria example= new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
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
	public QueryDepositRuleResposne queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException {
		CtDepositRuleCriteria example = new CtDepositRuleCriteria();
		CtDepositRuleCriteria.Criteria criteria  = example.createCriteria();
		criteria.andProductCatIdEqualTo(request.getProductCatId());
		List<CtDepositRule> list = depositRuleAtomSV.selectByExample(example);
		QueryDepositRuleResposne response = new QueryDepositRuleResposne();
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
}
