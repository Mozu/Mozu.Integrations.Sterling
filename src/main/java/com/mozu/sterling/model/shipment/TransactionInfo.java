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
@XmlRootElement(name = "TransactionInfo")
public class TransactionInfo {

    @XmlAttribute(name = "OrderHeaderKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderHeaderKey;
    @XmlAttribute(name = "OrderLineKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderLineKey;

    /**
     * Gets the value of the orderHeaderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderKey() {
        return orderHeaderKey;
    }

    /**
     * Sets the value of the orderHeaderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderKey(String value) {
        this.orderHeaderKey = value;
    }

    /**
     * Gets the value of the orderLineKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineKey() {
        return orderLineKey;
    }

    /**
     * Sets the value of the orderLineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineKey(String value) {
        this.orderLineKey = value;
    }

}