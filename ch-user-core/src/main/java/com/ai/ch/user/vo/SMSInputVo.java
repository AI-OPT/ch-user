package com.ai.ch.user.vo;

public class SMSInputVo {

	private String  tenementid;
	private String systemid;
	private String verifyid;
	private String templateid;
	private String phone;
	private Integer servicetype;
	private String gsmcontent;
	private String priority;
	public String getTenementid() {
		return tenementid;
	}
	public void setTenementid(String tenementid) {
		this.tenementid = tenementid;
	}
	public String getSystemid() {
		return systemid;
	}
	public void setSystemid(String systemid) {
		this.systemid = systemid;
	}
	public String getVerifyid() {
		return verifyid;
	}
	public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}
	public String getTemplateid() {
		return templateid;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getServicetype() {
		return servicetype;
	}
	public void setServicetype(Integer servicetype) {
		this.servicetype = servicetype;
	}
	public String getGsmcontent() {
		return gsmcontent;
	}
	public void setGsmcontent(String gsmcontent) {
		this.gsmcontent = gsmcontent;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "SMSInputVo [tenementid=" + tenementid + ", systemid="
				+ systemid + ", verifyid=" + verifyid + ", templateid="
				+ templateid + ", phone=" + phone + ", servicetype="
				+ servicetype + ", gsmcontent=" + gsmcontent + ", priority="
				+ priority + "]";
	}
	
	
}
