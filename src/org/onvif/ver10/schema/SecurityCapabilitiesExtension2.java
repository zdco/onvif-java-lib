//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>SecurityCapabilitiesExtension2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SecurityCapabilitiesExtension2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SupportedEAPMethod" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension2", propOrder = {
    "dot1X",
    "supportedEAPMethod",
    "remoteUserHandling",
    "any"
})
public class SecurityCapabilitiesExtension2 {

    @XmlElement(name = "Dot1X")
    protected boolean dot1X;
    @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
    protected List<Integer> supportedEAPMethod;
    @XmlElement(name = "RemoteUserHandling")
    protected boolean remoteUserHandling;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     * 获取dot1X属性的值。
     * 
     */
    public boolean isDot1X() {
        return dot1X;
    }

    /**
     * 设置dot1X属性的值。
     * 
     */
    public void setDot1X(boolean value) {
        this.dot1X = value;
    }

    /**
     * Gets the value of the supportedEAPMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedEAPMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSupportedEAPMethod() {
        if (supportedEAPMethod == null) {
            supportedEAPMethod = new ArrayList<Integer>();
        }
        return this.supportedEAPMethod;
    }

    /**
     * 获取remoteUserHandling属性的值。
     * 
     */
    public boolean isRemoteUserHandling() {
        return remoteUserHandling;
    }

    /**
     * 设置remoteUserHandling属性的值。
     * 
     */
    public void setRemoteUserHandling(boolean value) {
        this.remoteUserHandling = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
    }

}
