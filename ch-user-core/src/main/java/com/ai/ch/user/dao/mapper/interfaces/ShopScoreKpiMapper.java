package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopScoreKpiMapper {
    int countByExample(ShopScoreKpiCriteria example);

    int deleteByExample(ShopScoreKpiCriteria example);

    int insert(ShopScoreKpi record);

    int insertSelective(ShopScoreKpi record);

    List<ShopScoreKpi> selectByExample(ShopScoreKpiCriteria example);

    int updateByExampleSelective(@Param("record") ShopScoreKpi record, @Param("example") ShopScoreKpiCriteria example);

    int updateByExample(@Param("record") ShopScoreKpi record, @Param("example") ShopScoreKpiCriteria example);
}