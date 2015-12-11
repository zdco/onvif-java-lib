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
 * <p>VideoRateControl complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VideoRateControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EncodingInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl", propOrder = {
    "frameRateLimit",
    "encodingInterval",
    "bitrateLimit"
})
public class VideoRateControl {

    @XmlElement(name = "FrameRateLimit")
    protected int frameRateLimit;
    @XmlElement(name = "EncodingInterval")
    protected int encodingInterval;
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     * ��ȡframeRateLimit���Ե�ֵ��
     * 
     */
    public int getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * ����frameRateLimit���Ե�ֵ��
     * 
     */
    public void setFrameRateLimit(int value) {
        this.frameRateLimit = value;
    }

    /**
     * ��ȡencodingInterval���Ե�ֵ��
     * 
     */
    public int getEncodingInterval() {
        return encodingInterval;
    }

    /**
     * ����encodingInterval���Ե�ֵ��
     * 
     */
    public void setEncodingInterval(int value) {
        this.encodingInterval = value;
    }

    /**
     * ��ȡbitrateLimit���Ե�ֵ��
     * 
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * ����bitrateLimit���Ե�ֵ��
     * 
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
    }

}
