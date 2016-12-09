package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.CtAudit;
import com.ai.ch.user.dao.mapper.bo.CtAuditCriteria;

public interface ICtAuditAtomSV {

	int countByExample(CtAuditCriteria example);

	int insertSelective(CtAudit record);

	int updateByExampleSelective(@Param("record") CtAudit record, @Param("example") CtAuditCriteria example);

	List<CtAudit> selectByExample(CtAuditCriteria example);
}
