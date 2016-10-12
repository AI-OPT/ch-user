package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;

public interface IDefaultLogAtomSV {

	int countByExample(ShopDefaultLogCriteria example);

	int insert(ShopDefaultLog record);

	List<ShopDefaultLog> selectByExample(ShopDefaultLogCriteria example);
	
	int deleteDefaultLog(ShopDefaultLogCriteria example);
}
