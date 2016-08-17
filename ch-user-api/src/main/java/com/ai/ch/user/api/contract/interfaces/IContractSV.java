package com.ai.ch.user.api.contract.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContactInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseInfo;
import com.ai.opt.base.vo.BaseResponse;


/**
 * Date: 2016年8月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author zhangyh7
 *
 */
@Path("/contractservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IContractSV {
	/**
	 * 记录合同信息
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangyuehong
	 * @ApiCode 
	 * @RestRelativeURL contractservice/insertContractInfo
	 */
	@POST
	@Path("/insertContractInfo")
	public BaseResponse insertContractInfo(ContactInfoRequest  contactRequest)throws BusinessException, SystemException;
	
	/**
	 * 查询合同信息
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangyuehong
	 * @ApiCode 
	 * @RestRelativeURL contractservice/queryContractInfo
	 */
	@POST
	@Path("/queryContractInfo")
	public ContactInfoResponse queryContractInfo(ContactInfoRequest  contactRequest)throws BusinessException, SystemException;
	
}
