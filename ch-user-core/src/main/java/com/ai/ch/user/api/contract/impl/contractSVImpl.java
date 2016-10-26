package com.ai.ch.user.api.contract.impl;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.contract.interfaces.IContractSV;
import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContractInfoResponse;
import com.ai.ch.user.constants.ExceptCodeConstants;
import com.ai.ch.user.service.business.interfaces.IContractBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class contractSVImpl implements IContractSV{

	private static final Log log = LogFactory.getLog(contractSVImpl.class);
	
	@Autowired
	private IContractBusiSV contractBusiSV;
	
	@Override
	@POST
	@Path("/insertContractInfo")
	public BaseResponse insertContractInfo(ContactInfoRequest contactRequest)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
	    ResponseHeader responseHeader = null;
	    try {
	    	Long beginTime = System.currentTimeMillis();
			log.info("后场保存合同服务开始"+beginTime);
			contractBusiSV.insertContractInfo(contactRequest);
			log.info("后场保存合同服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
        } catch (Exception e) {
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
        }
        response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/queryContractInfo")
	public ContractInfoResponse queryContractInfo(ContactInfoRequest contactRequest)
			throws BusinessException, SystemException {
		ResponseHeader responseHeader = null;
		ContractInfoResponse response = new ContractInfoResponse();
		 try {
			 Long beginTime = System.currentTimeMillis();
				log.info("后场查询合同服务开始"+beginTime);
				response = contractBusiSV.queryContractInfo(contactRequest);
				log.info("后场查询合同服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
	            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
	        } catch (Exception e) {
	            responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
	        }
	        response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/queryAllContractInfo")
	public List<ContractInfoResponse> queryAllContractInfo(
			ContactInfoRequest contactRequest) throws BusinessException,
			SystemException {
		ResponseHeader responseHeader = null;
		List<ContractInfoResponse> list = null;
		ContractInfoResponse response = new ContractInfoResponse();
		 try {
			 	Long beginTime = System.currentTimeMillis();
				log.info("后场查询合同服务开始"+beginTime);
				list = contractBusiSV.queryAllContractInfo(contactRequest);
				log.info("后场查询合同服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
	            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
	        } catch (Exception e) {
	            responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
	        }
	        response.setResponseHeader(responseHeader);
		return list;
	}

}
