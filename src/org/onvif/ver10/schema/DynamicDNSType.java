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
 * <p>DynamicDNSType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicDNSType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoUpdate"/&gt;
 *     &lt;enumeration value="ClientUpdates"/&gt;
 *     &lt;enumeration value="ServerUpdates"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DynamicDNSType")
@XmlEnum
public enum DynamicDNSType {

    @XmlEnumValue("NoUpdate")
    NO_UPDATE("NoUpdate"),
    @XmlEnumValue("ClientUpdates")
    CLIENT_UPDATES("ClientUpdates"),
    @XmlEnumValue("ServerUpdates")
    SERVER_UPDATES("ServerUpdates");
    private final String value;

    DynamicDNSType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicDNSType fromValue(String v) {
        for (DynamicDNSType c: DynamicDNSType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
