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
 * <p>PTZSpeed complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PTZSpeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/&gt;
 *         &lt;element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = {
    "panTilt",
    "zoom"
})
public class PTZSpeed {

    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;
    @XmlElement(name = "Zoom")
    protected Vector1D zoom;

    /**
     * 获取panTilt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vector2D }
     *     
     */
    public Vector2D getPanTilt() {
        return panTilt;
    }

    /**
     * 设置panTilt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vector2D }
     *     
     */
    public void setPanTilt(Vector2D value) {
        this.panTilt = value;
    }

    /**
     * 获取zoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vector1D }
     *     
     */
    public Vector1D getZoom() {
        return zoom;
    }

    /**
     * 设置zoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vector1D }
     *     
     */
    public void setZoom(Vector1D value) {
        this.zoom = value;
    }

}
