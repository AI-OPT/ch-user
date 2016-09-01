package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;

public interface IShopInfoLogAtomSV {

	 int insert(ShopInfoLog record);
	 
	 List<ShopInfoLog> selectByExample(ShopInfoLogCriteria example);
}
