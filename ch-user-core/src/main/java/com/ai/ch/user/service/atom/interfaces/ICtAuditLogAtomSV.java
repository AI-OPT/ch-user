package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtAuditLog;
import com.ai.ch.user.dao.mapper.bo.CtAuditLogCriteria;

public interface ICtAuditLogAtomSV {

	int countByExample(CtAuditLogCriteria example);

	int insertSelective(CtAuditLog record);

	List<CtAuditLog> selectByExample(CtAuditLogCriteria example);
}
