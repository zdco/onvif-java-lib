//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Transport complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Transport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Protocol" type="{http://www.onvif.org/ver10/schema}TransportProtocol"/&gt;
 *         &lt;element name="Tunnel" type="{http://www.onvif.org/ver10/schema}Transport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transport", propOrder = {
    "protocol",
    "tunnel"
})
public class Transport {

    @XmlElement(name = "Protocol", required = true)
    @XmlSchemaType(name = "string")
    protected TransportProtocol protocol;
    @XmlElement(name = "Tunnel")
    protected Transport tunnel;

    /**
     * ��ȡprotocol���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransportProtocol }
     *     
     */
    public TransportProtocol getProtocol() {
        return protocol;
    }

    /**
     * ����protocol���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransportProtocol }
     *     
     */
    public void setProtocol(TransportProtocol value) {
        this.protocol = value;
    }

    /**
     * ��ȡtunnel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Transport }
     *     
     */
    public Transport getTunnel() {
        return tunnel;
    }

    /**
     * ����tunnel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Transport }
     *     
     */
    public void setTunnel(Transport value) {
        this.tunnel = value;
    }

}
