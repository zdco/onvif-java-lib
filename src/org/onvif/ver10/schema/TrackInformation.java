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
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>TrackInformation complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackToken" type="{http://www.onvif.org/ver10/schema}TrackReference"/&gt;
 *         &lt;element name="TrackType" type="{http://www.onvif.org/ver10/schema}TrackType"/&gt;
 *         &lt;element name="Description" type="{http://www.onvif.org/ver10/schema}Description"/&gt;
 *         &lt;element name="DataFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DataTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "TrackInformation", propOrder = {
    "trackToken",
    "trackType",
    "description",
    "dataFrom",
    "dataTo",
    "any"
})
public class TrackInformation {

    @XmlElement(name = "TrackToken", required = true)
    protected String trackToken;
    @XmlElement(name = "TrackType", required = true)
    @XmlSchemaType(name = "string")
    protected TrackType trackType;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DataFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFrom;
    @XmlElement(name = "DataTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTo;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡtrackToken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackToken() {
        return trackToken;
    }

    /**
     * ����trackToken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackToken(String value) {
        this.trackToken = value;
    }

    /**
     * ��ȡtrackType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackType }
     *     
     */
    public TrackType getTrackType() {
        return trackType;
    }

    /**
     * ����trackType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackType }
     *     
     */
    public void setTrackType(TrackType value) {
        this.trackType = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡdataFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFrom() {
        return dataFrom;
    }

    /**
     * ����dataFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFrom(XMLGregorianCalendar value) {
        this.dataFrom = value;
    }

    /**
     * ��ȡdataTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTo() {
        return dataTo;
    }

    /**
     * ����dataTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTo(XMLGregorianCalendar value) {
        this.dataTo = value;
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
