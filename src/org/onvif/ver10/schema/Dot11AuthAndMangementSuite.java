//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2015.12.11 时间 09:42:49 PM CST 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Dot11AuthAndMangementSuite的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Dot11AuthAndMangementSuite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Dot1X"/&gt;
 *     &lt;enumeration value="PSK"/&gt;
 *     &lt;enumeration value="Extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Dot11AuthAndMangementSuite")
@XmlEnum
public enum Dot11AuthAndMangementSuite {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Dot1X")
    DOT_1_X("Dot1X"),
    PSK("PSK"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    Dot11AuthAndMangementSuite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Dot11AuthAndMangementSuite fromValue(String v) {
        for (Dot11AuthAndMangementSuite c: Dot11AuthAndMangementSuite.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
