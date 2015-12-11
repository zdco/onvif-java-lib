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
 * <p>Mpeg4Configuration complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Mpeg4Configuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Mpeg4Profile" type="{http://www.onvif.org/ver10/schema}Mpeg4Profile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mpeg4Configuration", propOrder = {
    "govLength",
    "mpeg4Profile"
})
public class Mpeg4Configuration {

    @XmlElement(name = "GovLength")
    protected int govLength;
    @XmlElement(name = "Mpeg4Profile", required = true)
    @XmlSchemaType(name = "string")
    protected Mpeg4Profile mpeg4Profile;

    /**
     * ��ȡgovLength���Ե�ֵ��
     * 
     */
    public int getGovLength() {
        return govLength;
    }

    /**
     * ����govLength���Ե�ֵ��
     * 
     */
    public void setGovLength(int value) {
        this.govLength = value;
    }

    /**
     * ��ȡmpeg4Profile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Profile }
     *     
     */
    public Mpeg4Profile getMpeg4Profile() {
        return mpeg4Profile;
    }

    /**
     * ����mpeg4Profile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Profile }
     *     
     */
    public void setMpeg4Profile(Mpeg4Profile value) {
        this.mpeg4Profile = value;
    }

}
