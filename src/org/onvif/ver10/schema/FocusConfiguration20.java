//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>FocusConfiguration20 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FocusConfiguration20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoFocusMode" type="{http://www.onvif.org/ver10/schema}AutoFocusMode"/&gt;
 *         &lt;element name="DefaultSpeed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="NearLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="FarLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusConfiguration20Extension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusConfiguration20", propOrder = {
    "autoFocusMode",
    "defaultSpeed",
    "nearLimit",
    "farLimit",
    "extension"
})
public class FocusConfiguration20 {

    @XmlElement(name = "AutoFocusMode", required = true)
    @XmlSchemaType(name = "string")
    protected AutoFocusMode autoFocusMode;
    @XmlElement(name = "DefaultSpeed")
    protected Float defaultSpeed;
    @XmlElement(name = "NearLimit")
    protected Float nearLimit;
    @XmlElement(name = "FarLimit")
    protected Float farLimit;
    @XmlElement(name = "Extension")
    protected FocusConfiguration20Extension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取autoFocusMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AutoFocusMode }
     *     
     */
    public AutoFocusMode getAutoFocusMode() {
        return autoFocusMode;
    }

    /**
     * 设置autoFocusMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AutoFocusMode }
     *     
     */
    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    /**
     * 获取defaultSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefaultSpeed() {
        return defaultSpeed;
    }

    /**
     * 设置defaultSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefaultSpeed(Float value) {
        this.defaultSpeed = value;
    }

    /**
     * 获取nearLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNearLimit() {
        return nearLimit;
    }

    /**
     * 设置nearLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNearLimit(Float value) {
        this.nearLimit = value;
    }

    /**
     * 获取farLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFarLimit() {
        return farLimit;
    }

    /**
     * 设置farLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFarLimit(Float value) {
        this.farLimit = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public FocusConfiguration20Extension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusConfiguration20Extension }
     *     
     */
    public void setExtension(FocusConfiguration20Extension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
