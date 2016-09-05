package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtDepositRule;
import com.ai.ch.user.dao.mapper.bo.CtDepositRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtDepositRuleMapper {
    int countByExample(CtDepositRuleCriteria example);

    int deleteByExample(CtDepositRuleCriteria example);

    int insert(CtDepositRule record);

    int insertSelective(CtDepositRule record);

    List<CtDepositRule> selectByExample(CtDepositRuleCriteria example);

    int updateByExampleSelective(@Param("record") CtDepositRule record, @Param("example") CtDepositRuleCriteria example);

    int updateByExample(@Param("record") CtDepositRule record, @Param("example") CtDepositRuleCriteria example);
}