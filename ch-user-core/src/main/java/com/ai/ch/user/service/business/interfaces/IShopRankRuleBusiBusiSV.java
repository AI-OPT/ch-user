package com.ai.ch.user.service.business.interfaces;

import com.ai.ch.user.api.rank.params.InsertRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleRequest;
import com.ai.ch.user.api.rank.params.QueryRankRuleResponse;
import com.ai.ch.user.api.rank.params.UpdateRankRuleRequest;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IShopRankRuleBusiBusiSV {

	public int insertRankRule(InsertRankRuleRequest request) throws BusinessException, SystemException;
	
	public int updateRankRule(UpdateRankRuleRequest request) throws BusinessException, SystemException;
	
	public QueryRankRuleResponse queryRankRule(QueryRankRuleRequest request) throws BusinessException, SystemException;
}
