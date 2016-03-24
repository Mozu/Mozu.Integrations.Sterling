//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 12:28:23 PM CST 
//


package com.mozu.sterling.model.shipment;

import java.util.ArrayList;
import java.util.List;
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
    "orderApprovalDetails",
    "predecessorOrderApprovals"
})
@XmlRootElement(name = "OrderApproval")
public class OrderApproval {

    @XmlAttribute(name = "ApprovalCycle")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approvalCycle;
    @XmlAttribute(name = "ApprovalGroupKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approvalGroupKey;
    @XmlAttribute(name = "ApproverComments")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverComments;
    @XmlAttribute(name = "ApproverUserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String approverUserID;
    @XmlAttribute(name = "DelegateUserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String delegateUserID;
    @XmlAttribute(name = "IsForCurrentUser")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isForCurrentUser;
    @XmlAttribute(name = "IsMandatory")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isMandatory;
    @XmlAttribute(name = "OrderApprovalKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderApprovalKey;
    @XmlAttribute(name = "OrderHeaderKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderHeaderKey;
    @XmlAttribute(name = "PredecessorOrderApprSeq")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String predecessorOrderApprSeq;
    @XmlAttribute(name = "Sequence")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequence;
    @XmlAttribute(name = "Status")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String status;
    @XmlAttribute(name = "TeamCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String teamCode;
    @XmlAttribute(name = "UserGroupID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userGroupID;
    @XmlAttribute(name = "UserID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userID;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "OrderApprovalDetails")
    protected OrderApprovalDetails orderApprovalDetails;
    @XmlElement(name = "PredecessorOrderApprovals")
    protected PredecessorOrderApprovals predecessorOrderApprovals;

    /**
     * Gets the value of the approvalCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCycle() {
        return approvalCycle;
    }

    /**
     * Sets the value of the approvalCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCycle(String value) {
        this.approvalCycle = value;
    }

    /**
     * Gets the value of the approvalGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalGroupKey() {
        return approvalGroupKey;
    }

    /**
     * Sets the value of the approvalGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalGroupKey(String value) {
        this.approvalGroupKey = value;
    }

    /**
     * Gets the value of the approverComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverComments() {
        return approverComments;
    }

    /**
     * Sets the value of the approverComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverComments(String value) {
        this.approverComments = value;
    }

    /**
     * Gets the value of the approverUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproverUserID() {
        return approverUserID;
    }

    /**
     * Sets the value of the approverUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproverUserID(String value) {
        this.approverUserID = value;
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
     * Gets the value of the isForCurrentUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsForCurrentUser() {
        return isForCurrentUser;
    }

    /**
     * Sets the value of the isForCurrentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsForCurrentUser(String value) {
        this.isForCurrentUser = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMandatory(String value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the orderApprovalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderApprovalKey() {
        return orderApprovalKey;
    }

    /**
     * Sets the value of the orderApprovalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderApprovalKey(String value) {
        this.orderApprovalKey = value;
    }

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
     * Gets the value of the predecessorOrderApprSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredecessorOrderApprSeq() {
        return predecessorOrderApprSeq;
    }

    /**
     * Sets the value of the predecessorOrderApprSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredecessorOrderApprSeq(String value) {
        this.predecessorOrderApprSeq = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the teamCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamCode() {
        return teamCode;
    }

    /**
     * Sets the value of the teamCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamCode(String value) {
        this.teamCode = value;
    }

    /**
     * Gets the value of the userGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupID() {
        return userGroupID;
    }

    /**
     * Sets the value of the userGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupID(String value) {
        this.userGroupID = value;
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
     * Gets the value of the aDtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aDtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADtype() {
        if (aDtype == null) {
            aDtype = new ArrayList<String>();
        }
        return this.aDtype;
    }

    /**
     * Gets the value of the orderApprovalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderApprovalDetails }
     *     
     */
    public OrderApprovalDetails getOrderApprovalDetails() {
        return orderApprovalDetails;
    }

    /**
     * Sets the value of the orderApprovalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderApprovalDetails }
     *     
     */
    public void setOrderApprovalDetails(OrderApprovalDetails value) {
        this.orderApprovalDetails = value;
    }

    /**
     * Gets the value of the predecessorOrderApprovals property.
     * 
     * @return
     *     possible object is
     *     {@link PredecessorOrderApprovals }
     *     
     */
    public PredecessorOrderApprovals getPredecessorOrderApprovals() {
        return predecessorOrderApprovals;
    }

    /**
     * Sets the value of the predecessorOrderApprovals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredecessorOrderApprovals }
     *     
     */
    public void setPredecessorOrderApprovals(PredecessorOrderApprovals value) {
        this.predecessorOrderApprovals = value;
    }

}