package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.dao.mapper.bo.CtScoreLogCriteria;

public interface IScoreLogAtomSV {
	int countByExample(CtScoreLogCriteria example);

	int insert(CtScoreLog record);

	List<CtScoreLog> selectByExample(CtScoreLogCriteria example);

	List<CtScoreLog> queryScoreLog(String tenantId, String userId, int startPage, int endPage);

	int queryCountScoreLog(String tenantId, String userId);
	
	List<CtScoreLog> selectScoreLogMax(String tenantId,String userId);
}
