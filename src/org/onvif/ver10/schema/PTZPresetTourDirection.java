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
 * <p>PTZPresetTourDirection�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PTZPresetTourDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *     &lt;enumeration value="Backward"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PTZPresetTourDirection")
@XmlEnum
public enum PTZPresetTourDirection {

    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("Backward")
    BACKWARD("Backward"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    PTZPresetTourDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PTZPresetTourDirection fromValue(String v) {
        for (PTZPresetTourDirection c: PTZPresetTourDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
