package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtAuditLog;
import com.ai.ch.user.dao.mapper.bo.CtAuditLogCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.ICtAuditLogAtomSV;

@Component
public class CtAuditLogAtomSVImpl implements ICtAuditLogAtomSV {

	@Override
	public int countByExample(CtAuditLogCriteria example) {
		return MapperFactory.getCtAuditLogMapper().countByExample(example);
	}

	@Override
	public int insertSelective(CtAuditLog record) {
		return MapperFactory.getCtAuditLogMapper().insertSelective(record);
	}

	@Override
	public List<CtAuditLog> selectByExample(CtAuditLogCriteria example) {
		return MapperFactory.getCtAuditLogMapper().selectByExample(example);
	}

	@Override
	public List<CtAuditLog> selectByLike(CtAuditLogCriteria example) {
		return MapperFactory.getCtAuditLogMapper().selectByLike(example);
	}

}
