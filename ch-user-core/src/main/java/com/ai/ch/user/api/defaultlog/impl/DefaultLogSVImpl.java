package com.ai.ch.user.api.defaultlog.impl;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.PaymentNotificationsRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.ai.ch.user.constants.ChUserConstants;
import com.ai.ch.user.service.business.interfaces.IDefaultLogBusiSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.alibaba.dubbo.config.annotation.Service;
import com.ylink.itfin.certificate.SecurityUtil;
import com.ylink.upp.base.oxm.XmlBodyEntity;
import com.ylink.upp.base.oxm.util.Dom4jHelper;
import com.ylink.upp.base.oxm.util.HandlerMsgUtil;
import com.ylink.upp.base.oxm.util.HeaderBean;
import com.ylink.upp.base.oxm.util.OxmHandler;

@Component
@Service
public class DefaultLogSVImpl implements IDefaultLogSV {

	@Autowired
	private IDefaultLogBusiSV defaultLogBusiSV;
	
	@Autowired
	private OxmHandler oxmHandler;
	
	private static final Log LOG = LogFactory.getLog(DefaultLogSVImpl.class);
	
	@Override
	public BaseResponse insertDefaultLog(InsertDefaultLogRequest request) throws SystemException, BusinessException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader =null;
		try{
			defaultLogBusiSV.insertDefaultLog(request);
		    responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	public QueryDefaultLogResponse queryDefaultLog(QueryDefaultLogRequest request)
			throws SystemException, BusinessException {
		QueryDefaultLogResponse response=null;
		ResponseHeader responseHeader =null;
		try{
		response = defaultLogBusiSV.queryDefaultLog(request);
		responseHeader = new ResponseHeader(true, ChUserConstants.ShopRank.SUCCESS, "操作成功");
		}catch(Exception e){
			LOG.error("操作失败");
			responseHeader = new ResponseHeader(false, ChUserConstants.ShopRank.Fail, "操作失败");
		}
		response.setResponseHeader(responseHeader);
		return response;
	}

	@Override
	@POST
	@Path("/paymentNotifications")
	public String paymentNotifications(PaymentNotificationsRequest request) throws SystemException,
			BusinessException {
		//验签
		com.ylink.upp.base.oxm.XmlBodyEntity resultMsg =  receiveMsg(request.getMsgHeader(), request.getXmlBody(), request.getSignMsg());
        com.ylink.upp.oxm.entity.upp_103_001_01.RespInfo receive = (com.ylink.upp.oxm.entity.upp_103_001_01.RespInfo)resultMsg;
        
        if(receive == null){
        	com.ylink.upp.oxm.entity.upp_599_001_01.RespInfo receive2 = (com.ylink.upp.oxm.entity.upp_599_001_01.RespInfo) resultMsg;
            if(!"90000".equals(receive2.getGrpBody().getStsRsn().getRespCode())){
            	throw new RuntimeException("系统异常.");
            }
        }
        
        //00表示支付成功，01表示支付失败
        if("00".equals(receive.getGrpBody().getPayStatus())){
        	//defaultLogBusiSV.insertDefaultLog(request);
        }
        
		return "SUCCESS";
	}

	private XmlBodyEntity receiveMsg(String msgHeader, String xmlMsg, String sign) {
		try {
			boolean verify = this.verify(xmlMsg, sign);
			if (!verify) {
				System.out.println("验签失败");
			}
			HeaderBean headerBean = new HeaderBean();
			HandlerMsgUtil.conversion(msgHeader, headerBean);
			xmlMsg = Dom4jHelper.addNamespace(xmlMsg, "103.001.01", "UTF-8");
			return (XmlBodyEntity) oxmHandler.unmarshaller(xmlMsg);
		} catch (Exception e) {
			System.out.println("接收数据时发生异常，错误信息为:" + e.getMessage());
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 验签
	 * 
	 * @param xmlMsg
	 * @param sign
	 * @return
	 * @throws Exception
	 */
	private boolean verify(String xmlMsg, String sign) throws Exception {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource pfxResource = resourceLoader.getResource("classpath:CO20160700000004.cer"); 
		InputStream in = new FileInputStream(pfxResource.getFile());
		byte[] cerByte = IOUtils.toByteArray(in);
		return SecurityUtil.verify(cerByte, xmlMsg, sign);
	}
}
