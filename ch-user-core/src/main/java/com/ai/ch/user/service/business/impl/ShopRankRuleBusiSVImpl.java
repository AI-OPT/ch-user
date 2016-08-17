package com.ai.ch.user.service.business.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import com.ai.ch.user.service.atom.interfaces.IShopRankRuleAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopRankRuleBusiBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.DateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class ShopRankRuleBusiSVImpl implements IShopRankRuleBusiBusiSV {

	@Autowired
	private IShopRankRuleAtomSV shopRankRuleAtomSV;
	
	@Override
	public int insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException {
		ShopRankRule shopRankRule = new ShopRankRule();
		BeanUtils.copyProperties(request, shopRankRule);
		shopRankRule.setUpdateTime(DateUtil.getSysDate());
		return shopRankRuleAtomSV.insert(shopRankRule); 
	}

	@Override
	public int updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException {
		ShopRankRuleCriteria example = new ShopRankRuleCriteria();
		ShopRankRuleCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		ShopRankRule shopRankRule = new ShopRankRule();
		BeanUtils.copyProperties(request, shopRankRule);
		shopRankRule.setUpdateTime(DateUtil.getSysDate());
		return shopRankRuleAtomSV.updateByExample(shopRankRule, example);
	}

	@Override
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request) throws BusinessException, SystemException {
		ShopRankRuleCriteria example = new ShopRankRuleCriteria();
		ShopRankRuleCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		QueryRankRuleResponse response = new QueryRankRuleResponse();
		List<ShopRankRule> shopRankRuleList = shopRankRuleAtomSV.selectByExample(example);
		if(!shopRankRuleList.isEmpty())
		BeanUtils.copyProperties(shopRankRuleList.get(0), response);
		return response;
	}

}
