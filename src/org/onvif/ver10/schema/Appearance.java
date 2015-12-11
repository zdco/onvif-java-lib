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
 * <p>Appearance complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Appearance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transformation" type="{http://www.onvif.org/ver10/schema}Transformation" minOccurs="0"/&gt;
 *         &lt;element name="Shape" type="{http://www.onvif.org/ver10/schema}ShapeDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="Color" type="{http://www.onvif.org/ver10/schema}ColorDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="Class" type="{http://www.onvif.org/ver10/schema}ClassDescriptor" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}AppearanceExtension" minOccurs="0"/&gt;
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
@XmlType(name = "Appearance", propOrder = {
    "transformation",
    "shape",
    "color",
    "clazz",
    "extension"
})
public class Appearance {

    @XmlElement(name = "Transformation")
    protected Transformation transformation;
    @XmlElement(name = "Shape")
    protected ShapeDescriptor shape;
    @XmlElement(name = "Color")
    protected ColorDescriptor color;
    @XmlElement(name = "Class")
    protected ClassDescriptor clazz;
    @XmlElement(name = "Extension")
    protected AppearanceExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * ��ȡtransformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Transformation }
     *     
     */
    public Transformation getTransformation() {
        return transformation;
    }

    /**
     * ����transformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Transformation }
     *     
     */
    public void setTransformation(Transformation value) {
        this.transformation = value;
    }

    /**
     * ��ȡshape���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ShapeDescriptor }
     *     
     */
    public ShapeDescriptor getShape() {
        return shape;
    }

    /**
     * ����shape���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ShapeDescriptor }
     *     
     */
    public void setShape(ShapeDescriptor value) {
        this.shape = value;
    }

    /**
     * ��ȡcolor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ColorDescriptor }
     *     
     */
    public ColorDescriptor getColor() {
        return color;
    }

    /**
     * ����color���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ColorDescriptor }
     *     
     */
    public void setColor(ColorDescriptor value) {
        this.color = value;
    }

    /**
     * ��ȡclazz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClassDescriptor }
     *     
     */
    public ClassDescriptor getClazz() {
        return clazz;
    }

    /**
     * ����clazz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDescriptor }
     *     
     */
    public void setClazz(ClassDescriptor value) {
        this.clazz = value;
    }

    /**
     * ��ȡextension���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppearanceExtension }
     *     
     */
    public AppearanceExtension getExtension() {
        return extension;
    }

    /**
     * ����extension���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppearanceExtension }
     *     
     */
    public void setExtension(AppearanceExtension value) {
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
