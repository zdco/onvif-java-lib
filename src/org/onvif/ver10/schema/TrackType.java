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
 * <p>TrackType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TrackType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Video"/&gt;
 *     &lt;enumeration value="Audio"/&gt;
 *     &lt;enumeration value="Metadata"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackType")
@XmlEnum
public enum TrackType {

    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),

    /**
     * Placeholder for future extension.
     * 
     */
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    TrackType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackType fromValue(String v) {
        for (TrackType c: TrackType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
