package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.QueryScoreKpiRequest;
import com.ai.ch.user.api.score.param.QueryScoreKpiResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IScoreKpiBusiSV {

	public QueryScoreKpiResponse queryScoreKpi(QueryScoreKpiRequest request) throws BusinessException, SystemException;
}
