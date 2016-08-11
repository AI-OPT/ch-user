package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtScoreKpi;
import com.ai.ch.user.dao.mapper.bo.CtScoreKpiCriteria;

public interface IScoreKpiAtomSV {

	List<CtScoreKpi> selectByExample(CtScoreKpiCriteria example);
}
