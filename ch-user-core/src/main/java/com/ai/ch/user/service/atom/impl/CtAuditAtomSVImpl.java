package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtAudit;
import com.ai.ch.user.dao.mapper.bo.CtAuditCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.ICtAuditAtomSV;

@Component
public class CtAuditAtomSVImpl implements ICtAuditAtomSV {

	@Override
	public int countByExample(CtAuditCriteria example) {
		return MapperFactory.getCtAuditMapper().countByExample(example);
	}

	@Override
	public int insertSelective(CtAudit record) {
		return MapperFactory.getCtAuditMapper().insertSelective(record);
	}

	@Override
	public List<CtAudit> selectByExample(CtAuditCriteria example) {
		return MapperFactory.getCtAuditMapper().selectByExample(example);
	}

}
