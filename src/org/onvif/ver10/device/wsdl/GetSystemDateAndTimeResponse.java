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
import org.onvif.ver10.schema.SystemDateTime;


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
 *         &lt;element name="SystemDateAndTime" type="{http://www.onvif.org/ver10/schema}SystemDateTime"/&gt;
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
    "systemDateAndTime"
})
@XmlRootElement(name = "GetSystemDateAndTimeResponse")
public class GetSystemDateAndTimeResponse {

    @XmlElement(name = "SystemDateAndTime", required = true)
    protected SystemDateTime systemDateAndTime;

    /**
     * ��ȡsystemDateAndTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SystemDateTime }
     *     
     */
    public SystemDateTime getSystemDateAndTime() {
        return systemDateAndTime;
    }

    /**
     * ����systemDateAndTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDateTime }
     *     
     */
    public void setSystemDateAndTime(SystemDateTime value) {
        this.systemDateAndTime = value;
    }

}
