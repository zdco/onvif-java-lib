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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Merge complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Merge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="from" type="{http://www.onvif.org/ver10/schema}ObjectId" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element name="to" type="{http://www.onvif.org/ver10/schema}ObjectId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Merge", propOrder = {
    "from",
    "to"
})
public class Merge {

    @XmlElement(required = true)
    protected List<ObjectId> from;
    @XmlElement(required = true)
    protected ObjectId to;

    /**
     * Gets the value of the from property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the from property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public List<ObjectId> getFrom() {
        if (from == null) {
            from = new ArrayList<ObjectId>();
        }
        return this.from;
    }

    /**
     * 获取to属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObjectId }
     *     
     */
    public ObjectId getTo() {
        return to;
    }

    /**
     * 设置to属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectId }
     *     
     */
    public void setTo(ObjectId value) {
        this.to = value;
    }

}
