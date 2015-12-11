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
 * <p>PTZPresetTourOperation�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PTZPresetTourOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Pause"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PTZPresetTourOperation")
@XmlEnum
public enum PTZPresetTourOperation {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Pause")
    PAUSE("Pause"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    PTZPresetTourOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PTZPresetTourOperation fromValue(String v) {
        for (PTZPresetTourOperation c: PTZPresetTourOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
