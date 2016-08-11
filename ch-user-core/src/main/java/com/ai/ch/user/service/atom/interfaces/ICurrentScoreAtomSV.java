package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.CtCurrentScore;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScoreCriteria;

public interface ICurrentScoreAtomSV {

	int insert(CtCurrentScore record);

	List<CtCurrentScore> selectByExample(CtCurrentScoreCriteria example);

	int updateByExample(@Param("record") CtCurrentScore record, @Param("example") CtCurrentScoreCriteria example);
}
