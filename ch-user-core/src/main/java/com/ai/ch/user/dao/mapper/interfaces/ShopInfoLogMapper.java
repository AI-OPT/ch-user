package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoLogMapper {
    int countByExample(ShopInfoLogCriteria example);

    int deleteByExample(ShopInfoLogCriteria example);

    int insert(ShopInfoLog record);

    int insertSelective(ShopInfoLog record);

    List<ShopInfoLog> selectByExample(ShopInfoLogCriteria example);

    int updateByExampleSelective(@Param("record") ShopInfoLog record, @Param("example") ShopInfoLogCriteria example);

    int updateByExample(@Param("record") ShopInfoLog record, @Param("example") ShopInfoLogCriteria example);
}