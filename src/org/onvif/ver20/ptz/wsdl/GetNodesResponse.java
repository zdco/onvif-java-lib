//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:39:54 PM CST 
//


package org.onvif.ver20.ptz.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PTZNode;


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
 *         &lt;element name="PTZNode" type="{http://www.onvif.org/ver10/schema}PTZNode" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "ptzNode"
})
@XmlRootElement(name = "GetNodesResponse")
public class GetNodesResponse {

    @XmlElement(name = "PTZNode")
    protected List<PTZNode> ptzNode;

    /**
     * Gets the value of the ptzNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptzNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTZNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTZNode }
     * 
     * 
     */
    public List<PTZNode> getPTZNode() {
        if (ptzNode == null) {
            ptzNode = new ArrayList<PTZNode>();
        }
        return this.ptzNode;
    }

}
