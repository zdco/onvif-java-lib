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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FocusMove complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FocusMove"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocus" minOccurs="0"/&gt;
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocus" minOccurs="0"/&gt;
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FocusMove", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class FocusMove {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocus absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocus relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocus continuous;

    /**
     * ��ȡabsolute���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocus }
     *     
     */
    public AbsoluteFocus getAbsolute() {
        return absolute;
    }

    /**
     * ����absolute���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocus }
     *     
     */
    public void setAbsolute(AbsoluteFocus value) {
        this.absolute = value;
    }

    /**
     * ��ȡrelative���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocus }
     *     
     */
    public RelativeFocus getRelative() {
        return relative;
    }

    /**
     * ����relative���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocus }
     *     
     */
    public void setRelative(RelativeFocus value) {
        this.relative = value;
    }

    /**
     * ��ȡcontinuous���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocus }
     *     
     */
    public ContinuousFocus getContinuous() {
        return continuous;
    }

    /**
     * ����continuous���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocus }
     *     
     */
    public void setContinuous(ContinuousFocus value) {
        this.continuous = value;
    }

}
