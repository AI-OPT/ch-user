package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtScoreLog;
import com.ai.ch.user.dao.mapper.bo.CtScoreLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtScoreLogMapper {
    int countByExample(CtScoreLogCriteria example);

    int deleteByExample(CtScoreLogCriteria example);

    int insert(CtScoreLog record);

    int insertSelective(CtScoreLog record);

    List<CtScoreLog> selectByExample(CtScoreLogCriteria example);

    int updateByExampleSelective(@Param("record") CtScoreLog record, @Param("example") CtScoreLogCriteria example);

    int updateByExample(@Param("record") CtScoreLog record, @Param("example") CtScoreLogCriteria example);
}