package com.ai.ch.user.api.contract.param;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

public class ContractInfoResponse  extends BaseResponse{

	private static final long serialVersionUID = 1L;
	/**
	 * 用户Id
	 */
	private String userId;
	/**
	 * 合同编号
	 */
	private String contractCode;
	/**
	 * 合同名称
	 */
	private String contractName;
	/**
	 * 合同类型
	 * 1、供应商合同
	 * 2、店铺合同';
	 */
	private String contractType;
	/**
	 * 开始时间
	 */
	private Timestamp activeTime;
	/**
	 * 结束时间
	 */
	private Timestamp inactiveTime;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Timestamp getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(Timestamp activeTime) {
		this.activeTime = activeTime;
	}

	public Timestamp getInactiveTime() {
		return inactiveTime;
	}

	public void setInactiveTime(Timestamp inactiveTime) {
		this.inactiveTime = inactiveTime;
	}
	
}
