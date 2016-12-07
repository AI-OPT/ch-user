package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtAudit;
import com.ai.ch.user.dao.mapper.bo.CtAuditCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtAuditMapper {
    int countByExample(CtAuditCriteria example);

    int deleteByExample(CtAuditCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(CtAudit record);

    int insertSelective(CtAudit record);

    List<CtAudit> selectByExample(CtAuditCriteria example);

    CtAudit selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") CtAudit record, @Param("example") CtAuditCriteria example);

    int updateByExample(@Param("record") CtAudit record, @Param("example") CtAuditCriteria example);

    int updateByPrimaryKeySelective(CtAudit record);

    int updateByPrimaryKey(CtAudit record);
}