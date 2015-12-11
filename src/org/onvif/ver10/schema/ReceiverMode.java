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
 * <p>ReceiverMode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiverMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AutoConnect"/&gt;
 *     &lt;enumeration value="AlwaysConnect"/&gt;
 *     &lt;enumeration value="NeverConnect"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReceiverMode")
@XmlEnum
public enum ReceiverMode {


    /**
     * The receiver connects on demand, as required by consumers of the media streams.
     * 
     */
    @XmlEnumValue("AutoConnect")
    AUTO_CONNECT("AutoConnect"),

    /**
     * The receiver attempts to maintain a persistent connection to the configured endpoint.
     * 
     */
    @XmlEnumValue("AlwaysConnect")
    ALWAYS_CONNECT("AlwaysConnect"),

    /**
     * The receiver does not attempt to connect.
     * 
     */
    @XmlEnumValue("NeverConnect")
    NEVER_CONNECT("NeverConnect"),

    /**
     * This case should never happen.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverMode fromValue(String v) {
        for (ReceiverMode c: ReceiverMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
