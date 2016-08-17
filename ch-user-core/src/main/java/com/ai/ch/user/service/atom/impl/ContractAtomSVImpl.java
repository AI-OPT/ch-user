package com.ai.ch.user.service.atom.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.dao.mapper.bo.CtContractInfo;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria;
import com.ai.ch.user.dao.mapper.interfaces.CtContractInfoMapper;
import com.ai.ch.user.service.atom.interfaces.IContractAtomSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

@Component
public class ContractAtomSVImpl implements IContractAtomSV{

	@Autowired
    private transient CtContractInfoMapper contractInfoMapper;
	
	@Override
	public int insertContractInfo(CtContractInfo ctContractInfo)
			throws BusinessException, SystemException {
		return contractInfoMapper.insert(ctContractInfo);
	}

	@Override
	public List<CtContractInfo> queryContractInfo(CtContractInfoCriteria example)
			throws BusinessException, SystemException {
		List<CtContractInfo> list = contractInfoMapper.selectByExample(example);
		return list;
	}

}
