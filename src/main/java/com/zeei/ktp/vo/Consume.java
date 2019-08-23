package com.zeei.ktp.vo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "T_WMS_METER_CONSUMEALL")
public class Consume {
	/**
	 * 领用单号
	 */
	@Id
	private String receiveNum;
    /**
     * 经办人id:领用人 TODO:暂时固化[lijianbo@]
     * 要通过id查询到user的userCode
     */
    private Integer userId;
    /**
     * 项目id
     */
    private String projectId;
    /**
     * 单项工程id
     */
    private String subprojectId;
    /**
     * 领用时间-->计划领用时间
     */
    private Date consumeTime;
    /**
     * 地市局编码
     */
    private String dataArea;
	/**
	 * 仓库id
	 */
	private Integer storageId;
	/**
	 * 工具id
	 */
	private Integer toolId;
	/**
	 * 故障描述信息
	 */
	private String consumeInfo;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 电表柜id
	 */
	private Integer cabinetId;
	/**
	 * 存放位置
	 */
	private Integer storageLocation;
	/**
	 * 创建时间
	 */
	private Date createTime;
    /**
     * 出库状态
     */
	private Integer consumeStatus;
	/**
	 * 发送状态:判断是否与第三方同步
	 */
	private Integer isSend;

    public String getReceiveNum() {
        return receiveNum;
    }

    public void setReceiveNum(String receiveNum) {
        this.receiveNum = receiveNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getSubprojectId() {
        return subprojectId;
    }

    public void setSubprojectId(String subprojectId) {
        this.subprojectId = subprojectId;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getDataArea() {
        return dataArea;
    }

    public void setDataArea(String dataArea) {
        this.dataArea = dataArea;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getToolId() {
        return toolId;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public String getConsumeInfo() {
        return consumeInfo;
    }

    public void setConsumeInfo(String consumeInfo) {
        this.consumeInfo = consumeInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(Integer cabinetId) {
        this.cabinetId = cabinetId;
    }

    public Integer getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(Integer storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getConsumeStatus() {
        return consumeStatus;
    }

    public void setConsumeStatus(Integer consumeStatus) {
        this.consumeStatus = consumeStatus;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }
}
