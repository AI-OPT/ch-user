package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtAudit;
import com.ai.ch.user.dao.mapper.bo.CtAuditCriteria;

public interface ICtAuditAtomSV {

	 int countByExample(CtAuditCriteria example);

	 int insertSelective(CtAudit record);

	 List<CtAudit> selectByExample(CtAuditCriteria example);
}
