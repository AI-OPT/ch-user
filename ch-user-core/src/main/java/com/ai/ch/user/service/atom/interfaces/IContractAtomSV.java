package com.ai.ch.user.service.atom.interfaces;

import java.util.List;

import com.ai.ch.user.dao.mapper.bo.CtContractInfo;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IContractAtomSV {
	public int insertContractInfo(CtContractInfo  ctContractInfo)throws BusinessException, SystemException;
	public List<CtContractInfo> queryContractInfo(CtContractInfoCriteria example)throws BusinessException, SystemException;
}
