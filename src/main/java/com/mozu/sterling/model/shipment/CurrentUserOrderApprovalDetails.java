//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currentOrderApprovalDetails",
    "predecessorOrderApprovalDetails"
})
@XmlRootElement(name = "CurrentUserOrderApprovalDetails")
public class CurrentUserOrderApprovalDetails {

    @XmlElement(name = "CurrentOrderApprovalDetails")
    protected CurrentOrderApprovalDetails currentOrderApprovalDetails;
    @XmlElement(name = "PredecessorOrderApprovalDetails")
    protected PredecessorOrderApprovalDetails predecessorOrderApprovalDetails;

    /**
     * Gets the value of the currentOrderApprovalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentOrderApprovalDetails }
     *     
     */
    public CurrentOrderApprovalDetails getCurrentOrderApprovalDetails() {
        return currentOrderApprovalDetails;
    }

    /**
     * Sets the value of the currentOrderApprovalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentOrderApprovalDetails }
     *     
     */
    public void setCurrentOrderApprovalDetails(CurrentOrderApprovalDetails value) {
        this.currentOrderApprovalDetails = value;
    }

    /**
     * Gets the value of the predecessorOrderApprovalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PredecessorOrderApprovalDetails }
     *     
     */
    public PredecessorOrderApprovalDetails getPredecessorOrderApprovalDetails() {
        return predecessorOrderApprovalDetails;
    }

    /**
     * Sets the value of the predecessorOrderApprovalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredecessorOrderApprovalDetails }
     *     
     */
    public void setPredecessorOrderApprovalDetails(PredecessorOrderApprovalDetails value) {
        this.predecessorOrderApprovalDetails = value;
    }

}
