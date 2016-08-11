package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtCurrentScore;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScoreCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.ICurrentScoreAtomSV;

@Component
public class CurrentScoreAtomSVImpl implements ICurrentScoreAtomSV {

	@Override
	public int insert(CtCurrentScore record) {
		return MapperFactory.getCtCurrentScoreMapper().insert(record);
	}

	@Override
	public List<CtCurrentScore> selectByExample(CtCurrentScoreCriteria example) {
		return MapperFactory.getCtCurrentScoreMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(CtCurrentScore record, CtCurrentScoreCriteria example) {
		return MapperFactory.getCtCurrentScoreMapper().updateByExample(record, example);
	}

}
