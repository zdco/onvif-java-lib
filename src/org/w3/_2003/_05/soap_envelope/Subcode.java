//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.w3._2003._05.soap_envelope;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>subcode complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="subcode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}QName"/&gt;
 *         &lt;element name="Subcode" type="{http://www.w3.org/2003/05/soap-envelope}subcode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subcode", propOrder = {
    "value",
    "subcode"
})
public class Subcode {

    @XmlElement(name = "Value", required = true)
    protected QName value;
    @XmlElement(name = "Subcode")
    protected Subcode subcode;

    /**
     * ��ȡvalue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValue() {
        return value;
    }

    /**
     * ����value���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValue(QName value) {
        this.value = value;
    }

    /**
     * ��ȡsubcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Subcode }
     *     
     */
    public Subcode getSubcode() {
        return subcode;
    }

    /**
     * ����subcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Subcode }
     *     
     */
    public void setSubcode(Subcode value) {
        this.subcode = value;
    }

}
