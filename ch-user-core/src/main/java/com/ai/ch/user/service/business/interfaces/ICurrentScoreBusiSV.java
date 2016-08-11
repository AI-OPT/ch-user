package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreResponse;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface ICurrentScoreBusiSV {

	public QueryCurrentScoreResponse queryCurrentScore(QueryCurrentScoreRequest request)
			throws BusinessException, SystemException;

	public int insertCurrentScore(InsertCurrentScoreRequest request) throws BusinessException, SystemException;

	public int updateCurrentScore(UpdateCurrentScoreRequest request) throws BusinessException, SystemException;
}
