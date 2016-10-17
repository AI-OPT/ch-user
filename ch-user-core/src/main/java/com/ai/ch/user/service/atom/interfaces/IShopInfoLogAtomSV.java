package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;

public interface IShopInfoLogAtomSV {

	 int insert(ShopInfoLog record);
	 
	 List<ShopInfoLog> selectByExample(ShopInfoLogCriteria example);
	 
	 int updateByExample(@Param("record") ShopInfoLog record, @Param("example") ShopInfoLogCriteria example);
	 
	 int updateByExampleSelective(@Param("record") ShopInfoLog record, @Param("example") ShopInfoLogCriteria example);
}
