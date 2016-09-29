package com.ai.ch.user.api.defaultlog.params;

public class PaymentNotificationsRequest {
	private String msgHeader;
	private String xmlBody;
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
