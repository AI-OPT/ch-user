package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.ShopScoreKpi;
import com.ai.ch.user.dao.mapper.bo.ShopScoreKpiCriteria;

public interface IShopScoreKpiAtomSV {

	 List<ShopScoreKpi> selectByExample(ShopScoreKpiCriteria example);

}
