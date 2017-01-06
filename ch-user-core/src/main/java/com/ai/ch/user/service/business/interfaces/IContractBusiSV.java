package com.ai.ch.user.service.business.interfaces;


import java.util.List;

import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;

public interface IContractBusiSV {
	/**
	 * 保存合同信息
	 * @param ctContractInfo
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public int insertContractInfo(ContactInfoRequest  ctContractInfo)throws BusinessException, SystemException;
	/**
	 * 查询合同信息
	 * @param contactInfoRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public ContractInfoResponse queryContractInfo(ContactInfoRequest contactInfoRequest)throws BusinessException, SystemException;
	/**
	 * 查询所有的合同信息
	 * @param contactInfoRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 */
	public List<ContractInfoResponse> queryAllContractInfo(ContactInfoRequest contactInfoRequest)throws BusinessException, SystemException;
	
}
