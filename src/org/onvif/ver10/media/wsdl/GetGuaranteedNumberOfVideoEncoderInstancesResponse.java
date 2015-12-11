//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:34:15 PM CST 
//


package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="JPEG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "totalNumber",
    "jpeg",
    "h264",
    "mpeg4"
})
@XmlRootElement(name = "GetGuaranteedNumberOfVideoEncoderInstancesResponse")
public class GetGuaranteedNumberOfVideoEncoderInstancesResponse {

    @XmlElement(name = "TotalNumber")
    protected int totalNumber;
    @XmlElement(name = "JPEG")
    protected Integer jpeg;
    @XmlElement(name = "H264")
    protected Integer h264;
    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;

    /**
     * ��ȡtotalNumber���Ե�ֵ��
     * 
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     * ����totalNumber���Ե�ֵ��
     * 
     */
    public void setTotalNumber(int value) {
        this.totalNumber = value;
    }

    /**
     * ��ȡjpeg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJPEG() {
        return jpeg;
    }

    /**
     * ����jpeg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJPEG(Integer value) {
        this.jpeg = value;
    }

    /**
     * ��ȡh264���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH264() {
        return h264;
    }

    /**
     * ����h264���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH264(Integer value) {
        this.h264 = value;
    }

    /**
     * ��ȡmpeg4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPEG4() {
        return mpeg4;
    }

    /**
     * ����mpeg4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
    }

}
