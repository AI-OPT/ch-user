package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopStatDataMapper {
    int countByExample(ShopStatDataCriteria example);

    int deleteByExample(ShopStatDataCriteria example);

    int insert(ShopStatData record);

    int insertSelective(ShopStatData record);

    List<ShopStatData> selectByExample(ShopStatDataCriteria example);

    int updateByExampleSelective(@Param("record") ShopStatData record, @Param("example") ShopStatDataCriteria example);

    int updateByExample(@Param("record") ShopStatData record, @Param("example") ShopStatDataCriteria example);
}