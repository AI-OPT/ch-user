package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IShopRankRuleAtomSV;

@Component
public class ShopRankRuleAtomSVImpl implements IShopRankRuleAtomSV {

	@Override
	public int insert(ShopRankRule record) {
		return MapperFactory.getShopRankRuleMapper().insert(record);
	}

	@Override
	public List<ShopRankRule> selectByExample(ShopRankRuleCriteria example) {
		return MapperFactory.getShopRankRuleMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(ShopRankRule record, ShopRankRuleCriteria example) {
		return MapperFactory.getShopRankRuleMapper().updateByExample(record, example);
	}

	@Override
	public int deleteByExample(ShopRankRuleCriteria example) {
		return MapperFactory.getShopRankRuleMapper().deleteByExample(example);
	}

}
