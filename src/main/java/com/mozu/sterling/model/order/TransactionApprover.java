//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.31 at 01:35:41 PM CST 
//


package com.mozu.sterling.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionApprovalStatusList"
})
@XmlRootElement(name = "TransactionApprover")
public class TransactionApprover {

    @XmlAttribute(name = "ApproverUserGroupID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverUserGroupID;
    @XmlAttribute(name = "ApproverUserTeam")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverUserTeam;
    @XmlAttribute(name = "DelegateUserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String delegateUserID;
    @XmlAttribute(name = "TransactionApproverKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transactionApproverKey;
    @XmlAttribute(name = "UserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userID;
    @XmlElement(name = "TransactionApprovalStatusList")
    protected TransactionApprovalStatusList transactionApprovalStatusList;

    /**
     * Gets the value of the approverUserGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverUserGroupID() {
        return approverUserGroupID;
    }

    /**
     * Sets the value of the approverUserGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverUserGroupID(String value) {
        this.approverUserGroupID = value;
    }

    /**
     * Gets the value of the approverUserTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverUserTeam() {
        return approverUserTeam;
    }

    /**
     * Sets the value of the approverUserTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverUserTeam(String value) {
        this.approverUserTeam = value;
    }

    /**
     * Gets the value of the delegateUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegateUserID() {
        return delegateUserID;
    }

    /**
     * Sets the value of the delegateUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegateUserID(String value) {
        this.delegateUserID = value;
    }

    /**
     * Gets the value of the transactionApproverKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionApproverKey() {
        return transactionApproverKey;
    }

    /**
     * Sets the value of the transactionApproverKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionApproverKey(String value) {
        this.transactionApproverKey = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the transactionApprovalStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionApprovalStatusList }
     *     
     */
    public TransactionApprovalStatusList getTransactionApprovalStatusList() {
        return transactionApprovalStatusList;
    }

    /**
     * Sets the value of the transactionApprovalStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionApprovalStatusList }
     *     
     */
    public void setTransactionApprovalStatusList(TransactionApprovalStatusList value) {
        this.transactionApprovalStatusList = value;
    }

}
