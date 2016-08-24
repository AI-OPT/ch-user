package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.ShopRankRuleVo;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import com.ai.ch.user.service.atom.interfaces.IShopRankRuleAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopRankRuleBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.DateUtil;

@Component
@Transactional
public class ShopRankRuleBusiSVImpl implements IShopRankRuleBusiSV {

	@Autowired
	private IShopRankRuleAtomSV shopRankRuleAtomSV;
	
	@Override
	public int insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException {
		for (ShopRankRuleVo shopRankRuleVo : request.getList()) {
			ShopRankRule shopRankRule = new ShopRankRule();
			BeanUtils.copyProperties(shopRankRuleVo, shopRankRule);
			shopRankRule.setUpdateTime(DateUtil.getSysDate());
			shopRankRuleAtomSV.insert(shopRankRule);
		}
		return 0; 
	}

	@Override
	public int updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException {
		if(!request.getList().isEmpty()){
			ShopRankRuleCriteria example=new ShopRankRuleCriteria();
			ShopRankRuleCriteria.Criteria criteria = example.createCriteria();
			criteria.andTenantIdEqualTo(request.getTenantId());
			shopRankRuleAtomSV.deleteByExample(example);
			
			for (ShopRankRuleVo shopRankRuleVo : request.getList()) {
				ShopRankRule shopRankRule = new ShopRankRule();
				BeanUtils.copyProperties(shopRankRuleVo, shopRankRule);
				shopRankRule.setUpdateTime(DateUtil.getSysDate());
				shopRankRuleAtomSV.insert(shopRankRule);
			}
		}
		return 0;
	}

	@Override
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request) throws BusinessException, SystemException {
		ShopRankRuleCriteria example = new ShopRankRuleCriteria();
		ShopRankRuleCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		QueryRankRuleResponse response = new QueryRankRuleResponse();
		List<ShopRankRule> shopRankRuleList = shopRankRuleAtomSV.selectByExample(example);
		List<ShopRankRuleVo> responseList = new ArrayList<ShopRankRuleVo>();
		if(!shopRankRuleList.isEmpty()){
			for (ShopRankRule shopRankRule : shopRankRuleList) {
				ShopRankRuleVo shopRankRuleVo = new ShopRankRuleVo();
				BeanUtils.copyProperties(shopRankRule, shopRankRuleVo);
				responseList.add(shopRankRuleVo);
				}
			}
		response.setList(responseList);
		return response;
	}

}
