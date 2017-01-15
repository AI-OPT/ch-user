package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtAuditLog;
import com.ai.ch.user.dao.mapper.bo.CtAuditLogCriteria;
import com.ai.ch.user.vo.CtAuditLogVo;

public interface ICtAuditLogAtomSV {

	int countByExample(CtAuditLogCriteria example);

	int insertSelective(CtAuditLog record);

	List<CtAuditLog> selectByExample(CtAuditLogCriteria example);

	List<CtAuditLog> selectByLike(CtAuditLogVo record);
	
	int countByLike(CtAuditLogVo record);
	
}
