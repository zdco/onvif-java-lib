//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>ReceiverCapabilities complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ReceiverCapabilities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="RTP_Multicast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SupportedReceivers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MaximumRTSPURILength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReceiverCapabilities", propOrder = {
    "xAddr",
    "rtpMulticast",
    "rtptcp",
    "rtprtsptcp",
    "supportedReceivers",
    "maximumRTSPURILength",
    "any"
})
public class ReceiverCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;
    @XmlElement(name = "RTP_Multicast")
    protected boolean rtpMulticast;
    @XmlElement(name = "RTP_TCP")
    protected boolean rtptcp;
    @XmlElement(name = "RTP_RTSP_TCP")
    protected boolean rtprtsptcp;
    @XmlElement(name = "SupportedReceivers")
    protected int supportedReceivers;
    @XmlElement(name = "MaximumRTSPURILength")
    protected int maximumRTSPURILength;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡxAddr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXAddr() {
        return xAddr;
    }

    /**
     * ����xAddr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXAddr(String value) {
        this.xAddr = value;
    }

    /**
     * ��ȡrtpMulticast���Ե�ֵ��
     * 
     */
    public boolean isRTPMulticast() {
        return rtpMulticast;
    }

    /**
     * ����rtpMulticast���Ե�ֵ��
     * 
     */
    public void setRTPMulticast(boolean value) {
        this.rtpMulticast = value;
    }

    /**
     * ��ȡrtptcp���Ե�ֵ��
     * 
     */
    public boolean isRTPTCP() {
        return rtptcp;
    }

    /**
     * ����rtptcp���Ե�ֵ��
     * 
     */
    public void setRTPTCP(boolean value) {
        this.rtptcp = value;
    }

    /**
     * ��ȡrtprtsptcp���Ե�ֵ��
     * 
     */
    public boolean isRTPRTSPTCP() {
        return rtprtsptcp;
    }

    /**
     * ����rtprtsptcp���Ե�ֵ��
     * 
     */
    public void setRTPRTSPTCP(boolean value) {
        this.rtprtsptcp = value;
    }

    /**
     * ��ȡsupportedReceivers���Ե�ֵ��
     * 
     */
    public int getSupportedReceivers() {
        return supportedReceivers;
    }

    /**
     * ����supportedReceivers���Ե�ֵ��
     * 
     */
    public void setSupportedReceivers(int value) {
        this.supportedReceivers = value;
    }

    /**
     * ��ȡmaximumRTSPURILength���Ե�ֵ��
     * 
     */
    public int getMaximumRTSPURILength() {
        return maximumRTSPURILength;
    }

    /**
     * ����maximumRTSPURILength���Ե�ֵ��
     * 
     */
    public void setMaximumRTSPURILength(int value) {
        this.maximumRTSPURILength = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * {@link Element }
     * 
     * 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<java.lang.Object>();
        }
        return this.any;
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
