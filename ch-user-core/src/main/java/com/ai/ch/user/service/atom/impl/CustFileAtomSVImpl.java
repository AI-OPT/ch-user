package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CmCustFileExt;
import com.ai.ch.user.dao.mapper.bo.CmCustFileExtCriteria;
import com.ai.ch.user.dao.mapper.factory.MapperFactory;
import com.ai.ch.user.service.atom.interfaces.ICustFileAtomSV;

@Component
public class CustFileAtomSVImpl implements ICustFileAtomSV {

    @Override
    public int insert(CmCustFileExt record) {
        return MapperFactory.getCmCustFileExtMapper().insert(record);
    }

    @Override
    public List<CmCustFileExt> selectByExample(CmCustFileExtCriteria example) {
        return MapperFactory.getCmCustFileExtMapper().selectByExample(example);
    }


	@Override
	public int updateByExample(CmCustFileExt record, CmCustFileExtCriteria example) {
		return MapperFactory.getCmCustFileExtMapper().updateByExample(record, example);
	}

	@Override
	public int deleteByExample(CmCustFileExtCriteria example) {
		return MapperFactory.getCmCustFileExtMapper().deleteByExample(example);
	}

}
