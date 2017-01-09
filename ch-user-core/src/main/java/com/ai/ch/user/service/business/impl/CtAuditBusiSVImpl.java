package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.audit.params.AuditLogVo;
import com.ai.ch.user.api.audit.params.InsertAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoResponse;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoResponse;
import com.ai.ch.user.dao.mapper.bo.CtAudit;
import com.ai.ch.user.dao.mapper.bo.CtAuditCriteria;
import com.ai.ch.user.dao.mapper.bo.CtAuditLog;
import com.ai.ch.user.dao.mapper.bo.CtAuditLogCriteria;
import com.ai.ch.user.service.atom.interfaces.ICtAuditAtomSV;
import com.ai.ch.user.service.atom.interfaces.ICtAuditLogAtomSV;
import com.ai.ch.user.service.business.interfaces.ICtAuditBusiSV;
import com.ai.ch.user.util.SequenceUtil;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.alibaba.fastjson.JSON;
import com.esotericsoftware.minlog.Log;

@Component
@Transactional
public class CtAuditBusiSVImpl implements ICtAuditBusiSV {

	@Autowired
	private ICtAuditAtomSV ctAuditAtomSV;

	@Autowired
	private ICtAuditLogAtomSV ctAuditLogAtomSV;

	@Override
	public int insertAuditInfo(InsertAuditInfoRequest request) throws BusinessException, SystemException {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "租户id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
		CtAuditCriteria example = new CtAuditCriteria();
		CtAuditCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		CtAudit ctAudit = new CtAudit();
		BeanUtils.copyProperties(request, ctAudit);
		ctAudit.setAuditTime(DateUtil.getSysDate());
		if (ctAuditAtomSV.selectByExample(example).isEmpty()) {
			try {
				ctAuditAtomSV.insertSelective(ctAudit);
			} catch (Exception e) {
				throw new BusinessException(e.getMessage(), "保存审核记录失败");
			}
		}else{
			try {
				ctAuditAtomSV.updateByExampleSelective(ctAudit, example);
			} catch (Exception e) {
				throw new BusinessException(e.getMessage(), "更新审核记录失败");
			}
		}
		CtAuditLog ctAuditLog = new CtAuditLog();
		BeanUtils.copyProperties(ctAudit, ctAuditLog);
		ctAuditLog.setLogId(SequenceUtil.createLogId());
		try {
			ctAuditLogAtomSV.insertSelective(ctAuditLog);
		} catch (Exception e) {
			Log.error("保存审核日志记录失败,原因"+JSON.toJSONString(e));
			throw new BusinessException(e.getMessage(), "保存审核日志记录失败");
		}
		return 0;
	}

	@Override
	public QueryAuditInfoResponse queryAuditInfo(QueryAuditInfoRequest request)
			throws BusinessException, SystemException {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "租户id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "用户id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
		CtAuditCriteria example = new CtAuditCriteria();
		CtAuditCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andUserIdEqualTo(request.getUserId());
		QueryAuditInfoResponse response  = null;
		List<CtAudit> list = null;
		try{
		list = ctAuditAtomSV.selectByExample(example);
		response = new QueryAuditInfoResponse();
		}catch(Exception e){
			Log.error("查询失败,原因"+JSON.toJSONString(e));
		}
		if (!list.isEmpty()) {
			BeanUtils.copyProperties(list.get(0), response);
		}
		return response;
	}

	@Override
	public QueryAuditLogInfoResponse queryAuditLogInfo(QueryAuditLogInfoRequest request)
			throws BusinessException, SystemException {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "租户id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}

		CtAuditLogCriteria example = new CtAuditLogCriteria();
		CtAuditLogCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andCtTypeEqualTo(request.getCtType());
		example.setOrderByClause("AUDIT_TIME desc");
		if (request.getBeginTime() != null) {
			criteria.andAuditTimeGreaterThan(request.getBeginTime());
		}
		if(request.getUserName()!=null){
			criteria.andUserNameEqualTo(request.getUserName());
		}
		if (request.getEndTime() != null) {
			criteria.andAuditTimeLessThan(request.getEndTime());
		}
		QueryAuditLogInfoResponse response = new QueryAuditLogInfoResponse();
		try{
		int count = ctAuditLogAtomSV.countByExample(example);
		int pageCount = count / request.getPageNo() + (count % request.getPageSize() > 0 ? 1 : 0);
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());

		List<CtAuditLog> list = ctAuditLogAtomSV.selectByExample(example);
		/*if (list.isEmpty()) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "查询结果为空");
		}*/
		List<AuditLogVo> responseList = new ArrayList<>();
		for (CtAuditLog ctAuditLog : list) {
			AuditLogVo auditLogVo = new AuditLogVo();
			BeanUtils.copyProperties(ctAuditLog, auditLogVo);
			responseList.add(auditLogVo);
		}
		PageInfo<AuditLogVo> pageInfo = new PageInfo<>();
		pageInfo.setCount(count);
		pageInfo.setPageCount(pageCount);
		pageInfo.setPageNo(request.getPageNo());
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(responseList);
		response.setPageInfo(pageInfo);
		}catch(Exception e){
			Log.error("查询失败,原因"+JSON.toJSONString(e));
		}
		return response;
	}

}
