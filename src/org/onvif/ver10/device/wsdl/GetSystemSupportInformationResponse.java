//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:30:43 PM CST 
//


package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SupportInformation;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupportInformation" type="{http://www.onvif.org/ver10/schema}SupportInformation"/&gt;
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
    "supportInformation"
})
@XmlRootElement(name = "GetSystemSupportInformationResponse")
public class GetSystemSupportInformationResponse {

    @XmlElement(name = "SupportInformation", required = true)
    protected SupportInformation supportInformation;

    /**
     * 获取supportInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupportInformation }
     *     
     */
    public SupportInformation getSupportInformation() {
        return supportInformation;
    }

    /**
     * 设置supportInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupportInformation }
     *     
     */
    public void setSupportInformation(SupportInformation value) {
        this.supportInformation = value;
    }

}
