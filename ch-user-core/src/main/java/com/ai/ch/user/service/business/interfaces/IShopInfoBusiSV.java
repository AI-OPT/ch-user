package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResposne;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopInfoBusiSV {

	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException;

	public int insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException;

	public int updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException;

	public QueryDepositRuleResposne queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException;
	
	public QueryShopScoreKpiResponse queryShopScoreKpi(QueryShopScoreKpiRequest request)
			throws BusinessException, SystemException;
	
	public int updateShopStatData(UpdateShopStatDataRequest request)
			throws BusinessException, SystemException;
	
	public int insertShopStatData(InsertShopStatDataRequest request)
			throws BusinessException, SystemException;
	
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)
			throws BusinessException, SystemException;
}
