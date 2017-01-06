package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IScoreKpiBusiSV {

	/**
	 * 查询评分kpi
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryScoreKpiResponse queryScoreKpi(QueryScoreKpiRequest request) throws BusinessException, SystemException;
}
