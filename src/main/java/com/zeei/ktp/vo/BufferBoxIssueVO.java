//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.08.21 时间 08:53:06 AM CST
//


package com.zeei.ktp.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>BufferBoxIssueVO complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BufferBoxIssueVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subprojectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subItem" type="{http://soa.csg.cn}BufferBoxIssueMarkRfidVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

/**
 * 领用电表信息
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BufferBoxIssueVO", propOrder = {
        "billId",
        "creatorId",
        "projectId",
        "subprojectId",
        "planIssueDate",
        "dataArea",
        "subItem"
})
public class BufferBoxIssueVO {
    /**
     * 物资周转柜系统传输的单据主单单号
     */
    private String billId;
    /**
     * 领用人id,传4A人员ID
     */
    private String creatorId;
    /**
     * 项目id,传项目ID
     */
    private String projectId;
    /**
     * 单项工程id,传单项工程ID,非必填
     */
    private String subprojectId;
    /**
     * 计划领用时间,传物资出柜时间，格式：yyyy-MM-dd
     */
    private String planIssueDate;
    /**
     * 地市局编码,数据区域：如0900
     */
    private String dataArea;
    /**
     * 计量条码集合,传计量条码集合
     */
    @XmlElement(nillable = true)
    private List<BufferBoxIssueMarkRfidVO> subItem;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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

    public String getPlanIssueDate() {
        return planIssueDate;
    }

    public void setPlanIssueDate(String planIssueDate) {
        this.planIssueDate = planIssueDate;
    }

    public String getDataArea() {
        return dataArea;
    }

    public void setDataArea(String dataArea) {
        this.dataArea = dataArea;
    }

    public List<BufferBoxIssueMarkRfidVO> getSubItem() {
        return subItem;
    }

    public void setSubItem(List<BufferBoxIssueMarkRfidVO> subItem) {
        this.subItem = subItem;
    }
}
