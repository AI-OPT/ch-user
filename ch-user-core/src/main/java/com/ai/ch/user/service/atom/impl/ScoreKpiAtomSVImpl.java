package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtScoreKpi;
import com.ai.ch.user.dao.mapper.bo.CtScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IScoreKpiAtomSV;

@Component
public class ScoreKpiAtomSVImpl implements IScoreKpiAtomSV {

	@Override
	public List<CtScoreKpi> selectByExample(CtScoreKpiCriteria example) {
		return MapperFactory.getCtScoreKpiMapper().selectByExample(example);
	}

}
