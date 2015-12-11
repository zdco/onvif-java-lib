//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2015.12.11 ʱ�� 09:42:49 PM CST 
//


package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._08.addressing.EndpointReferenceType;
import org.w3c.dom.Element;


/**
 * <p>NotificationMessageHolderType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NotificationMessageHolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}SubscriptionReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}Topic" minOccurs="0"/&gt;
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}ProducerReference" minOccurs="0"/&gt;
 *         &lt;element name="Message"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = {
    "subscriptionReference",
    "topic",
    "producerReference",
    "message"
})
public class NotificationMessageHolderType {

    @XmlElement(name = "SubscriptionReference")
    protected EndpointReferenceType subscriptionReference;
    @XmlElement(name = "Topic")
    protected TopicExpressionType topic;
    @XmlElement(name = "ProducerReference")
    protected EndpointReferenceType producerReference;
    @XmlElement(name = "Message", required = true)
    protected NotificationMessageHolderType.Message message;

    /**
     * ��ȡsubscriptionReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getSubscriptionReference() {
        return subscriptionReference;
    }

    /**
     * ����subscriptionReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setSubscriptionReference(EndpointReferenceType value) {
        this.subscriptionReference = value;
    }

    /**
     * ��ȡtopic���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TopicExpressionType }
     *     
     */
    public TopicExpressionType getTopic() {
        return topic;
    }

    /**
     * ����topic���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TopicExpressionType }
     *     
     */
    public void setTopic(TopicExpressionType value) {
        this.topic = value;
    }

    /**
     * ��ȡproducerReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EndpointReferenceType }
     *     
     */
    public EndpointReferenceType getProducerReference() {
        return producerReference;
    }

    /**
     * ����producerReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointReferenceType }
     *     
     */
    public void setProducerReference(EndpointReferenceType value) {
        this.producerReference = value;
    }

    /**
     * ��ȡmessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NotificationMessageHolderType.Message }
     *     
     */
    public NotificationMessageHolderType.Message getMessage() {
        return message;
    }

    /**
     * ����message���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationMessageHolderType.Message }
     *     
     */
    public void setMessage(NotificationMessageHolderType.Message value) {
        this.message = value;
    }


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
     *         &lt;any processContents='lax'/&gt;
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
        "any"
    })
    public static class Message {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * ��ȡany���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * ����any���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
