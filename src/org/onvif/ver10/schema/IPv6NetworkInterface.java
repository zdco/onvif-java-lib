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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IPv6NetworkInterface complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IPv6NetworkInterface"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Config" type="{http://www.onvif.org/ver10/schema}IPv6Configuration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv6NetworkInterface", propOrder = {
    "enabled",
    "config"
})
public class IPv6NetworkInterface {

    @XmlElement(name = "Enabled")
    protected boolean enabled;
    @XmlElement(name = "Config")
    protected IPv6Configuration config;

    /**
     * 获取enabled属性的值。
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * 设置enabled属性的值。
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * 获取config属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IPv6Configuration }
     *     
     */
    public IPv6Configuration getConfig() {
        return config;
    }

    /**
     * 设置config属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6Configuration }
     *     
     */
    public void setConfig(IPv6Configuration value) {
        this.config = value;
    }

}
