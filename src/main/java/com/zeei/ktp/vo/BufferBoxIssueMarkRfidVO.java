//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.08.21 时间 08:53:06 AM CST 
//


package com.zeei.ktp.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BufferBoxIssueMarkRfidVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BufferBoxIssueMarkRfidVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rfidValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

/**
 * 计量条形码对象
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BufferBoxIssueMarkRfidVO", propOrder = {
    "rfidValue"
})
public class BufferBoxIssueMarkRfidVO {

    /**
     * 条形码
     */
    protected String rfidValue;

    public String getRfidValue() {
        return rfidValue;
    }

    public void setRfidValue(String rfidValue) {
        this.rfidValue = rfidValue;
    }
}
