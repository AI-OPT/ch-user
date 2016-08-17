package com.ai.ch.user.api.score.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.InsertScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreResponse;
import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiResponse;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogResponse;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;

/**
 * 供货商评价
 * Date: 2016年8月11日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Path("/scoreservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IScoreSV {

	/**
	 * 供应商综合评分查询
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0001
	 * @RestRelativeURL scoreservice/queryCurrentScore
	 */
	@POST
	@Path("/queryCurrentScore")
	public QueryCurrentScoreResponse queryCurrentScore(QueryCurrentScoreRequest request)
			throws BusinessException, SystemException;

	/**
	 * 记录供货商评分
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0002
	 * @RestRelativeURL scoreservice/insertScoreLog
	 */
	@POST
	@Path("/insertScoreLog")
	public BaseResponse insertScoreLog(InsertScoreLogRequest request) throws BusinessException, SystemException;

	/**
	 * 供应商评分指标查询
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_0003
	 * @RestRelativeURL scoreservice/queryScoreKpi
	 */
	@POST
	@Path("/queryScoreKpi")
	public QueryScoreKpiResponse queryScoreKpi(QueryScoreKpiRequest request) throws BusinessException, SystemException;

	/**
	 * 保存当前评分
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00001
	 * @RestRelativeURL scoreservice/insertCurrentScore
	 */
	@POST
	@Path("/insertCurrentScore")
	public BaseResponse insertCurrentScore(InsertCurrentScoreRequest request) throws BusinessException, SystemException;

	/**
	 * 更新当前评分
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00002
	 * @RestRelativeURL scoreservice/updateCurrentScore
	 */
	@POST
	@Path("/updateCurrentScore")
	public BaseResponse updateCurrentScore(UpdateCurrentScoreRequest request) throws BusinessException, SystemException;

	/**
	 * 查询评分记录
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangqiang7
	 * @ApiCode COMM_TENANT_00003
	 * @RestRelativeURL scoreservice/queryScoreLog
	 */
	@POST
	@Path("/queryScoreLog")
	public QueryScoreLogResponse queryScoreLog(QueryScoreLogRequest request) throws BusinessException, SystemException;
}