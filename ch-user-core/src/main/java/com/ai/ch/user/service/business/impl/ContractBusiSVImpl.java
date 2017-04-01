package com.ai.ch.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.ai.ch.user.dao.mapper.bo.CtContractInfo;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria;
import com.ai.ch.user.dao.mapper.bo.CtContractInfoCriteria.Criteria;
import com.ai.ch.user.service.atom.interfaces.IContractAtomSV;
import com.ai.ch.user.service.business.interfaces.IContractBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;

@Component
@Transactional
public class ContractBusiSVImpl implements IContractBusiSV{
	
	@Autowired
	private IContractAtomSV contractAtomSV;
	
	@Override
	public int insertContractInfo(ContactInfoRequest ctContractInfo)
			throws BusinessException, SystemException  {
		CtContractInfo contractInfo = new CtContractInfo();
		BeanUtils.copyProperties(contractInfo, ctContractInfo);
		return contractAtomSV.insertContractInfo(contractInfo);
	}

	@Override
	public ContractInfoResponse queryContractInfo(ContactInfoRequest contactInfoRequest)
			throws BusinessException, SystemException {
		CtContractInfoCriteria example = new CtContractInfoCriteria();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isBlank(contactInfoRequest.getTenantId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}
		if(!StringUtil.isBlank(contactInfoRequest.getUserId())){
			criteria.andUserIdEqualTo(contactInfoRequest.getUserId());
		}
		if(StringUtil.isBlank(contactInfoRequest.getContractType())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:合同类型不能为空");
		}
		if(contactInfoRequest.getContractName()!=null){
			criteria.andContractNameEqualTo(contactInfoRequest.getContractName());
		}
		if(contactInfoRequest.getContractCode()!=null){
			criteria.andContractCodeEqualTo(contactInfoRequest.getContractCode());
		}
		criteria.andTenantIdEqualTo(contactInfoRequest.getTenantId());
		criteria.andContractTypeEqualTo(contactInfoRequest.getContractType());
		List<CtContractInfo> list = contractAtomSV.queryContractInfo(example);
		ContractInfoResponse response = new ContractInfoResponse();
		if(!CollectionUtil.isEmpty(list)){
			BeanUtils.copyProperties(response, list.get(0));
		}
		return response;
	}

	@Override
	public List<ContractInfoResponse> queryAllContractInfo(
			ContactInfoRequest contactInfoRequest) throws BusinessException,
			SystemException {
		CtContractInfoCriteria example = new CtContractInfoCriteria();
		Criteria criteria = example.createCriteria();
		if(StringUtil.isBlank(contactInfoRequest.getTenantId())){
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}
		criteria.andTenantIdEqualTo(contactInfoRequest.getTenantId());
		List<CtContractInfo> list = contractAtomSV.queryContractInfo(example);
		List<ContractInfoResponse> contractInfoList = new ArrayList<ContractInfoResponse>();
		for(int i=0;i<list.size();i++){
			CtContractInfo ontractInfo = list.get(i);
			ContractInfoResponse response = new ContractInfoResponse();
			BeanUtils.copyProperties(response, ontractInfo);
			contractInfoList.add(response);
		}
		return contractInfoList;
	}

}
