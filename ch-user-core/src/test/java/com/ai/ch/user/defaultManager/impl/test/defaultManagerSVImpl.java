package com.ai.ch.user.defaultManager.impl.test;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import com.ai.ch.user.api.defaultlog.interfaces.IDefaultLogSV;
import com.ai.ch.user.api.defaultlog.params.InsertDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.PaymentNotificationsRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogResponse;
import com.alibaba.fastjson.JSON;
import com.upp.docking.covn.MsgString;
import com.ylink.itfin.certificate.SecurityUtil;
import com.ylink.upp.base.oxm.XmlBodyEntity;
import com.ylink.upp.base.oxm.util.Dom4jHelper;
import com.ylink.upp.base.oxm.util.HandlerMsgUtil;
import com.ylink.upp.base.oxm.util.HeaderBean;
import com.ylink.upp.base.oxm.util.MsgUtils;
import com.ylink.upp.base.oxm.util.OxmHandler;
import com.ylink.upp.common.enums.TranType;
import com.ylink.upp.oxm.entity.upp_100_001_01.PayOrderDetail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml"})
public class defaultManagerSVImpl {

	@Autowired
	private IDefaultLogSV defaultLogSV;
	
	@Autowired
	private OxmHandler oxmHandler;
	
	@Test
	public void insertDetaultInfoTest(){
		InsertDefaultLogRequest request = new InsertDefaultLogRequest();
		request.setUserId("10");
		request.setDefaultReason("ccccc");
		request.setDeductBalance(111111111111D);
		request.setDeductDate(new Timestamp(new Date().getTime()));
		request.setOperId(1L);
		defaultLogSV.insertDefaultLog(request);
	}
	
	
	@Test
	public void queryDetaultInfoListTest(){
		QueryDefaultLogRequest defaultLogRequest = new QueryDefaultLogRequest();
		defaultLogRequest.setTenantId("ch");
		defaultLogRequest.setUserId("1");
		
		defaultLogRequest.setPageNo(1);
		defaultLogRequest.setPageSize(5);
		
		QueryDefaultLogResponse defaultLogResponse = defaultLogSV.queryDefaultLog(defaultLogRequest);
		System.out.println(JSON.toJSONString(defaultLogResponse.getPageInfo()));
	}
	
	@Test
	public void payment(){
		//调用长虹扣款
		//包装数据
		com.ylink.upp.oxm.entity.upp_100_001_01.GrpHdr hdr = new com.ylink.upp.oxm.entity.upp_100_001_01.GrpHdr();
		hdr.setMerNo("CO20160700000004");//设置一级平台商户号
		hdr.setTranType("100.001.01");//设置交易类型(保证金)
		hdr.setCreDtTm(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		
		com.ylink.upp.oxm.entity.upp_100_001_01.GrpBody body = new com.ylink.upp.oxm.entity.upp_100_001_01.GrpBody();
		String orderId = UUID.randomUUID().toString();
		body.setMerOrderId(orderId);//设置要查询的二级商户编号
		body.setUserName("uname");
		body.setToken("token");
		body.setOpenId("1");
		body.setCustType("02");//企业
		body.setPayCustNo("CB2016083000000004");
		
		BigDecimal orderAmt = new BigDecimal("0");
		List<PayOrderDetail> details = new ArrayList<PayOrderDetail>();
		PayOrderDetail detail = new PayOrderDetail();
		detail.setProductAmt("1");//扣保证金金额（分）
		detail.setProductName("productName1");//扣保证金原因
		detail.setSonMerNo("CO20160700000006");//收取保证金商户号
		detail.setMerSeqId(orderId);//商户主订单号
		orderAmt = BigDecimal.valueOf(Long.parseLong(detail.getProductAmt()));//订单总金额(当前与扣款金额相同)
		details.add(detail);

		body.setOrderAmt(orderAmt.toString());
		body.setOrderNum(details.size() + "");
		body.setOrderDate(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		body.setPayOrderDetail(details);
		body.setRemark("margindeposittest");

		body.setNotifyUrl("http://chpay.ngrok.tech:7777/upp-simulation/pay/result/result.html");
		body.setReturnUrl("http://chpay.ngrok.tech:7777/upp-simulation/pay/result/resultSuccess.html");
		
		body.setProductTypeName("margindeposit");
		body.setResv("test");
		body.setBizType("BAIL_BALANCE_PAY");// (保证金余额支付)
		body.setResv("test");//设置保留域

		
		com.ylink.upp.oxm.entity.upp_100_001_01.ReqsInfo reqsInfo = new com.ylink.upp.oxm.entity.upp_100_001_01.ReqsInfo();
		reqsInfo.setGrpHdr(hdr);
		reqsInfo.setGrpBody(body);
		
		// 发送消息
		String xmlMsg = null;
		try {
			xmlMsg = oxmHandler.marshal(reqsInfo);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, String> param = new TreeMap<String, String>();
		// 加签
		String sign = null;
		try {
			ResourceLoader resourceLoader = new DefaultResourceLoader();
			Resource pfxResource = resourceLoader.getResource("classpath:mobile.pfx"); 
			InputStream in = new FileInputStream(pfxResource.getFile());
			byte[] pfxByte = IOUtils.toByteArray(in);
		    sign = SecurityUtil.pfxWithSign(pfxByte,xmlMsg, "111111");
			param.put("signMsg", sign);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 拼装报文头
		String msgHeader = this.initMsgHeader(hdr.getMerNo(), "100.001.01");
		param.put("msgHeader", msgHeader);
		param.put("xmlBody", xmlMsg);
		String result = null;
		try {
			result = this.sendHttpPost("http://lytest.ngrok.tech:7777/upp-route/entry.html", param, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		MsgString msgString = MsgUtils.patch(result);
		String rh = msgString.getHeaderMsg();
        String rb = msgString.getXmlBody();
        String rs = msgString.getDigitalSign();
		XmlBodyEntity resultMsg =  receiveMsg(rh, rb, rs);
		com.ylink.upp.oxm.entity.upp_599_001_01.RespInfo receive = (com.ylink.upp.oxm.entity.upp_599_001_01.RespInfo) resultMsg;
		if(!"90000".equals(receive.getGrpBody().getStsRsn().getRespCode())){
			throw new RuntimeException("系统异常.");
		}else{
			System.out.println("扣款完成");
		}

	}
	
	private XmlBodyEntity receiveMsg(String msgHeader, String xmlMsg, String sign) {
		try {
			boolean verify = this.verify(xmlMsg, sign);
			if (!verify) {
				System.out.println("验签失败");
			}
			HeaderBean headerBean = new HeaderBean();
			HandlerMsgUtil.conversion(msgHeader, headerBean);
			xmlMsg = Dom4jHelper.addNamespace(xmlMsg, headerBean.getMesgType(), "UTF-8");
			return (XmlBodyEntity) oxmHandler.unmarshaller(xmlMsg);
		} catch (Exception e) {
			System.out.println("接收数据时发生异常，错误信息为:" + e.getMessage());
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 拼装报文头
	 * 
	 * @return
	 */
	private String initMsgHeader(String merNo, String tranType) {
		StringBuffer buffer = new StringBuffer("{H:01");
		buffer.append(merNo);
		buffer.append("1000000000000000");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		buffer.append(dateFormat.format(new Date(System.currentTimeMillis())));
		buffer.append(tranType);
		buffer.append("}");
		return buffer.toString();
	}
	
	
	@Test
	public void testSign(){
		// 加签
		String sign = null;
		try {
			ResourceLoader resourceLoader = new DefaultResourceLoader();
			Resource pfxResource = resourceLoader.getResource("classpath:CO20160700000018.pfx"); 
			InputStream in = new FileInputStream(pfxResource.getFile());
			byte[] pfxByte = IOUtils.toByteArray(in);
		    sign = SecurityUtil.pfxWithSign(pfxByte,"1212", "111111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			boolean verify = this.verify("1212", sign);
			System.out.println(verify);
		} catch (Exception e) {
			e.printStackTrace();
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
	public  boolean verify(String xmlMsg, String sign) throws Exception {
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource pfxResource = resourceLoader.getResource("classpath:mobile1.cer"); 
		InputStream in = new FileInputStream(pfxResource.getFile());
		byte[] cerByte = IOUtils.toByteArray(in);
		return SecurityUtil.verify(cerByte, xmlMsg, sign);
	}
	
	public String sendHttpPost(String url, Map<String, String> param, String charset) throws Exception {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		PayUtil payUtil = new PayUtil();
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(100000).setConnectTimeout(100000).build();
		try {
			HttpPost post = new HttpPost(url);
			post.setConfig(requestConfig);
			if (!CollectionUtils.isEmpty(param)) {
				List<NameValuePair> params = new ArrayList<NameValuePair>();
				for (String key : param.keySet()) {
					params.add(new BasicNameValuePair(key, param.get(key)));
				}
				HttpEntity fromEntity = new UrlEncodedFormEntity(params, charset);
				post.setEntity(fromEntity);
			}
			HttpResponse response = httpClient.execute(post);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				return EntityUtils.toString(response.getEntity(), charset);
			} else if (302 == response.getStatusLine().getStatusCode()) {
				Header hs = response.getFirstHeader("Location");
				if (hs != null) {
					String lo = hs.getValue();
					if (!payUtil.checkUrl(lo)) {
						lo = PayUtil.findUrl(post.getURI().toASCIIString()) + lo;
					}
					return payUtil.sendHttpPostGet(lo, null, charset);
				}
				String result = EntityUtils.toString(response.getEntity(), charset);
				return result;
			} else {
				throw new Exception("调用URL地址通讯失败,失败状态：" + response.getStatusLine().getStatusCode());
			}
		} finally {
			if (null != httpClient) {
				httpClient.close();
			}
		}
	}
}
