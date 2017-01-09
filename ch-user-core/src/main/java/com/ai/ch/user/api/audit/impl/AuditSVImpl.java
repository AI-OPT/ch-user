package com.ai.ch.user.api.audit.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.audit.interfaces.IAuditSV;
import com.ai.ch.user.api.audit.params.InsertAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoResponse;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoResponse;
import com.ai.ch.user.api.shopinfo.impl.ShopInfoSVImpl;
import com.ai.ch.user.service.business.interfaces.ICtAuditBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

@Component
@Service
public class AuditSVImpl implements IAuditSV {

	
	private static final Logger LOG = LoggerFactory.getLogger(ShopInfoSVImpl.class);
	
	@Autowired
	private ICtAuditBusiSV ctAuditBusiSV;

	@Override
	public BaseResponse insertAuditInfo(InsertAuditInfoRequest request) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = null;
		try {
			ctAuditBusiSV.insertAuditInfo(request);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		} catch (BusinessException e) {
			LOG.error("保存失败,原因"+JSON.toJSONString(e));
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryAuditInfoResponse queryAuditInfo(QueryAuditInfoRequest request)
			throws BusinessException, SystemException {
		QueryAuditInfoResponse response = new QueryAuditInfoResponse();
		ResponseHeader responseHeader = null;
		try {
			response = ctAuditBusiSV.queryAuditInfo(request);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		} catch (BusinessException e) {
			responseHeader = new ResponseHeader(false, e.getErrorCode(),e.getErrorMessage());
			LOG.error("查询失败"+JSON.toJSONString(e));
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryAuditLogInfoResponse queryAuditLogInfo(QueryAuditLogInfoRequest request)
			throws BusinessException, SystemException {
		QueryAuditLogInfoResponse response = new QueryAuditLogInfoResponse();
		ResponseHeader responseHeader = null;
		try {
			response = ctAuditBusiSV.queryAuditLogInfo(request);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		} catch (BusinessException e) {
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
			LOG.error("操作失败"+JSON.toJSONString(e));
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
