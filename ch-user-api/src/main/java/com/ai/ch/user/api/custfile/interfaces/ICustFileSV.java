package com.ai.ch.user.api.custfile.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 用户附件信息表
 * Date: 2016年8月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/custfileservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ICustFileSV {

	/**
	 * 保存用户附件表
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00100
	 * @RestRelativeURL custfileservice/insertCustFileExt
	 */
	@POST
	@Path("/insertCustFileExt")
	public BaseResponse insertCustFileExt(InsertCustFileExtRequest request) throws SystemException, BusinessException;

	/**
	 * 查询用户附件表
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00101
	 * @RestRelativeURL custfileservice/queryCustFileExt
	 */
	@POST
	@Path("/queryCustFileExt")
	public QueryCustFileExtResponse queryCustFileExt(QueryCustFileExtRequest request)
			throws SystemException, BusinessException;

	/**
	 * 更新用户附件表
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00102
	 * @RestRelativeURL custfileservice/updateCustFileExt
	 */
	@POST
	@Path("/updateCustFileExt")
	public BaseResponse updateCustFileExt(UpdateCustFileExtRequest request) throws SystemException, BusinessException;
	
	/**
	 * 更新用户附件表
	 * @param request
	 * @return
	 * @throws SystemException
	 * @throws BusinessException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00102
	 * @RestRelativeURL custfileservice/updateCustFileExtBycondition
	 */
	@POST
	@Path("/updateCustFileExtBycondition")
	public BaseResponse updateCustFileExtBycondition(UpdateCustFileExtRequest request) throws SystemException, BusinessException;
}
