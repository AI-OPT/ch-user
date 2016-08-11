package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.InsertScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogRequest;
import com.ai.ch.user.api.score.param.QueryScoreLogResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IScoreLogBusiSV {

	public int insertScoreLog(InsertScoreLogRequest request) throws BusinessException, SystemException;

	public QueryScoreLogResponse queryScoreLog(QueryScoreLogRequest request) throws BusinessException, SystemException;
}
