package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;

public interface IDefaultLogAtomSV {

	int countByExample(ShopDefaultLogCriteria example);

	int insert(ShopDefaultLog record);

	List<ShopDefaultLog> selectByExample(ShopDefaultLogCriteria example);
	
	QueryFullDefaultLogResponse selectPageDefaultLog(QueryFullDefaultLogRequest request);
	
	QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request);
	
	int deleteDefaultLog(ShopDefaultLogCriteria example);
}
