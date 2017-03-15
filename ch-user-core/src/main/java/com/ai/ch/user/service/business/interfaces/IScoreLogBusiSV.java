package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.CountScoreAvgRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IScoreLogBusiSV {

	/**
	 * 查询评分日志
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryScoreLogResponse queryScoreLog(QueryScoreLogRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询综合评分
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public float countScoreAvg(CountScoreAvgRequest request) throws BusinessException, SystemException;
}
