package com.ai.ch.user.api.shopinfo.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.shopinfo.interfaces.IShopInfoSV;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.IShopInfoBusiSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class ShopInfoSVImpl implements IShopInfoSV {

	@Autowired
	private IShopInfoBusiSV shopInfoBusiSV;
	
	@Autowired
	private IShopInfoLogBusiSV shopInfoLogBusiSV;
	
	@Override
	public QueryShopInfoResponse queryShopInfo(QueryShopInfoRequest request) throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ResponseHeader responseHeader =null;
		try{
			response = shopInfoBusiSV.queryShopInfo(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertShopInfo(InsertShopInfoRequst request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.insertShopInfo(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateShopInfo(UpdateShopInfoRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.updateShopInfo(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryDepositRuleResponse queryDepositRule(QueryDepositRuleRequest request)
			throws BusinessException, SystemException {
		QueryDepositRuleResponse response = new QueryDepositRuleResponse();
		ResponseHeader responseHeader =null;
		try{
			response = shopInfoBusiSV.queryDepositRule(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertShopInfoLog(InsertShopInfoLogRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoLogBusiSV.insertShopInfoLog(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopInfoLogResponse queryShopInfoLog(QueryShopInfoLogRequest request)
			throws BusinessException, SystemException {
		QueryShopInfoLogResponse response = new QueryShopInfoLogResponse();
		ResponseHeader responseHeader =null;
		try{
		response = shopInfoLogBusiSV.queryShopInfoLog(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopScoreKpiResponse queryShopScoreKpi(QueryShopScoreKpiRequest request)
			throws BusinessException, SystemException {
		QueryShopScoreKpiResponse response = new QueryShopScoreKpiResponse();
		ResponseHeader responseHeader =null;
		try{
		response = shopInfoBusiSV.queryShopScoreKpi(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse insertShopStatData(InsertShopStatDataRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
		shopInfoBusiSV.insertShopStatData(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateShopStatData(UpdateShopStatDataRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
		shopInfoBusiSV.updateShopStatData(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopStatDataResponse queryShopStatData(QueryShopStatDataRequest request)
			throws BusinessException, SystemException {
		QueryShopStatDataResponse response = new QueryShopStatDataResponse();
		ResponseHeader responseHeader =null;
		try{
			response = shopInfoBusiSV.queryShopStatData(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public Integer queryShopRank(QueryShopRankRequest request) throws BusinessException, SystemException {
		QueryShopRankResponse response = new QueryShopRankResponse();
		ResponseHeader responseHeader =null;
		Integer rank = 0;
		try{
			rank = shopInfoBusiSV.queryShopRank(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setRank(rank);
		response.setResponseHeader(responseHeader);
		return shopInfoBusiSV.queryShopRank(request);
	}

	@Override
	public Long queryShopDeposit(QueryShopDepositRequest request) throws BusinessException, SystemException {
		return shopInfoBusiSV.queryShopDeposit(request);
	}

	@Override
	public QueryShopInfoBatchResponse queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException {
		return shopInfoBusiSV.queryShopInfoBatch(request);
	}

	@Override
	@POST
	@Path("/checkShopNameOnly")
	public BaseResponse checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException {
		return shopInfoBusiSV.checkShopNameOnly(request);
	}

	@Override
	public BaseResponse saveShopAuditInfo(SaveShopAuditInfoRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.saveShopAuditInfo(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateShopStatus(UpdateShopStatusRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.updateShopStatus(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopInfoResponse queryShopInfoById(QueryShopInfoByIdRequest request)
			throws BusinessException, SystemException {
		QueryShopInfoResponse response = new QueryShopInfoResponse();
		ResponseHeader responseHeader =null;
		try{
			response = shopInfoBusiSV.queryShopInfoById(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
