//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:30:43 PM CST 
//


package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StorageType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="StorageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NFS"/&gt;
 *     &lt;enumeration value="CIFS"/&gt;
 *     &lt;enumeration value="CDMI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StorageType")
@XmlEnum
public enum StorageType {


    /**
     * NFS protocol
     * 
     */
    NFS,

    /**
     * CIFS protocol
     * 
     */
    CIFS,

    /**
     * CDMI protocol
     * 
     */
    CDMI;

    public String value() {
        return name();
    }

    public static StorageType fromValue(String v) {
        return valueOf(v);
    }

}
