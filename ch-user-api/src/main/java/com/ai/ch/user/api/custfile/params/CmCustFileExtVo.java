package com.ai.ch.user.api.custfile.params;

import java.io.Serializable;
import java.sql.Timestamp;

public class CmCustFileExtVo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    /**
     * 附件ID
     */
    private String infoExtId;
    /**
     * 租户Id
     */
    private String tenantId;
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 属性类型
     */
    private String infoType;
    /**
     * 属性子分类
     */
    private String infoItem;
    /**
     * 附件名称
     */
    private String infoName;
    /**
     * 状态
     */
    private String state;
    /**
     * 属性ID
     */
    private String attrId;
    /**
     * 属性值
     */
    private String attrValue;
    /**
     * 属性可编辑状态
     */
    private String editState;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 创建渠道
     */
    private String createChlId;
    /**
     * 创建员工
     */
    private Long createOperId;
    /**
     * 修改时间
     */
    private Timestamp updateTime;
    /**
     * 修改渠道
     */
    private String updateChlId;
    /**
     * 修改员工
     */
    private Long updateOperId;

    public String getInfoExtId() {
        return infoExtId;
    }

    public void setInfoExtId(String infoExtId) {
        this.infoExtId = infoExtId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(String infoItem) {
        this.infoItem = infoItem;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getEditState() {
        return editState;
    }

    public void setEditState(String editState) {
        this.editState = editState;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateChlId() {
        return createChlId;
    }

    public void setCreateChlId(String createChlId) {
        this.createChlId = createChlId;
    }

    public Long getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(Long createOperId) {
        this.createOperId = createOperId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateChlId() {
        return updateChlId;
    }

    public void setUpdateChlId(String updateChlId) {
        this.updateChlId = updateChlId;
    }

    public Long getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(Long updateOperId) {
        this.updateOperId = updateOperId;
    }

}
