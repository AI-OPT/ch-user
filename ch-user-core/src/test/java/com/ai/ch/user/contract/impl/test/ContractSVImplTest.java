package com.ai.ch.user.contract.impl.test;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.contract.interfaces.IContractSV;
import com.ai.ch.user.api.contract.param.CmCustFileExtVo;
import com.ai.ch.user.api.contract.param.ContactInfoRequest;
import com.ai.ch.user.api.contract.param.ContactInfoResponse;
import com.ai.ch.user.api.contract.param.InsertCustFileExtRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class ContractSVImplTest {
	@Autowired
	private IContractSV contractSV;
	
	@Test
	public void insertContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setContractCode("店铺code3");
		contactInfoRequest.setContractName("店铺test3");
		contactInfoRequest.setContractType("2");
		contactInfoRequest.setTenantId("ch");
		contactInfoRequest.setUserId("3");
		contactInfoRequest.setActiveTime(new Timestamp(11111111111L));
		contactInfoRequest.setInactiveTime(new Timestamp(222222222L));
		contractSV.insertContractInfo(contactInfoRequest);
	}
	@Test
	public void queryContractInfoTest(){
		ContactInfoRequest contactInfoRequest = new ContactInfoRequest();
		contactInfoRequest.setTenantId("ch");
		contactInfoRequest.setUserId("2");
		contactInfoRequest.setContractType("1");
		ContactInfoResponse response = contractSV.queryContractInfo(contactInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
	
	@Test
	public void insertCmCustFileExt(){
		InsertCustFileExtRequest extRequest = new InsertCustFileExtRequest();
		CmCustFileExtVo extVo = new CmCustFileExtVo();
		extVo.setAttrId("chTest");
		extVo.setTenantId("ch");
		extVo.setUserId("1");
		extVo.setInfoExtId("000000000000000835");
		extVo.setAttrValue("57bc380dc9e77c0006309b94");
		List<CmCustFileExtVo> list = new ArrayList<CmCustFileExtVo>();
		list.add(extVo);
		extRequest.setList(list);
		contractSV.insertCustFileExt(extRequest);
	}
}
