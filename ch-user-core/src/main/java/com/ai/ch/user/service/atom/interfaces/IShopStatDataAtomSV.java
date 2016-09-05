package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;

public interface IShopStatDataAtomSV {
	int insert(ShopStatData record);

	List<ShopStatData> selectByExample(ShopStatDataCriteria example);

	int updateByExampleSelective(@Param("record") ShopStatData record, @Param("example") ShopStatDataCriteria example);

}
