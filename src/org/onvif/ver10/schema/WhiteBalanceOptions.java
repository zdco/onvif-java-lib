//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WhiteBalanceOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WhiteBalanceOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://www.onvif.org/ver10/schema}WhiteBalanceMode" maxOccurs="unbounded"/&gt;
 *         &lt;element name="YrGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *         &lt;element name="YbGain" type="{http://www.onvif.org/ver10/schema}FloatRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WhiteBalanceOptions", propOrder = {
    "mode",
    "yrGain",
    "ybGain"
})
public class WhiteBalanceOptions {

    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<WhiteBalanceMode> mode;
    @XmlElement(name = "YrGain", required = true)
    protected FloatRange yrGain;
    @XmlElement(name = "YbGain", required = true)
    protected FloatRange ybGain;

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WhiteBalanceMode }
     * 
     * 
     */
    public List<WhiteBalanceMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<WhiteBalanceMode>();
        }
        return this.mode;
    }

    /**
     * ��ȡyrGain���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getYrGain() {
        return yrGain;
    }

    /**
     * ����yrGain���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setYrGain(FloatRange value) {
        this.yrGain = value;
    }

    /**
     * ��ȡybGain���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getYbGain() {
        return ybGain;
    }

    /**
     * ����ybGain���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     */
    public void setYbGain(FloatRange value) {
        this.ybGain = value;
    }

}
