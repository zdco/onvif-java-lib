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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>AudioDecoderConfigurationOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AudioDecoderConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AACDecOptions" type="{http://www.onvif.org/ver10/schema}AACDecOptions" minOccurs="0"/&gt;
 *         &lt;element name="G711DecOptions" type="{http://www.onvif.org/ver10/schema}G711DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="G726DecOptions" type="{http://www.onvif.org/ver10/schema}G726DecOptions" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfigurationOptionsExtension" minOccurs="0"/&gt;
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
@XmlType(name = "AudioDecoderConfigurationOptions", propOrder = {
    "aacDecOptions",
    "g711DecOptions",
    "g726DecOptions",
    "extension"
})
public class AudioDecoderConfigurationOptions {

    @XmlElement(name = "AACDecOptions")
    protected AACDecOptions aacDecOptions;
    @XmlElement(name = "G711DecOptions")
    protected G711DecOptions g711DecOptions;
    @XmlElement(name = "G726DecOptions")
    protected G726DecOptions g726DecOptions;
    @XmlElement(name = "Extension")
    protected AudioDecoderConfigurationOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * 获取aacDecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AACDecOptions }
     *     
     */
    public AACDecOptions getAACDecOptions() {
        return aacDecOptions;
    }

    /**
     * 设置aacDecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AACDecOptions }
     *     
     */
    public void setAACDecOptions(AACDecOptions value) {
        this.aacDecOptions = value;
    }

    /**
     * 获取g711DecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link G711DecOptions }
     *     
     */
    public G711DecOptions getG711DecOptions() {
        return g711DecOptions;
    }

    /**
     * 设置g711DecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link G711DecOptions }
     *     
     */
    public void setG711DecOptions(G711DecOptions value) {
        this.g711DecOptions = value;
    }

    /**
     * 获取g726DecOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link G726DecOptions }
     *     
     */
    public G726DecOptions getG726DecOptions() {
        return g726DecOptions;
    }

    /**
     * 设置g726DecOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link G726DecOptions }
     *     
     */
    public void setG726DecOptions(G726DecOptions value) {
        this.g726DecOptions = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfigurationOptionsExtension }
     *     
     */
    public AudioDecoderConfigurationOptionsExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfigurationOptionsExtension }
     *     
     */
    public void setExtension(AudioDecoderConfigurationOptionsExtension value) {
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
