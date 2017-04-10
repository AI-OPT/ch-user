package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;

public interface IShopInfoAtomSV {

	 int insert(ShopInfo record);
	 
	 List<ShopInfo> selectByExample(ShopInfoCriteria example);
	 
	 ShopInfo selectOne(String tenantId,String shopName);
	 
	 int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoCriteria example);
	 
	 int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoCriteria example);
	 
	 List<CtDepositRule> selectByExample(CtDepositRuleCriteria example);
	 
}
