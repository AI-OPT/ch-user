package com.ai.ch.user.api.defaultlog.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.custfile.impl.CustFileSVImpl;
import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.IDefaultLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.alibaba.dubbo.config.annotation.Service;
import com.ylink.upp.base.oxm.util.OxmHandler;

@Component
@Service
public class DefaultLogSVImpl implements IDefaultLogSV {
	private static final Log log = LogFactory.getLog(CustFileSVImpl.class);
	
	@Autowired
	private IDefaultLogBusiSV defaultLogBusiSV;
	
	@Autowired
	private OxmHandler oxmHandler;
	
	private static final Log LOG = LogFactory.getLog(DefaultLogSVImpl.class);
	
	@Override
	public InsertDefaultLogResponse insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException {
		InsertDefaultLogResponse response = new InsertDefaultLogResponse();
		ResponseHeader responseHeader =null;
		String serialCode = "";
		try{
			Long beginTime = System.currentTimeMillis();
			log.info("后场保存扣款信息服务开始"+beginTime);
			serialCode = defaultLogBusiSV.insertDefaultLog(request);
			log.info("后场保存扣款信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		    responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		response.setSerialCode(serialCode);
		return response;
	}

	@Override
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException {
		QueryDefaultLogResponse response = new QueryDefaultLogResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询扣款信息服务开始"+beginTime);
			response = defaultLogBusiSV.queryDefaultLog(request);
			log.info("后场查询扣款信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		}catch(BusinessException e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/deleteDefaultLog")
	public BaseResponse deleteDefaultLog(String serialCode)
			throws SystemException, BusinessException {
		BaseResponse response=new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			log.info("后场删除扣款信息服务开始"+beginTime);
			defaultLogBusiSV.deleteDefaultLog(serialCode);
			log.info("后场删除扣款信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		  responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryFullDefaultLogResponse queryFullDefaultLog(QueryFullDefaultLogRequest request)
			throws SystemException, BusinessException {
		QueryFullDefaultLogResponse response = new QueryFullDefaultLogResponse();
		ResponseHeader responseHeader =null;
		try{
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询扣款信息服务开始"+beginTime);
			response = defaultLogBusiSV.queryFullDefaultLog(request);
			log.info("后场查询扣款信息服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
		responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		}catch(BusinessException e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
