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
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CertificateInformation;


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
 *         &lt;element name="CertificateInformation" type="{http://www.onvif.org/ver10/schema}CertificateInformation"/&gt;
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
    "certificateInformation"
})
@XmlRootElement(name = "GetCertificateInformationResponse")
public class GetCertificateInformationResponse {

    @XmlElement(name = "CertificateInformation", required = true)
    protected CertificateInformation certificateInformation;

    /**
     * ��ȡcertificateInformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CertificateInformation }
     *     
     */
    public CertificateInformation getCertificateInformation() {
        return certificateInformation;
    }

    /**
     * ����certificateInformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateInformation }
     *     
     */
    public void setCertificateInformation(CertificateInformation value) {
        this.certificateInformation = value;
    }

}
