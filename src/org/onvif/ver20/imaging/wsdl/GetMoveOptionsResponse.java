//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:33:08 PM CST 
//


package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.MoveOptions20;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MoveOptions" type="{http://www.onvif.org/ver10/schema}MoveOptions20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moveOptions"
})
@XmlRootElement(name = "GetMoveOptionsResponse")
public class GetMoveOptionsResponse {

    @XmlElement(name = "MoveOptions", required = true)
    protected MoveOptions20 moveOptions;

    /**
     * ��ȡmoveOptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MoveOptions20 }
     *     
     */
    public MoveOptions20 getMoveOptions() {
        return moveOptions;
    }

    /**
     * ����moveOptions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MoveOptions20 }
     *     
     */
    public void setMoveOptions(MoveOptions20 value) {
        this.moveOptions = value;
    }

}
