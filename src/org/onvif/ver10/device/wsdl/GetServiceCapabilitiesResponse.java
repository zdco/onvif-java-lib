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
 *         &lt;element name="Capabilities" type="{http://www.onvif.org/ver10/device/wsdl}DeviceServiceCapabilities"/&gt;
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
    "capabilities"
})
@XmlRootElement(name = "GetServiceCapabilitiesResponse")
public class GetServiceCapabilitiesResponse {

    @XmlElement(name = "Capabilities", required = true)
    protected DeviceServiceCapabilities capabilities;

    /**
     * ��ȡcapabilities���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeviceServiceCapabilities }
     *     
     */
    public DeviceServiceCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * ����capabilities���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceServiceCapabilities }
     *     
     */
    public void setCapabilities(DeviceServiceCapabilities value) {
        this.capabilities = value;
    }

}
