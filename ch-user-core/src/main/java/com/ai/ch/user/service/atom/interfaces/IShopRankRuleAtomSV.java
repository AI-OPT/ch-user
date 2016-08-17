package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;

public interface IShopRankRuleAtomSV {

	int insert(ShopRankRule record);
	
	List<ShopRankRule> selectByExample(ShopRankRuleCriteria example);
	
	int updateByExample(@Param("record") ShopRankRule record, @Param("example") ShopRankRuleCriteria example);
}
