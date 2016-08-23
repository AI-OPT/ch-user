package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopInfoBusiSV {

	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException;
	
	public int insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException;
	
	public int updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException;
}
