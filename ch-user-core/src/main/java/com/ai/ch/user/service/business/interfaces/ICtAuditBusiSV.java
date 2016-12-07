package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.audit.params.InsertAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoResponse;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface ICtAuditBusiSV {

	public int insertAuditInfo(InsertAuditInfoRequest request) throws BusinessException, SystemException;

	public QueryAuditInfoResponse queryAuditInfo(QueryAuditInfoRequest request) throws BusinessException, SystemException;

	public QueryAuditLogInfoResponse queryAuditLogInfo(QueryAuditLogInfoRequest request)
			throws BusinessException, SystemException;

}
