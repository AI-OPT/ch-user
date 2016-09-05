package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IShopScoreKpiAtomSV;

@Component
public class ShopScoreKpiAtomSVImpl implements IShopScoreKpiAtomSV {

	@Override
	public List<ShopScoreKpi> selectByExample(ShopScoreKpiCriteria example) {
		return MapperFactory.getShopScoreKpiMapper().selectByExample(example);
	}

}
