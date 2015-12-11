//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:33:08 PM CST 
//


package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MoveOptions20;


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
 *         &lt;element name="MoveOptions" type="{http://www.onvif.org/ver10/schema}MoveOptions20"/&gt;
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
    "moveOptions"
})
@XmlRootElement(name = "GetMoveOptionsResponse")
public class GetMoveOptionsResponse {

    @XmlElement(name = "MoveOptions", required = true)
    protected MoveOptions20 moveOptions;

    /**
     * 获取moveOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MoveOptions20 }
     *     
     */
    public MoveOptions20 getMoveOptions() {
        return moveOptions;
    }

    /**
     * 设置moveOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MoveOptions20 }
     *     
     */
    public void setMoveOptions(MoveOptions20 value) {
        this.moveOptions = value;
    }

}
