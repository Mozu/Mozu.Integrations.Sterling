//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PaymentTransactionError")
public class PaymentTransactionError {

    @XmlAttribute(name = "ChargeTransactionKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String chargeTransactionKey;
    @XmlAttribute(name = "Message")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String message;
    @XmlAttribute(name = "MessageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String messageType;

    /**
     * Gets the value of the chargeTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeTransactionKey() {
        return chargeTransactionKey;
    }

    /**
     * Sets the value of the chargeTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeTransactionKey(String value) {
        this.chargeTransactionKey = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

}
