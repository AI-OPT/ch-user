package com.ai.ch.user.shopinfo.impl.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.ch.user.api.shopinfo.interfaces.IShopInfoSV;
import com.ai.ch.user.api.shopinfo.params.InsertShopInfoRequst;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoResponse;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/context/core-context.xml" })
public class ShopInfoTest {

	@Autowired
	private IShopInfoSV shopInfoSV;
	
	@Test
	public void testQueryRank(){
		QueryShopRankRequest request = new QueryShopRankRequest();
		request.setTenantId("changhong");
		request.setUserId("00002");
		shopInfoSV.queryShopRank(request);
	}
	
	@Test
	public void testQueryDeposit(){
		QueryShopDepositRequest request = new QueryShopDepositRequest();
		request.setTenantId("changhong");
		request.setUserId("00002");
		System.out.println(shopInfoSV.queryShopDeposit(request));
	}
	
	@Test
	public void testInsert(){
		InsertShopInfoRequst insertShopInfo = new InsertShopInfoRequst();
		insertShopInfo.setTenantId("changhong");
		insertShopInfo.setUserId("1");
		insertShopInfo.setPeriodType("Y");
		insertShopInfo.setStatus(0);
		insertShopInfo.setShopName("shopy");
		shopInfoSV.insertShopInfo(insertShopInfo);
	}
	
	@Test
	public void testQueryInfo(){
		QueryShopInfoRequest queryShopInfo = new QueryShopInfoRequest();
		queryShopInfo.setTenantId("changhong");
		queryShopInfo.setUserId("d548e76fd3034908");
		QueryShopInfoResponse infoResponse = shopInfoSV.queryShopInfo(queryShopInfo);
		System.out.println(JSON.toJSONString(infoResponse));
	}
	
	@Test
	public void testQueryDep(){
		QueryShopDepositRequest queryShopInfo = new QueryShopDepositRequest();
		queryShopInfo.setTenantId("changhong");
		queryShopInfo.setUserId("e85b0ee425964d7d");
		Long infoResponse = shopInfoSV.queryShopDeposit(queryShopInfo);
		System.out.println(JSON.toJSONString(infoResponse));
	}
}
