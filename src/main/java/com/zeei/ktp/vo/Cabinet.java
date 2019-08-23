package com.zeei.ktp.vo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "T_WMS_METER_CABINET")
public class Cabinet {
	/**
	 * 电表柜id
	 */
	@Id
	private Integer cabinetId;
	/**
	 * 电表柜名称
	 */
	private String cabinetName;
	/**
	 * 电表柜容量(柜格数)
	 */
	private Integer capacity;
	/**
	 * 电表柜尺寸
	 */
	private String size;
	/**
	 * 开始使用时间(新增不一定开始使用)
	 */
	private Date useDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建人id
	 */
	private Integer createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 最后一次修改人id
	 */
	private Integer updateUserId;
	/**
	 * 最后一次修改时间
	 */
	private Date updateTime;

	public Integer getCabinetId() {
		return cabinetId;
	}

	public void setCabinetId(Integer cabinetId) {
		this.cabinetId = cabinetId;
	}

	public String getCabinetName() {
		return cabinetName;
	}

	public void setCabinetName(String cabinetName) {
		this.cabinetName = cabinetName;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
