package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDefaultLogMapper {
    int countByExample(ShopDefaultLogCriteria example);

    int deleteByExample(ShopDefaultLogCriteria example);

    int deleteByPrimaryKey(String serialCode);

    int insert(ShopDefaultLog record);

    int insertSelective(ShopDefaultLog record);

    List<ShopDefaultLog> selectByExample(ShopDefaultLogCriteria example);

    ShopDefaultLog selectByPrimaryKey(String serialCode);

    int updateByExampleSelective(@Param("record") ShopDefaultLog record, @Param("example") ShopDefaultLogCriteria example);

    int updateByExample(@Param("record") ShopDefaultLog record, @Param("example") ShopDefaultLogCriteria example);

    int updateByPrimaryKeySelective(ShopDefaultLog record);

    int updateByPrimaryKey(ShopDefaultLog record);
}