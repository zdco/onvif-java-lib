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
 * <p>FactoryDefaultType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FactoryDefaultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hard"/&gt;
 *     &lt;enumeration value="Soft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FactoryDefaultType")
@XmlEnum
public enum FactoryDefaultType {


    /**
     * Indicates that a hard factory default is requested.
     * 
     */
    @XmlEnumValue("Hard")
    HARD("Hard"),

    /**
     * Indicates that a soft factory default is requested.
     * 
     */
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    FactoryDefaultType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FactoryDefaultType fromValue(String v) {
        for (FactoryDefaultType c: FactoryDefaultType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
