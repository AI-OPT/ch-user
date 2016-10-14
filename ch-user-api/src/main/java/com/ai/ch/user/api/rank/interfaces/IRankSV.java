package com.ai.ch.user.api.rank.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 店铺评级 Date: 2016年8月17日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/rankservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IRankSV {

	/**
	 * 店铺评级规则设置
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00016
	 * @RestRelativeURL rankservice/insertRankRule
	 */
	@POST
	@Path("/insertRankRule")
	public BaseResponse insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException;

	/**
	 * 更新店铺评级设置
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode ChGrade-0002
	 * @RestRelativeURL rankservice/updateRankRule
	 */
	@POST
	@Path("/updateRankRule")
	public BaseResponse updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException;

	/**
	 * 店铺评级规则查询
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0007
	 * @RestRelativeURL rankservice/queryRankRule
	 */
	@POST
	@Path("/queryRankRule")
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request)
			throws BusinessException, SystemException;
}
