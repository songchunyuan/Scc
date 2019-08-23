package com.zeei.ktp.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 接口调用结果
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnMessageVO", propOrder = {
        "status",
        "exceptionInfo",
        "billId"
})
public class ReturnMessageVO {

    /**
     * 接收状态，成功返回“0”，错误返回-1
     */
    private int status;
    /**
     * 异常信息，成功返回空，错误返回系统处理异常信息
     */
    private String exceptionInfo;
    /**
     * 物资周转柜系统传输的单据主单单号
     */
    private String billId;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}
