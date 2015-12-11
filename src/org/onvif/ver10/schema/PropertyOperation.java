//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PropertyOperation�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Initialized"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Changed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PropertyOperation")
@XmlEnum
public enum PropertyOperation {

    @XmlEnumValue("Initialized")
    INITIALIZED("Initialized"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Changed")
    CHANGED("Changed");
    private final String value;

    PropertyOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PropertyOperation fromValue(String v) {
        for (PropertyOperation c: PropertyOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
