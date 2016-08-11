package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.dao.mapper.bo.CtScoreLogCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IScoreLogAtomSV;

@Component
public class ScoreLogAtomSVImpl implements IScoreLogAtomSV {

	@Override
	public int countByExample(CtScoreLogCriteria example) {
		return MapperFactory.getCtScoreLogMapper().countByExample(example);
	}

	@Override
	public int insert(CtScoreLog record) {
		return MapperFactory.getCtScoreLogMapper().insert(record);
	}

	@Override
	public List<CtScoreLog> selectByExample(CtScoreLogCriteria example) {
		return MapperFactory.getCtScoreLogMapper().selectByExample(example);
	}

	@Override
	public List<CtScoreLog> queryScoreLog(String tenantId, String userId, int startPage, int endPage) {
		return MapperFactory.getCtScoreLogAttachMapper().queryScoreLog(tenantId, userId, startPage, endPage);
	}

	@Override
	public int queryCountScoreLog(String tenantId, String userId) {
		return MapperFactory.getCtScoreLogAttachMapper().queryCountScoreLog(tenantId, userId);
	}

}
