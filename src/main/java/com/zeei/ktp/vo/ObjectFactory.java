//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.08.21 时间 08:53:06 AM CST
//


package com.zeei.ktp.vo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zeei.ktp.vo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SyncBufferBoxIssueInfoRequest_QNAME = new QName("http://soa.csg.cn", "syncBufferBoxIssueInfoRequest");
    private final static QName _SyncBufferBoxIssueInfoResponse_QNAME = new QName("http://soa.csg.cn", "syncBufferBoxIssueInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zeei.ktp.vo
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SyncBufferBoxIssueInfoResponse }
     *
     */
    public SyncBufferBoxIssueInfoResponse createSyncBufferBoxIssueInfoResponse() {
        return new SyncBufferBoxIssueInfoResponse();
    }

    /**
     * Create an instance of {@link SyncBufferBoxIssueInfoRequest }
     *
     */
    public SyncBufferBoxIssueInfoRequest createSyncBufferBoxIssueInfoRequest() {
        return new SyncBufferBoxIssueInfoRequest();
    }

    /**
     * Create an instance of {@link BufferBoxIssueMarkRfidVO }
     *
     */
    public BufferBoxIssueMarkRfidVO createBufferBoxIssueMarkRfidVO() {
        return new BufferBoxIssueMarkRfidVO();
    }

    /**
     * Create an instance of {@link ReturnMessageVO }
     *
     */
    public ReturnMessageVO createReturnMessageVO() {
        return new ReturnMessageVO();
    }

    /**
     * Create an instance of {@link BufferBoxIssueVO }
     *
     */
    public BufferBoxIssueVO createBufferBoxIssueVO() {
        return new BufferBoxIssueVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncBufferBoxIssueInfoRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soa.csg.cn", name = "syncBufferBoxIssueInfoRequest")
    public JAXBElement<SyncBufferBoxIssueInfoRequest> createSyncBufferBoxIssueInfoRequest(SyncBufferBoxIssueInfoRequest value) {
        return new JAXBElement<SyncBufferBoxIssueInfoRequest>(_SyncBufferBoxIssueInfoRequest_QNAME, SyncBufferBoxIssueInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncBufferBoxIssueInfoResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soa.csg.cn", name = "syncBufferBoxIssueInfoResponse")
    public JAXBElement<SyncBufferBoxIssueInfoResponse> createSyncBufferBoxIssueInfoResponse(SyncBufferBoxIssueInfoResponse value) {
        return new JAXBElement<SyncBufferBoxIssueInfoResponse>(_SyncBufferBoxIssueInfoResponse_QNAME, SyncBufferBoxIssueInfoResponse.class, null, value);
    }

}
