//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Scope complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Scope"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScopeDef" type="{http://www.onvif.org/ver10/schema}ScopeDefinition"/&gt;
 *         &lt;element name="ScopeItem" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scope", propOrder = {
    "scopeDef",
    "scopeItem"
})
public class Scope {

    @XmlElement(name = "ScopeDef", required = true)
    @XmlSchemaType(name = "string")
    protected ScopeDefinition scopeDef;
    @XmlElement(name = "ScopeItem", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String scopeItem;

    /**
     * ��ȡscopeDef���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ScopeDefinition }
     *     
     */
    public ScopeDefinition getScopeDef() {
        return scopeDef;
    }

    /**
     * ����scopeDef���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeDefinition }
     *     
     */
    public void setScopeDef(ScopeDefinition value) {
        this.scopeDef = value;
    }

    /**
     * ��ȡscopeItem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeItem() {
        return scopeItem;
    }

    /**
     * ����scopeItem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeItem(String value) {
        this.scopeItem = value;
    }

}
