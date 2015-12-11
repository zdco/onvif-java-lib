//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:30:43 PM CST 
//


package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onvif.ver10.schema.BinaryData;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Attributes" type="{http://www.onvif.org/ver10/schema}BinaryData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certificateID",
    "subject",
    "attributes"
})
@XmlRootElement(name = "GetPkcs10Request")
public class GetPkcs10Request {

    @XmlElement(name = "CertificateID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Attributes")
    protected BinaryData attributes;

    /**
     * ��ȡcertificateID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * ����certificateID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     */
    public void setAttributes(BinaryData value) {
        this.attributes = value;
    }

}
