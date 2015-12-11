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
 * <p>ClassType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Animal"/&gt;
 *     &lt;enumeration value="Face"/&gt;
 *     &lt;enumeration value="Human"/&gt;
 *     &lt;enumeration value="Vehical"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClassType")
@XmlEnum
public enum ClassType {

    @XmlEnumValue("Animal")
    ANIMAL("Animal"),
    @XmlEnumValue("Face")
    FACE("Face"),
    @XmlEnumValue("Human")
    HUMAN("Human"),
    @XmlEnumValue("Vehical")
    VEHICAL("Vehical"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassType fromValue(String v) {
        for (ClassType c: ClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
