package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.ShopStatData;
import com.ai.ch.user.dao.mapper.bo.ShopStatDataCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IShopStatDataAtomSV;

@Component
public class ShopStatDataAtomSVImpl implements IShopStatDataAtomSV {

	@Override
	public int insert(ShopStatData record) {
		return MapperFactory.getShopStatDataMapper().insert(record);
	}

	@Override
	public List<ShopStatData> selectByExample(ShopStatDataCriteria example) {
		return MapperFactory.getShopStatDataMapper().selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(ShopStatData record, ShopStatDataCriteria example) {
		return MapperFactory.getShopStatDataMapper().updateByExampleSelective(record, example);
	}

}
