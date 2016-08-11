package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtScoreKpi;
import com.ai.ch.user.dao.mapper.bo.CtScoreKpiCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtScoreKpiMapper {
    int countByExample(CtScoreKpiCriteria example);

    int deleteByExample(CtScoreKpiCriteria example);

    int insert(CtScoreKpi record);

    int insertSelective(CtScoreKpi record);

    List<CtScoreKpi> selectByExample(CtScoreKpiCriteria example);

    int updateByExampleSelective(@Param("record") CtScoreKpi record, @Param("example") CtScoreKpiCriteria example);

    int updateByExample(@Param("record") CtScoreKpi record, @Param("example") CtScoreKpiCriteria example);
}