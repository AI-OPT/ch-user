package com.ai.ch.user.audit.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.audit.params.InsertAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditInfoRequest;
import com.ai.ch.user.api.audit.params.QueryAuditLogInfoRequest;
import com.ai.ch.user.service.business.interfaces.ICtAuditBusiSV;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class AuditSVImplTest {

	
	@Autowired
	private ICtAuditBusiSV auditSV;
	
	@Test
	public void insertAudit(){
		InsertAuditInfoRequest re = new InsertAuditInfoRequest();
		re.setUserId("1111111");
		re.setTenantId("changhong");
		re.setOperName("王二");
		re.setOperId("1234567");
		re.setCtType("1");
		re.setAuditStatus("0");
		re.setAuditDesc("批准");
		System.out.println(JSON.toJSONString(auditSV.insertAuditInfo(re)));
	}
	
	@Test
	public void queryAudit(){
		QueryAuditInfoRequest re = new QueryAuditInfoRequest();
		re.setUserId("1111111");
		re.setTenantId("changhong");
		System.out.println(JSON.toJSONString(auditSV.queryAuditInfo(re)));
	}
	
	@Test
	public void queryAuditLog(){
		QueryAuditLogInfoRequest re = new QueryAuditLogInfoRequest();
		//re.setUserId("e01977b835034f5d");
		re.setTenantId("changhong");
		re.setPageNo(1);
		re.setPageSize(5);
		//re.setUserName("think");
		re.setUserId("63e5e83409d8499b");
		//re.setBeginTime(Timestamp.valueOf("2015-12-7 00:00:00"));
		System.out.println(JSON.toJSONString(auditSV.queryAuditLogInfo(re)));
	}
}
