package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopRankRule;
import com.ai.ch.user.dao.mapper.bo.ShopRankRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopRankRuleMapper {
    int countByExample(ShopRankRuleCriteria example);

    int deleteByExample(ShopRankRuleCriteria example);

    int insert(ShopRankRule record);

    int insertSelective(ShopRankRule record);

    List<ShopRankRule> selectByExample(ShopRankRuleCriteria example);

    int updateByExampleSelective(@Param("record") ShopRankRule record, @Param("example") ShopRankRuleCriteria example);

    int updateByExample(@Param("record") ShopRankRule record, @Param("example") ShopRankRuleCriteria example);
}