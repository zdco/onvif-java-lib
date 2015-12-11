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
 * Range of a rectangle. The rectangle itself is defined by lower left corner position and size. Units are pixel.
 * 
 * <p>IntRectangleRange complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IntRectangleRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="YRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="WidthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="HeightRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangleRange", propOrder = {
    "xRange",
    "yRange",
    "widthRange",
    "heightRange"
})
public class IntRectangleRange {

    @XmlElement(name = "XRange", required = true)
    protected IntRange xRange;
    @XmlElement(name = "YRange", required = true)
    protected IntRange yRange;
    @XmlElement(name = "WidthRange", required = true)
    protected IntRange widthRange;
    @XmlElement(name = "HeightRange", required = true)
    protected IntRange heightRange;

    /**
     * ��ȡxRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getXRange() {
        return xRange;
    }

    /**
     * ����xRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setXRange(IntRange value) {
        this.xRange = value;
    }

    /**
     * ��ȡyRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getYRange() {
        return yRange;
    }

    /**
     * ����yRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setYRange(IntRange value) {
        this.yRange = value;
    }

    /**
     * ��ȡwidthRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getWidthRange() {
        return widthRange;
    }

    /**
     * ����widthRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setWidthRange(IntRange value) {
        this.widthRange = value;
    }

    /**
     * ��ȡheightRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getHeightRange() {
        return heightRange;
    }

    /**
     * ����heightRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setHeightRange(IntRange value) {
        this.heightRange = value;
    }

}
