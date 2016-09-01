package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.shopinfo.params.InsertShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoLogResponse;
import com.ai.ch.user.api.shopinfo.params.ShopInfoLogVo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLog;
import com.ai.ch.user.dao.mapper.bo.ShopInfoLogCriteria;
import com.ai.ch.user.service.atom.interfaces.IShopInfoLogAtomSV;
import com.ai.ch.user.service.business.interfaces.IShopInfoLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.util.DateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class ShopInfoLogBusiSV implements IShopInfoLogBusiSV{

	@Autowired
	private IShopInfoLogAtomSV shopInfoLogAtomSV;
	
	@Override
	public int insertShopInfoLog(InsertShopInfoLogRequest request) throws BusinessException, SystemException {
		ShopInfoLog shopInfoLog = new ShopInfoLog();
		BeanUtils.copyProperties(request, shopInfoLog);
		shopInfoLog.setUpdateTime(DateUtil.getSysDate());
		return shopInfoLogAtomSV.insert(shopInfoLog);
	}

	@Override
	public QueryShopInfoLogResponse queryShopInfoLog(QueryShopInfoLogRequest request)
			throws BusinessException, SystemException {
		ShopInfoLogCriteria example = new ShopInfoLogCriteria();
		ShopInfoLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		List<ShopInfoLog> list = shopInfoLogAtomSV.selectByExample(example);
		QueryShopInfoLogResponse response = new QueryShopInfoLogResponse();
		List<ShopInfoLogVo> responseList = new ArrayList<ShopInfoLogVo>();
		for (ShopInfoLog shopInfoLog : list) {
			ShopInfoLogVo shopInfoLogVo = new ShopInfoLogVo();
			BeanUtils.copyProperties(shopInfoLog, shopInfoLogVo);
			responseList.add(shopInfoLogVo);
		}
		response.setList(responseList);
		return response;
	}

	
}
