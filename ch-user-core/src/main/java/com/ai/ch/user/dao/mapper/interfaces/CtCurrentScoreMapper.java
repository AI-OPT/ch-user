package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtCurrentScore;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScoreCriteria;
import com.ai.ch.user.dao.mapper.bo.CtCurrentScoreKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtCurrentScoreMapper {
    int countByExample(CtCurrentScoreCriteria example);

    int deleteByExample(CtCurrentScoreCriteria example);

    int deleteByPrimaryKey(CtCurrentScoreKey key);

    int insert(CtCurrentScore record);

    int insertSelective(CtCurrentScore record);

    List<CtCurrentScore> selectByExample(CtCurrentScoreCriteria example);

    CtCurrentScore selectByPrimaryKey(CtCurrentScoreKey key);

    int updateByExampleSelective(@Param("record") CtCurrentScore record, @Param("example") CtCurrentScoreCriteria example);

    int updateByExample(@Param("record") CtCurrentScore record, @Param("example") CtCurrentScoreCriteria example);

    int updateByPrimaryKeySelective(CtCurrentScore record);

    int updateByPrimaryKey(CtCurrentScore record);
}