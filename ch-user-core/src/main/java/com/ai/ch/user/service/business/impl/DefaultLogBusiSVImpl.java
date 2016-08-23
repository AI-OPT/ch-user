package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.defaultlog.params.DefaultLogVo;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;
import com.ai.ch.user.service.atom.interfaces.IDefaultLogAtomSV;
import com.ai.ch.user.service.business.interfaces.IDefaultLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class DefaultLogBusiSVImpl implements IDefaultLogBusiSV {

	@Autowired
	private IDefaultLogAtomSV defaultLogAtomSV;
	
	@Override
	public int insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException {
		ShopDefaultLog shopDefaultLog = new ShopDefaultLog();
		BeanUtils.copyProperties(request, shopDefaultLog);
		return defaultLogAtomSV.insert(shopDefaultLog);
	}

	@Override
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException {
		QueryDefaultLogResponse response = new QueryDefaultLogResponse();
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		int count =defaultLogAtomSV.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart(request.getPageNo());
		example.setLimitEnd((request.getPageNo()-1)*request.getPageSize());
		List<ShopDefaultLog> list = defaultLogAtomSV.selectByExample(example);
		List<DefaultLogVo> responseList = new ArrayList<DefaultLogVo>();
		for (ShopDefaultLog shopDefaultLog : list) {
			DefaultLogVo defaultLogVo = new DefaultLogVo();
			BeanUtils.copyProperties(shopDefaultLog, defaultLogVo);
			responseList.add(defaultLogVo);
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
