//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.16 at 12:31:15 PM CDT 
//


package com.mozu.sterling.model.order;

import java.util.ArrayList;
import java.util.List;
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
@XmlRootElement(name = "Note")
public class Note {

    @XmlAttribute(name = "AuditTransactionId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String auditTransactionId;
    @XmlAttribute(name = "ContactReference")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contactReference;
    @XmlAttribute(name = "ContactTime")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contactTime;
    @XmlAttribute(name = "ContactType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contactType;
    @XmlAttribute(name = "ContactUser")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contactUser;
    @XmlAttribute(name = "CustomerSatIndicator")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customerSatIndicator;
    @XmlAttribute(name = "NoteText", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String noteText;
    @XmlAttribute(name = "Priority")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String priority;
    @XmlAttribute(name = "ReasonCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String reasonCode;
    @XmlAttribute(name = "SequenceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequenceNo;
    @XmlAttribute(name = "Tranid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tranid;
    @XmlAttribute(name = "VisibleToAll")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String visibleToAll;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the auditTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditTransactionId() {
        return auditTransactionId;
    }

    /**
     * Sets the value of the auditTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditTransactionId(String value) {
        this.auditTransactionId = value;
    }

    /**
     * Gets the value of the contactReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactReference() {
        return contactReference;
    }

    /**
     * Sets the value of the contactReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactReference(String value) {
        this.contactReference = value;
    }

    /**
     * Gets the value of the contactTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTime() {
        return contactTime;
    }

    /**
     * Sets the value of the contactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTime(String value) {
        this.contactTime = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the contactUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactUser() {
        return contactUser;
    }

    /**
     * Sets the value of the contactUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactUser(String value) {
        this.contactUser = value;
    }

    /**
     * Gets the value of the customerSatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSatIndicator() {
        return customerSatIndicator;
    }

    /**
     * Sets the value of the customerSatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSatIndicator(String value) {
        this.customerSatIndicator = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the sequenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNo() {
        return sequenceNo;
    }

    /**
     * Sets the value of the sequenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNo(String value) {
        this.sequenceNo = value;
    }

    /**
     * Gets the value of the tranid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranid() {
        return tranid;
    }

    /**
     * Sets the value of the tranid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranid(String value) {
        this.tranid = value;
    }

    /**
     * Gets the value of the visibleToAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleToAll() {
        return visibleToAll;
    }

    /**
     * Sets the value of the visibleToAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleToAll(String value) {
        this.visibleToAll = value;
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

}
