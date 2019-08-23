package com.zeei.ktp.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 输出数据模型
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncBufferBoxIssueInfoResponse", propOrder = {
        "replyCode",
        "returnMessageVO"
})
public class SyncBufferBoxIssueInfoResponse {

    /**
     * 应答编码
     */
    private String replyCode;
    /**
     * 操作结果信息
     */
    private ReturnMessageVO returnMessageVO;

    public String getReplyCode() {
        return replyCode;
    }

    public void setReplyCode(String replyCode) {
        this.replyCode = replyCode;
    }

    public ReturnMessageVO getReturnMessageVO() {
        return returnMessageVO;
    }

    public void setReturnMessageVO(ReturnMessageVO returnMessageVO) {
        this.returnMessageVO = returnMessageVO;
    }
}
