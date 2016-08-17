package com.ai.ch.user.dao.mapper.interfaces;

import com.ai.ch.user.dao.mapper.bo.CtContractInfo;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CtContractInfoMapper {
    int countByExample(CtContractInfoCriteria example);

    int deleteByExample(CtContractInfoCriteria example);

    int deleteByPrimaryKey(CtContractInfoKey key);

    int insert(CtContractInfo record);

    int insertSelective(CtContractInfo record);

    List<CtContractInfo> selectByExample(CtContractInfoCriteria example);

    CtContractInfo selectByPrimaryKey(CtContractInfoKey key);

    int updateByExampleSelective(@Param("record") CtContractInfo record, @Param("example") CtContractInfoCriteria example);

    int updateByExample(@Param("record") CtContractInfo record, @Param("example") CtContractInfoCriteria example);

    int updateByPrimaryKeySelective(CtContractInfo record);

    int updateByPrimaryKey(CtContractInfo record);
}