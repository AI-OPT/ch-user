package com.ai.ch.user.api.custfile.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.custfile.interfaces.ICustFileSV;
import com.ai.ch.user.api.custfile.params.InsertCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtRequest;
import com.ai.ch.user.api.custfile.params.QueryCustFileExtResponse;
import com.ai.ch.user.api.custfile.params.UpdateCustFileExtRequest;
import com.ai.ch.user.constants.ExceptCodeConstants;
import com.ai.ch.user.service.business.interfaces.ICustFileBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service(validation = "true")
public class CustFileSVImpl implements ICustFileSV {

	private static final Log log = LogFactory.getLog(CustFileSVImpl.class);
	
	@Autowired
	private ICustFileBusiSV CustFileBusiSV;

	@Override
	public BaseResponse insertCustFileExt(InsertCustFileExtRequest request) throws SystemException, BusinessException {
		BaseResponse baseResponse = new BaseResponse();
		ResponseHeader responseHeader = null;

		try {
			Long beginTime = System.currentTimeMillis();
			log.info("后场保存附件服务开始"+beginTime);
			CustFileBusiSV.insertCustFileExt(request);
			log.info("后场保存附件服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		baseResponse.setResponseHeader(responseHeader);
		return baseResponse;
	}

	@Override
	public QueryCustFileExtResponse queryCustFileExt(QueryCustFileExtRequest request)
			throws SystemException, BusinessException {
		ResponseHeader responseHeader = null;
		QueryCustFileExtResponse response = new QueryCustFileExtResponse();
		try {
			Long beginTime = System.currentTimeMillis();
			log.info("后场查询附件服务开始"+beginTime);
			response = CustFileBusiSV.QueryCustFileExt(request);
			log.info("后场查询附件服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;

	}

	@Override
	public BaseResponse updateCustFileExt(UpdateCustFileExtRequest request) throws SystemException, BusinessException {
		ResponseHeader responseHeader = null;
		BaseResponse response = new BaseResponse();
		try {
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新附件服务开始"+beginTime);
			CustFileBusiSV.updateCustFileExt(request);
			log.info("后场更新附件服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/updateCustFileExtBycondition")
	public BaseResponse updateCustFileExtBycondition(
			UpdateCustFileExtRequest request) throws SystemException,
			BusinessException {
		ResponseHeader responseHeader = null;
		BaseResponse response = new BaseResponse();
		try {
			Long beginTime = System.currentTimeMillis();
			log.info("后场更新附件服务开始"+beginTime);
			CustFileBusiSV.updateCustFileExtBycondition(request);
			log.info("后场更新附件服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/deleteCustFileExtBycondition")
	public BaseResponse deleteCustFileExtBycondition(
			QueryCustFileExtRequest request) throws SystemException,
			BusinessException {
		ResponseHeader responseHeader = null;
		BaseResponse response = new BaseResponse();
		try {
			Long beginTime = System.currentTimeMillis();
			log.info("后场删除附件服务开始"+beginTime);
			CustFileBusiSV.deleteCustFileExtBycondition(request);
			log.info("后场删除附件服务结束"+System.currentTimeMillis()+"耗时:"+(System.currentTimeMillis()-beginTime)+"毫秒");
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "操作成功");
		} catch (Exception e) {
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

}
