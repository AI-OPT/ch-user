package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IDefaultLogAtomSV;

@Component
public class DefaultLogAtomSVImpl implements IDefaultLogAtomSV {

	@Override
	public int countByExample(ShopDefaultLogCriteria example) {
		return MapperFactory.getShopDefaultLogMapper().countByExample(example);
	}

	@Override
	public int insert(ShopDefaultLog record) {
		return MapperFactory.getShopDefaultLogMapper().insert(record);
	}

	@Override
	public List<ShopDefaultLog> selectByExample(ShopDefaultLogCriteria example) {
		return MapperFactory.getShopDefaultLogMapper().selectByExample(example);
	}

	@Override
	public int deleteDefaultLog(ShopDefaultLogCriteria example) {
		return MapperFactory.getShopDefaultLogMapper().deleteByExample(example);
	}

}
