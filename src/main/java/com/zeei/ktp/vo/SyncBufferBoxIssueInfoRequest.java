package com.zeei.ktp.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * webservice输入数据模型
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncBufferBoxIssueInfoRequest", propOrder = {
        "bufferBoxIssueInfo"
})
public class SyncBufferBoxIssueInfoRequest {

    private BufferBoxIssueVO bufferBoxIssueInfo;

    public BufferBoxIssueVO getBufferBoxIssueInfo() {
        return bufferBoxIssueInfo;
    }

    public void setBufferBoxIssueInfo(BufferBoxIssueVO bufferBoxIssueInfo) {
        this.bufferBoxIssueInfo = bufferBoxIssueInfo;
    }
}
