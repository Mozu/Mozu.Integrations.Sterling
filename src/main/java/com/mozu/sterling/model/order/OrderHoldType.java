//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.16 at 12:31:15 PM CDT 
//


package com.mozu.sterling.model.order;

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
@XmlRootElement(name = "OrderHoldType")
public class OrderHoldType {

    @XmlAttribute(name = "HoldType", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String holdType;
    @XmlAttribute(name = "ReasonText")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reasonText;
    @XmlAttribute(name = "ResolverUserId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String resolverUserId;

    /**
     * Gets the value of the holdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldType() {
        return holdType;
    }

    /**
     * Sets the value of the holdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldType(String value) {
        this.holdType = value;
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
    }

    /**
     * Gets the value of the resolverUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolverUserId() {
        return resolverUserId;
    }

    /**
     * Sets the value of the resolverUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolverUserId(String value) {
        this.resolverUserId = value;
    }

}
