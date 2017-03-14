package com.ai.ch.user.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.ch.user.api.defaultlog.params.QueryDefaultLogRequest;
import com.ai.ch.user.api.defaultlog.params.QueryFullDefaultLogRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopDepositRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoByIdRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopInfoRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopKpiRequest;
import com.ai.ch.user.api.shopinfo.params.QueryShopRankRequest;
import com.ai.ch.user.api.shopinfo.params.SaveShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopAuditInfoRequest;
import com.ai.ch.user.api.shopinfo.params.UpdateShopStatusRequest;
import com.ai.ch.user.dao.mapper.bo.ShopInfo;
import com.ai.ch.user.dao.mapper.bo.ShopInfoCriteria;
import com.ai.ch.user.service.atom.impl.ShopInfoAtomSV;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.StringUtil;

public class ValidateUtils {

	@Autowired
	private static ShopInfoAtomSV shopInfoAtomSV;
	
	private ValidateUtils() {
	}

	public static void validatSaveAuditInfo(SaveShopAuditInfoRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户Id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户Id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
		if (StringUtil.isBlank(request.getBusiType())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:经营类型不能为空");
		} else {
			request.setBusiType(request.getBusiType().trim());
		}
		if (request.getGoodsNum() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:可售商品数量不能为空");
		}
		if (StringUtil.isBlank(request.getMerchantNo())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户编号不能为空");
		} else {
			request.setMerchantNo(request.getMerchantNo().trim());
		}
		if (StringUtil.isBlank(request.getShopDesc())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户简介不能为空");
		} else {
			request.setShopDesc(request.getShopDesc().trim());
		}
		if (StringUtil.isBlank(request.getShopName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户名称不能为空");
		}
		request.setShopName(request.getShopName().trim());
		if (request.getHasExperi() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:有无电商经验不能为空");
		}
		if (StringUtil.isBlank(request.getEcommOwner())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:拥有电商平台数量不能为空");
		} else {
			request.setEcommOwner(request.getEcommOwner().trim());
		}
		if (!(request.getHasExperi() == 0 || request.getHasExperi() == 1)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数格式错误:有无电商经验状态码为0/1");
		}
		if (!(request.getBusiType().trim().equals("1") || request.getBusiType().trim().equals("2"))) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数格式错误:经营类型状态码为1/2");
		}
		if (request.getHasExperi() == 0 && !"000000".equals(request.getEcommOwner())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数数据错误:是否拥有电商经验与数量不一致");
		}
		// 校验店铺名
		ShopInfoCriteria nameExample = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria nameCriteria = nameExample.createCriteria();
		nameCriteria.andTenantIdEqualTo(request.getTenantId());
		nameCriteria.andUserIdNotEqualTo(request.getUserId());
		nameCriteria.andShopNameEqualTo(request.getShopName().trim());
		List<ShopInfo> nameList = shopInfoAtomSV.selectByExample(nameExample);
		if (!nameList.isEmpty()) {
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "店铺名称已存在");
		}
	}

	public static void validatCheckShopName(QueryShopInfoRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}

		if (StringUtil.isBlank(request.getShopName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:店铺名称不能为空");
		}
	}

	public static void validatQueryDeposit(QueryShopDepositRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
		}

		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:店铺名称不能为空");
		}
	}

	public static void validatQueryShopInfo(QueryShopInfoByIdRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
	}

	public static void validatQueryDefaultLog(QueryDefaultLogRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户id不能为空");
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户id不能为空");
		}
	}

	public static void validatQueryFullDefaultLog(QueryFullDefaultLogRequest request) {
		if (request.getPageNo() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "PageNo不能为空");
		}
		if (request.getPageSize() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "PageSize不能为空");
		}
	}

	public static void validatUpdateShopStatus(UpdateShopStatusRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
		if (request.getStatus() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:状态不能为空");
		}
	}

	public static void validatQueryShopRank(QueryShopRankRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户Id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户Id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
	}

	public static void validatQueryShopKpi(QueryShopKpiRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户id不能为空");
		}
	}

	public static void validatUpdateAuditInfo(UpdateShopAuditInfoRequest request) {
		if (StringUtil.isBlank(request.getTenantId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户Id不能为空");
		} else {
			request.setTenantId(request.getTenantId().trim());
		}
		if (StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户Id不能为空");
		} else {
			request.setUserId(request.getUserId().trim());
		}
		if (StringUtil.isBlank(request.getBusiType())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:经营类型不能为空");
		} else {
			request.setBusiType(request.getBusiType().trim());
		}
		if (request.getGoodsNum() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:可售商品数量不能为空");
		}
		if (StringUtil.isBlank(request.getMerchantNo())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户编号不能为空");
		} else {
			request.setMerchantNo(request.getMerchantNo().trim());
		}
		if (StringUtil.isBlank(request.getShopDesc())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户简介不能为空");
		} else {
			request.setShopDesc(request.getShopDesc().trim());
		}
		if (StringUtil.isBlank(request.getShopName())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:商户名称不能为空");
		}
		request.setShopName(request.getShopName().trim());
		if (request.getHasExperi() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:有无电商经验不能为空");
		}
		if (StringUtil.isBlank(request.getEcommOwner())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:拥有电商平台数量不能为空");
		} else {
			request.setEcommOwner(request.getEcommOwner().trim());
		}
		if (request.getHasExperi() == null) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:是否拥有电商经验不能为空");
		} else {
			request.setEcommOwner(request.getEcommOwner().trim());
		}
		if (!(request.getHasExperi() == 0 || request.getHasExperi() == 1)) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数格式错误:有无电商经验状态码为0/1");
		}
		if (!(request.getBusiType().trim().equals("1") || request.getBusiType().trim().equals("2"))) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数格式错误:经营类型状态码为1/2");
		}
		if (request.getHasExperi() == 0 && !"000000".equals(request.getEcommOwner())) {
			throw new BusinessException(ExceptCodeConstants.Special.PARAM_TYPE_NOT_RIGHT, "参数数据错误:是否拥有电商经验与数量不一致");
		}
		ShopInfoCriteria example = new ShopInfoCriteria();
		ShopInfoCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(request.getTenantId());
		criteria.andShopNameEqualTo(request.getShopName().trim());
		criteria.andUserIdNotEqualTo(request.getUserId());
		List<ShopInfo> nameList = shopInfoAtomSV.selectByExample(example);
		if(!nameList.isEmpty()){
			throw new BusinessException(ExceptCodeConstants.Special.NO_RESULT, "店铺名称已存在");
		}
	}
}
