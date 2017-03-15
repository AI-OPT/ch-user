package com.ai.ch.user.service.atom.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.defaultlog.params.DefaultLogVo;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.IDefaultLogAtomSV;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;

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

	@Override
	public QueryFullDefaultLogResponse selectPageDefaultLog(QueryFullDefaultLogRequest request) {
		QueryFullDefaultLogResponse response = new QueryFullDefaultLogResponse();
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		
		if(!StringUtil.isBlank(request.getUserId())){
			criteria.andUserIdEqualTo(request.getUserId().trim());
		}
		if((!StringUtil.isBlank(request.getBeginTime())&&(!StringUtil.isBlank(request.getEndTime())))){
			criteria.andDeductDateBetween(Timestamp.valueOf(request.getBeginTime()), Timestamp.valueOf(request.getEndTime()));
		}else if(!StringUtil.isBlank(request.getBeginTime())&&StringUtil.isBlank(request.getEndTime())){
			criteria.andDeductDateGreaterThanOrEqualTo(Timestamp.valueOf(request.getBeginTime()));
		}else if(StringUtil.isBlank(request.getBeginTime())&&(!StringUtil.isBlank(request.getEndTime()))){
			criteria.andDeductDateLessThanOrEqualTo(Timestamp.valueOf(request.getEndTime()));
		}
		
		int count =this.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart((request.getPageNo()-1)*request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		example.setOrderByClause("DEDUCT_DATE desc");
		List<ShopDefaultLog> list = this.selectByExample(example);
		List<DefaultLogVo> responseList = new ArrayList<DefaultLogVo>();
		if(!CollectionUtil.isEmpty(list)){
		for (ShopDefaultLog shopDefaultLog : list) {
			DefaultLogVo defaultLogVo = new DefaultLogVo();
			BeanUtils.copyProperties(shopDefaultLog, defaultLogVo);
			responseList.add(defaultLogVo);
			}
		}
		PageInfo<DefaultLogVo> pageInfo = new PageInfo<DefaultLogVo>();
		pageInfo.setCount(count);
		pageInfo.setPageCount(pageCount);
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(responseList);
		response.setPageInfo(pageInfo);
		return response;
	}

	@Override
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request) {
		QueryDefaultLogResponse response = new QueryDefaultLogResponse();
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId().trim());
		int count =this.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart((request.getPageNo()-1)*request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		example.setOrderByClause("DEDUCT_DATE desc");
		List<ShopDefaultLog> list = this.selectByExample(example);
		List<DefaultLogVo> responseList = new ArrayList<DefaultLogVo>();
		if(!CollectionUtil.isEmpty(list)){
		for (ShopDefaultLog shopDefaultLog : list) {
			DefaultLogVo defaultLogVo = new DefaultLogVo();
			BeanUtils.copyProperties(shopDefaultLog, defaultLogVo);
			responseList.add(defaultLogVo);
			}
		}
		PageInfo<DefaultLogVo> pageInfo = new PageInfo<DefaultLogVo>();
		pageInfo.setCount(count);
		pageInfo.setPageCount(pageCount);
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(responseList);
		response.setPageInfo(pageInfo);
		return response;
	}

}
