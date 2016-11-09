package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.defaultlog.params.DefaultLogVo;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogResponse;
import com.ai.ch.user.constants.SequenceCodeConstants.UserSequenceCode;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLog;
import com.ai.ch.user.dao.mapper.bo.ShopDefaultLogCriteria;
import com.ai.ch.user.service.atom.interfaces.IDefaultLogAtomSV;
import com.ai.ch.user.service.business.interfaces.IDefaultLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.StringUtil;

@Component
@Transactional
public class DefaultLogBusiSVImpl implements IDefaultLogBusiSV {

	@Autowired
	private IDefaultLogAtomSV defaultLogAtomSV;
	
	@Override
	public String insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException {
		ShopDefaultLog shopDefaultLog = new ShopDefaultLog();
		BeanUtils.copyProperties(request, shopDefaultLog);
		shopDefaultLog.setSerialCode(SeqUtil.getNewId(UserSequenceCode.SHOP_DEFAULT_LOG$SERIAL_CODE_ID$SEQ,17));
		defaultLogAtomSV.insert(shopDefaultLog);
		return shopDefaultLog.getSerialCode();
	}

	@Override
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException {
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException("获取参数失败:租户id不能为空");
		}
		if(StringUtil.isBlank(request.getUserId())){
			throw new BusinessException("获取参数失败:用户id不能为空");
		}
		QueryDefaultLogResponse response = new QueryDefaultLogResponse();
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId().trim());
		int count =defaultLogAtomSV.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart((request.getPageNo()-1)*request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		example.setOrderByClause("DEDUCT_DATE desc");
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

	@Override
	public int deleteDefaultLog(String serialCode) throws SystemException,
			BusinessException {
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andSerialCodeEqualTo(serialCode);
		int count =defaultLogAtomSV.deleteDefaultLog(example);
		return count;
	}

	@Override
	public QueryFullDefaultLogResponse queryFullDefaultLog(QueryFullDefaultLogRequest request)
			throws SystemException, BusinessException {
		if(StringUtil.isBlank(request.getTenantId())){
			throw new BusinessException("获取参数失败:租户id不能为空");
		}
		QueryFullDefaultLogResponse response = new QueryFullDefaultLogResponse();
		ShopDefaultLogCriteria example = new ShopDefaultLogCriteria();
		ShopDefaultLogCriteria.Criteria criteria = example.createCriteria();
		
		if(!StringUtil.isBlank(request.getUserId())){
			criteria.andUserIdEqualTo(request.getUserId().trim());
		}
		if(request.getBeginTime()!=null&&request.getEndTime()!=null){
			criteria.andDeductDateBetween(request.getBeginTime(), request.getEndTime());
		}
		
		int count =defaultLogAtomSV.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart((request.getPageNo()-1)*request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		example.setOrderByClause("DEDUCT_DATE desc");
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
