package com.ai.ch.user.contract.impl.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.contract.interfaces.IContractSV;
import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContactInfoResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class ContractSVImplTest {
	@Autowired
	private IContractSV contractSV;
	
	@Test
	public void insertContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setContractCode("12345");
		contactInfoRequest.setContractName("合同名称1");
		contactInfoRequest.setContractType("1");
		contactInfoRequest.setTenantId("ch");
		contactInfoRequest.setUserId("1");
		contactInfoRequest.setActiveTime(new Timestamp(11111111111L));
		contactInfoRequest.setInactiveTime(new Timestamp(222222222L));
		contractSV.insertContractInfo(contactInfoRequest);
	}
	@Test
	public void queryContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setTenantId("ch");
		contactInfoRequest.setUserId("1");
		contactInfoRequest.setContractType("1");
		ContactInfoResponse response = contractSV.queryContractInfo(contactInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
}
