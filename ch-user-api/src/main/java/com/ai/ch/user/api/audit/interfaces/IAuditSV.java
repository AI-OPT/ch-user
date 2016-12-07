package com.ai.ch.user.api.audit.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.audit.params.InsertAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoResponse;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 资质审核记录服务 Date: 2016年12月7日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */

@Path("/auditservice")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IAuditSV {

	/**
	 * 保存资质审核信息
	 * 
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_AUDIT_00001
	 * @RestRelativeURL auditservice/insertAuditInfo
	 */
	@POST
	@Path("/insertAuditInfo")
	public BaseResponse insertAuditInfo(InsertAuditInfoRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询资质审核信息
	 * 
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_AUDIT_00002
	 * @RestRelativeURL auditservice/queryAuditInfo
	 */
	@POST
	@Path("/queryAuditInfo")
	public QueryAuditInfoResponse queryAuditInfo(QueryAuditInfoRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询资质审核日志
	 * 
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_AUDIT_00003
	 * @RestRelativeURL auditservice/queryAuditLogInfo
	 */
	@POST
	@Path("/queryAuditLogInfo")
	public QueryAuditLogInfoResponse queryAuditLogInfo(QueryAuditLogInfoRequest request) throws BusinessException, SystemException;


}
