//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>PTZPresetTourSupported complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTZPresetTourSupported"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumNumberOfPresetTours" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PTZPresetTourOperation" type="{http://www.onvif.org/ver10/schema}PTZPresetTourOperation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZPresetTourSupportedExtension" minOccurs="0"/&gt;
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
@XmlType(name = "PTZPresetTourSupported", propOrder = {
    "maximumNumberOfPresetTours",
    "ptzPresetTourOperation",
    "extension"
})
public class PTZPresetTourSupported {

    @XmlElement(name = "MaximumNumberOfPresetTours")
    protected int maximumNumberOfPresetTours;
    @XmlElement(name = "PTZPresetTourOperation")
    @XmlSchemaType(name = "string")
    protected List<PTZPresetTourOperation> ptzPresetTourOperation;
    @XmlElement(name = "Extension")
    protected PTZPresetTourSupportedExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取maximumNumberOfPresetTours属性的值。
     * 
     */
    public int getMaximumNumberOfPresetTours() {
        return maximumNumberOfPresetTours;
    }

    /**
     * 设置maximumNumberOfPresetTours属性的值。
     * 
     */
    public void setMaximumNumberOfPresetTours(int value) {
        this.maximumNumberOfPresetTours = value;
    }

    /**
     * Gets the value of the ptzPresetTourOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzPresetTourOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTZPresetTourOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZPresetTourOperation }
     * 
     * 
     */
    public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
        if (ptzPresetTourOperation == null) {
            ptzPresetTourOperation = new ArrayList<PTZPresetTourOperation>();
        }
        return this.ptzPresetTourOperation;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public PTZPresetTourSupportedExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTZPresetTourSupportedExtension }
     *     
     */
    public void setExtension(PTZPresetTourSupportedExtension value) {
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
