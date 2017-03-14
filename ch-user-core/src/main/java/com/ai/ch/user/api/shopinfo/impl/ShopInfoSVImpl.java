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
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoLogRequest;
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
import com.ai.opt.sdk.util.DateUtil;
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺信息服务开始"+beginTime);
			response = shopInfoBusiSV.queryShopInfo(request);
			log.info("后场查询店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场保存资质信息服务开始"+beginTime);
			shopInfoBusiSV.insertShopInfo(request);
			log.info("后场保存资质信息服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新店铺信息服务开始"+beginTime);
			shopInfoBusiSV.updateShopInfo(request,shopInfo);
			log.info("后场更新店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询保证金规则服务开始"+beginTime);
			response = shopInfoBusiSV.queryDepositRule(request);
			log.info("后场查询保证金规则服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场保存店铺日志信息服务开始"+beginTime);
			shopInfoLogBusiSV.insertShopInfoLog(request);
			log.info("后场保存店铺日志信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺日志信息服务开始"+beginTime);
			response = shopInfoLogBusiSV.queryShopInfoLog(request);
			log.info("后场查询店铺日志信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺规则信息服务开始"+beginTime);
			response = shopInfoBusiSV.queryShopScoreKpi(request);
			log.info("后场查询店铺规则信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场保存店铺信息服务开始"+beginTime);
			shopInfoBusiSV.insertShopStatData(request);
			log.info("后场保存店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新店铺信息服务开始"+beginTime);
			shopInfoBusiSV.updateShopStatData(request);
			log.info("后场更新店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺信息服务开始"+beginTime);
			response = shopInfoBusiSV.queryShopStatData(request);
			log.info("后场查询店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺等级服务开始"+beginTime);
			rank = shopInfoBusiSV.queryShopRank(request,score);
			log.info("后场查询店铺等级服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺保证金服务开始"+beginTime);
			long depositBalance = shopInfoBusiSV.queryShopDeposit(request);
			log.info("后场查询店铺保证金服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
		return shopInfoBusiSV.queryShopInfoBatch(request);
	}

	@Override
	@POST
	@Path("/checkShopNameOnly")
	public BaseResponse checkShopNameOnly(QueryShopInfoRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = null;
		try{
			ValidateUtils.validatCheckShopName(request);
			response =  shopInfoBusiSV.checkShopNameOnly(request);
		}catch(BusinessException e){
			response = new BaseResponse();
			ResponseHeader responseHeader=new ResponseHeader(false,e.getErrorCode(),e.getErrorMessage()); 
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public BaseResponse saveShopAuditInfo(SaveShopAuditInfoRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			ValidateUtils.validatSaveAuditInfo(request);
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺信息服务开始"+beginTime);
			shopInfoBusiSV.saveShopAuditInfo(request);
			log.info("后场查询店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新店铺状态服务开始"+beginTime);
			shopInfoBusiSV.updateShopStatus(request,shopInfo);
			log.info("后场更新店铺状态服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询店铺信息服务开始"+beginTime);
			response = shopInfoBusiSV.queryShopInfoById(request);
			log.info("后场查询店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场设置店铺服务开始"+beginTime);
			shopInfoBusiSV.setShopDeposit(request);
			log.info("后场设置店铺服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场设置店铺服务开始"+beginTime);
			shopInfoBusiSV.setShopBalance(request);
			log.info("后场设置店铺服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("查询店铺评级指标服务开始"+beginTime);
			response = shopInfoBusiSV.queryShopKpi(request);
			log.info("查询店铺评级指标服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
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
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新店铺信息服务开始"+beginTime);
			shopInfoBusiSV.updateShopAuditInfo(request);
			log.info("后场更新店铺信息服务结束"+System.currentTimeMillis()+"耗时:"+String.valueOf(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(BusinessException e){
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
