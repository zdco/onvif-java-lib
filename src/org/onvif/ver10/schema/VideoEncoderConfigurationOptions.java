//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>VideoEncoderConfigurationOptions complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoEncoderConfigurationOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QualityRange" type="{http://www.onvif.org/ver10/schema}IntRange"/&gt;
 *         &lt;element name="JPEG" type="{http://www.onvif.org/ver10/schema}JpegOptions" minOccurs="0"/&gt;
 *         &lt;element name="MPEG4" type="{http://www.onvif.org/ver10/schema}Mpeg4Options" minOccurs="0"/&gt;
 *         &lt;element name="H264" type="{http://www.onvif.org/ver10/schema}H264Options" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoEncoderOptionsExtension" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEncoderConfigurationOptions", propOrder = {
    "qualityRange",
    "jpeg",
    "mpeg4",
    "h264",
    "extension"
})
public class VideoEncoderConfigurationOptions {

    @XmlElement(name = "QualityRange", required = true)
    protected IntRange qualityRange;
    @XmlElement(name = "JPEG")
    protected JpegOptions jpeg;
    @XmlElement(name = "MPEG4")
    protected Mpeg4Options mpeg4;
    @XmlElement(name = "H264")
    protected H264Options h264;
    @XmlElement(name = "Extension")
    protected VideoEncoderOptionsExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡqualityRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getQualityRange() {
        return qualityRange;
    }

    /**
     * ����qualityRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     */
    public void setQualityRange(IntRange value) {
        this.qualityRange = value;
    }

    /**
     * ��ȡjpeg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JpegOptions }
     *     
     */
    public JpegOptions getJPEG() {
        return jpeg;
    }

    /**
     * ����jpeg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JpegOptions }
     *     
     */
    public void setJPEG(JpegOptions value) {
        this.jpeg = value;
    }

    /**
     * ��ȡmpeg4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Mpeg4Options }
     *     
     */
    public Mpeg4Options getMPEG4() {
        return mpeg4;
    }

    /**
     * ����mpeg4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Mpeg4Options }
     *     
     */
    public void setMPEG4(Mpeg4Options value) {
        this.mpeg4 = value;
    }

    /**
     * ��ȡh264���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link H264Options }
     *     
     */
    public H264Options getH264() {
        return h264;
    }

    /**
     * ����h264���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link H264Options }
     *     
     */
    public void setH264(H264Options value) {
        this.h264 = value;
    }

    /**
     * ��ȡextension���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public VideoEncoderOptionsExtension getExtension() {
        return extension;
    }

    /**
     * ����extension���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEncoderOptionsExtension }
     *     
     */
    public void setExtension(VideoEncoderOptionsExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
