//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Transport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取protocol属性的值。
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
     * 设置protocol属性的值。
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
     * 获取tunnel属性的值。
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
     * 设置tunnel属性的值。
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
