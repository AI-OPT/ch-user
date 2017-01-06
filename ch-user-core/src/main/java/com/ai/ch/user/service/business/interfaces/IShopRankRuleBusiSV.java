package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopRankRuleBusiSV {

	/**
	 * 保存店铺等级信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException;
	
	/**
	 * 更新店铺评级信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException;
	
	/**
	 * 查询店铺评级信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request) throws BusinessException, SystemException;
}
