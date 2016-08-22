package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ai.ch.user.dao.mapper.bo.CmCustFileExt;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExtCriteria;

public interface ICustFileAtomSV {

    int insert(CmCustFileExt record);

    int updateByExample(@Param("record") CmCustFileExt record, @Param("example") CmCustFileExtCriteria example);
    
    List<CmCustFileExt> selectByExample(CmCustFileExtCriteria example);
    
    int deleteByExample(CmCustFileExtCriteria example);
    
}
