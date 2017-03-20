package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.score.param.InsertCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreRequest;
import com.ai.ch.user.api.score.param.QueryCurrentScoreResponse;
import com.ai.ch.user.api.score.param.UpdateCurrentScoreRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface ICurrentScoreBusiSV {
	/**
	 * 获取评分记录
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryCurrentScoreResponse queryCurrentScore(QueryCurrentScoreRequest request)
			throws BusinessException, SystemException;

	/**
	 * 保存评分记录
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public void insertCurrentScore(InsertCurrentScoreRequest request) throws BusinessException, SystemException;

	/**
	 * 更新评分记录
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int updateCurrentScore(UpdateCurrentScoreRequest request) throws BusinessException, SystemException;
}
