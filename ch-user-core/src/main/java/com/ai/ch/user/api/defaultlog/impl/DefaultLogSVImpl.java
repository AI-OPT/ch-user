package com.ai.ch.user.api.defaultlog.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.IDefaultLogBusiSV;
import com.ai.ch.user.util.ValidateUtils;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class DefaultLogSVImpl implements IDefaultLogSV {

	private static final Log LOG = LogFactory.getLog(DefaultLogSVImpl.class);

	@Autowired
	private IDefaultLogBusiSV defaultLogBusiSV;

	@Override
	public InsertDefaultLogResponse insertDefaultLog(InsertDefaultLogRequest request)
			throws SystemException, BusinessException {
		InsertDefaultLogResponse response = new InsertDefaultLogResponse();
		ResponseHeader responseHeader = null;
		String serialCode = "";
		try {
			serialCode = defaultLogBusiSV.insertDefaultLog(request);
			responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		} catch (Exception e) {
			LOG.error("操作失败", e);
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
		ResponseHeader responseHeader = null;
		try {
			ValidateUtils.validatQueryDefaultLog(request);
			response = defaultLogBusiSV.queryDefaultLog(request);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		} catch (BusinessException e) {
			LOG.error("操作失败", e);
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryFullDefaultLogResponse queryFullDefaultLog(QueryFullDefaultLogRequest request)
			throws SystemException, BusinessException {
		QueryFullDefaultLogResponse response = new QueryFullDefaultLogResponse();
		ResponseHeader responseHeader = null;
		try {
			ValidateUtils.validatQueryFullDefaultLog(request);
			response = defaultLogBusiSV.queryFullDefaultLog(request);
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
		} catch (BusinessException e) {
			LOG.error("操作失败", e);
			responseHeader = new ResponseHeader(false, e.getErrorCode(), e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
