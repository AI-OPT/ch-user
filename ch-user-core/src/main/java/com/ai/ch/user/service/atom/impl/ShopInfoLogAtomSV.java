package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IShopInfoLogAtomSV;

@Component
public class ShopInfoLogAtomSV implements IShopInfoLogAtomSV {

	@Override
	public int insert(ShopInfoLog record) {
		return MapperFactory.getShopInfoLogMapper().insert(record);
	}

	@Override
	public List<ShopInfoLog> selectByExample(ShopInfoLogCriteria example) {
		return MapperFactory.getShopInfoLogMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(ShopInfoLog record, ShopInfoLogCriteria example) {
		return MapperFactory.getShopInfoLogMapper().updateByExample(record, example);
	}

}
