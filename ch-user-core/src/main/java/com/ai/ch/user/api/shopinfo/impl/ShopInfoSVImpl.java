package com.ai.ch.user.api.shopinfo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.shopinfo.interfaces.IShopInfoSV;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.InsertShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleRequest;
import com.ai.ch.user.api.shopinfo.params.QueryDepositRuleResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoBatchResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopScoreKpiResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopStatDataResponse;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopBalanceRequest;
import com.ai.ch.user.api.shopinfo.params.SetShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.ShopInfoVo;
import com.ai.ch.user.api.shopinfo.params.ShopScoreKpiVo;
import com.ai.ch.user.api.shopinfo.params.UpdateShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatDataRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import com.ai.ch.user.service.atom.interfaces.IShopScoreKpiAtomSV;
import com.ai.ch.user.service.atom.interfaces.IShopStatDataAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoBusiSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoLogBusiSV;
import com.ai.ch.user.util.ValidateUtils;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class ShopInfoSVImpl implements IShopInfoSV {

	private static final Logger log = LoggerFactory.getLogger(ShopInfoSVImpl.class);
	
	@Autowired
	private IShopInfoBusiSV shopInfoBusiSV;
	
	@Autowired
	private IShopInfoLogBusiSV shopInfoLogBusiSV;
	
	@Autowired
	private IShopStatDataAtomSV shopStatDataAtomSV;
	
	@Autowired
	private IShopScoreKpiAtomSV shopScoreKpiAtomSV;
	
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
			ShopInfo shopInfo = new ShopInfo();
			BeanUtils.copyProperties(request, shopInfo);
			if (request.getStatus() != null) {
				if (request.getStatus() == 1) {
					shopInfo.setCloseTime(DateUtil.getSysDate());
				} else if (request.getStatus() == 2) {
					shopInfo.setCloseTime(DateUtil.getSysDate());
				} else if (request.getStatus() == 0) {
					shopInfo.setStatus(request.getStatus());
					shopInfo.setOpenTime(DateUtil.getSysDate());
				} else {
					shopInfo.setStatus(null);
				}
			}
			shopInfoBusiSV.updateShopInfo(request,shopInfo);
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
			List<ShopScoreKpi> scoreKpiVos = shopInfoBusiSV.queryShopScoreKpi(request);
			List<ShopScoreKpiVo> responseList = new ArrayList<ShopScoreKpiVo>();
			if(!CollectionUtil.isEmpty(scoreKpiVos)){
			for (ShopScoreKpi shopScoreKpi : scoreKpiVos) {
				ShopScoreKpiVo shopScoreKpiVo = new ShopScoreKpiVo();
				BeanUtils.copyProperties(shopScoreKpi, shopScoreKpiVo);
				responseList.add(shopScoreKpiVo);
				}
			}
			response.setList(responseList);
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
	public QueryShopRankResponse queryShopRank(QueryShopRankRequest request) throws BusinessException, SystemException {
		QueryShopRankResponse response = new QueryShopRankResponse();
		ResponseHeader responseHeader =null;
		Integer rank = 0;
		try {
			ValidateUtils.validatQueryShopRank(request);
			ShopInfoCriteria example = new ShopInfoCriteria();
			ShopInfoCriteria.Criteria criteria = example.createCriteria();
			criteria.andTenantIdEqualTo(request.getTenantId());
			criteria.andUserIdEqualTo(request.getUserId());

			// 店铺评级统计数据
			ShopStatDataCriteria shopStatDataExample = new ShopStatDataCriteria();
			ShopStatDataCriteria.Criteria shopStatDataCriteria = shopStatDataExample.createCriteria();
			shopStatDataCriteria.andUserIdEqualTo(request.getUserId());
			List<ShopStatData> shopStatDataList = shopStatDataAtomSV.selectByExample(shopStatDataExample);
			Long servCharge = 0L;
			// 获取佣金
			if (shopStatDataList.isEmpty()) {
				throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "统计数据不存在");
			} else {
				servCharge = shopStatDataList.get(0).getServCharge();
			}
			// 店铺评级指标
			BigDecimal h = new BigDecimal("0");
			BigDecimal a = new BigDecimal("0");
			ShopScoreKpiCriteria shopScoreKpiExample = new ShopScoreKpiCriteria();
			ShopScoreKpiCriteria.Criteria shopScoreKpiCriteria = shopScoreKpiExample.createCriteria();
			shopScoreKpiCriteria.andTenantIdEqualTo(request.getTenantId());
			List<String> strList = new ArrayList<String>();
			strList.add("h");
			strList.add("a");
			shopScoreKpiCriteria.andKpiNameIn(strList);
			List<ShopScoreKpi> shopScoreList = shopScoreKpiAtomSV.selectByExample(shopScoreKpiExample);
			for (ShopScoreKpi shopScoreKpi : shopScoreList) {
				if ("h".equals(shopScoreKpi.getKpiName())) {
					h = shopScoreKpi.getWeight();
				} else if ("a".equals(shopScoreKpi.getKpiName())) {
					a = shopScoreKpi.getWeight();
				}
			}
			// 计算分数公式 score=h(a*佣金+b*订单+.....)
			BigDecimal score = h.multiply((a.multiply(BigDecimal.valueOf(servCharge))));
			rank = shopInfoBusiSV.queryShopRank(request,score);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setRank(rank);
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopDepositResponse queryShopDeposit(QueryShopDepositRequest request) throws BusinessException, SystemException {
		QueryShopDepositResponse response = new QueryShopDepositResponse();
		ResponseHeader responseHeader =null;
		try{
			ValidateUtils.validatQueryDeposit(request);
			long depositBalance = shopInfoBusiSV.queryShopDeposit(request);
			response.setDepositBalance(depositBalance);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopInfoBatchResponse queryShopInfoBatch(QueryShopInfoBatchRequest request)
			throws BusinessException, SystemException {
		QueryShopInfoBatchResponse response = new QueryShopInfoBatchResponse();
		try{
		List<ShopInfo> shopInfos = shopInfoBusiSV.queryShopInfoBatch(request);
		List<ShopInfoVo> responseList = new ArrayList<ShopInfoVo>();
		if(!CollectionUtil.isEmpty(shopInfos)){
		for (ShopInfo shopInfo : shopInfos) {
			ShopInfoVo shopInfoVo = new ShopInfoVo();
			BeanUtils.copyProperties(shopInfo, shopInfoVo);
			responseList.add(shopInfoVo);
			}
		response.setList(responseList);
		}
		}catch(BusinessException e){
			ResponseHeader responseHeader=new ResponseHeader(false,e.getErrorCode(),e.getErrorMessage()); 
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	@POST
	@Path("/checkShopNameOnly")
	public BaseResponse checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException {
		BaseResponse baseResponse = new BaseResponse();
		ResponseHeader responseHeader = null;
		try{
			ValidateUtils.validatCheckShopName(request);
			List<ShopInfo> shopInfos = shopInfoBusiSV.checkShopNameOnly(request);
			String userId = "";
			if (!StringUtil.isBlank(request.getUserId())) {
				userId = request.getUserId().trim();
			}
			if (CollectionUtil.isEmpty(shopInfos)) {
				responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
				baseResponse.setResponseHeader(responseHeader);
				return baseResponse;
			} else if (!StringUtil.isBlank(userId) && shopInfos.size() == 1) {
				ShopInfo shopInfo = shopInfos.get(0);
				if (shopInfo.getUserId().equals(userId)) {
					responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
					baseResponse.setResponseHeader(responseHeader);
					return baseResponse;
				} else {
					responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SYSTEM_ERROR, "店铺名称已注册");
					baseResponse.setResponseHeader(responseHeader);
					return baseResponse;
				}
			} else {
				responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SYSTEM_ERROR, "店铺名称已注册");
				baseResponse.setResponseHeader(responseHeader);
				return baseResponse;
			}
		}catch(BusinessException e){
			baseResponse = new BaseResponse();
			responseHeader=new ResponseHeader(false,e.getErrorCode(),e.getErrorMessage()); 
			baseResponse.setResponseHeader(responseHeader);
		}
		return baseResponse;
	}

	@Override
	public BaseResponse saveShopAuditInfo(SaveShopAuditInfoRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			ValidateUtils.validatSaveAuditInfo(request);
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
			ValidateUtils.validatUpdateShopStatus(request);
			ShopInfo shopInfo = new ShopInfo();
			shopInfo.setStatus(request.getStatus());
			// 判断更新时间
			if (request.getStatus() == 1) {
				shopInfo.setOpenTime(DateUtil.getSysDate());
			} else if (request.getStatus() == 2) {
				shopInfo.setCloseTime(DateUtil.getSysDate());
			} else if (request.getStatus() == 0) {
				shopInfo.setStatus(request.getStatus());
				shopInfo.setCreateTime(DateUtil.getSysDate());
			} else {
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数格式错误:状态码为0/1/2");
			}
			shopInfoBusiSV.updateShopStatus(request,shopInfo);
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
			ValidateUtils.validatQueryShopInfo(request);
			response = shopInfoBusiSV.queryShopInfoById(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse setShopDeposit(SetShopDepositRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.setShopDeposit(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse setShopBalance(SetShopBalanceRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			shopInfoBusiSV.setShopBalance(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryShopKpiResponse queryShopKpi(QueryShopKpiRequest request) throws BusinessException, SystemException {
		QueryShopKpiResponse response = new QueryShopKpiResponse();
		ResponseHeader responseHeader =null;
		try{
			ValidateUtils.validatQueryShopKpi(request);
			List<ShopScoreKpi> scoreKpis = shopInfoBusiSV.queryShopKpi(request);
			List<ShopScoreKpiVo> responseList = new ArrayList<>();
			if (!CollectionUtil.isEmpty(scoreKpis)) {
				for (ShopScoreKpi shopScoreKpi : scoreKpis) {
					ShopScoreKpiVo shopScoreKpiVo = new ShopScoreKpiVo();
					BeanUtils.copyProperties(shopScoreKpi, shopScoreKpiVo);
					responseList.add(shopScoreKpiVo);
				}
			}
			response.setShopKpiList(responseList);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public BaseResponse updateShopAuditInfo(UpdateShopAuditInfoRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			ValidateUtils.validatUpdateAuditInfo(request);
			shopInfoBusiSV.updateShopAuditInfo(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
			log.error("更新资质信息失败",e);
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
