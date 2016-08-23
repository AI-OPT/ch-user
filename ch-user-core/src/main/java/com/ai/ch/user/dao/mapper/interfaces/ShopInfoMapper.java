package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInfoMapper {
    int countByExample(ShopInfoCriteria example);

    int deleteByExample(ShopInfoCriteria example);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    List<ShopInfo> selectByExample(ShopInfoCriteria example);

    int updateByExampleSelective(@Param("record") ShopInfo record, @Param("example") ShopInfoCriteria example);

    int updateByExample(@Param("record") ShopInfo record, @Param("example") ShopInfoCriteria example);
}