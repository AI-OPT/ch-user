package com.ai.ch.user.api.defaultlog.params;

/**
 * 支付回调请求参数 Date: 2016年12月27日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class PaymentNotificationsRequest {
	/**
	 * 报文头信息
	 */
	private String msgHeader;
	/**
	 * 报文
	 */
	private String xmlBody;

	/**
	 * 数字签名
	 */
	private String signMsg;

	public String getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(String msgHeader) {
		this.msgHeader = msgHeader;
	}

	public String getXmlBody() {
		return xmlBody;
	}

	public void setXmlBody(String xmlBody) {
		this.xmlBody = xmlBody;
	}

	public String getSignMsg() {
		return signMsg;
	}

	public void setSignMsg(String signMsg) {
		this.signMsg = signMsg;
	}

}
