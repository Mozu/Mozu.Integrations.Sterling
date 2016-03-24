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
    "activityLocation"
})
@XmlRootElement(name = "ContainerActivity")
public class ContainerActivity {

    @XmlAttribute(name = "ActivityCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String activityCode;
    @XmlAttribute(name = "ActivityTimeStamp")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String activityTimeStamp;
    @XmlAttribute(name = "ActivityUserId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String activityUserId;
    @XmlAttribute(name = "ContainerActivityKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String containerActivityKey;
    @XmlAttribute(name = "Createprogid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String createprogid;
    @XmlAttribute(name = "Createts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String createts;
    @XmlAttribute(name = "Createuserid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String createuserid;
    @XmlAttribute(name = "IsCommercialAddress")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isCommercialAddress;
    @XmlAttribute(name = "IsException")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isException;
    @XmlAttribute(name = "Lockid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lockid;
    @XmlAttribute(name = "Modifyprogid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modifyprogid;
    @XmlAttribute(name = "Modifyts")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modifyts;
    @XmlAttribute(name = "Modifyuserid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modifyuserid;
    @XmlAttribute(name = "Notes")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String notes;
    @XmlAttribute(name = "ShipmentContainerKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipmentContainerKey;
    @XmlAttribute(name = "TaxGeoCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxGeoCode;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "ActivityLocation")
    protected ActivityLocation activityLocation;

    /**
     * Gets the value of the activityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets the value of the activityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityCode(String value) {
        this.activityCode = value;
    }

    /**
     * Gets the value of the activityTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityTimeStamp() {
        return activityTimeStamp;
    }

    /**
     * Sets the value of the activityTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityTimeStamp(String value) {
        this.activityTimeStamp = value;
    }

    /**
     * Gets the value of the activityUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityUserId() {
        return activityUserId;
    }

    /**
     * Sets the value of the activityUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityUserId(String value) {
        this.activityUserId = value;
    }

    /**
     * Gets the value of the containerActivityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerActivityKey() {
        return containerActivityKey;
    }

    /**
     * Sets the value of the containerActivityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerActivityKey(String value) {
        this.containerActivityKey = value;
    }

    /**
     * Gets the value of the createprogid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateprogid() {
        return createprogid;
    }

    /**
     * Sets the value of the createprogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateprogid(String value) {
        this.createprogid = value;
    }

    /**
     * Gets the value of the createts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatets() {
        return createts;
    }

    /**
     * Sets the value of the createts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatets(String value) {
        this.createts = value;
    }

    /**
     * Gets the value of the createuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * Sets the value of the createuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuserid(String value) {
        this.createuserid = value;
    }

    /**
     * Gets the value of the isCommercialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCommercialAddress() {
        return isCommercialAddress;
    }

    /**
     * Sets the value of the isCommercialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCommercialAddress(String value) {
        this.isCommercialAddress = value;
    }

    /**
     * Gets the value of the isException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsException() {
        return isException;
    }

    /**
     * Sets the value of the isException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsException(String value) {
        this.isException = value;
    }

    /**
     * Gets the value of the lockid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockid() {
        return lockid;
    }

    /**
     * Sets the value of the lockid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockid(String value) {
        this.lockid = value;
    }

    /**
     * Gets the value of the modifyprogid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyprogid() {
        return modifyprogid;
    }

    /**
     * Sets the value of the modifyprogid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyprogid(String value) {
        this.modifyprogid = value;
    }

    /**
     * Gets the value of the modifyts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyts() {
        return modifyts;
    }

    /**
     * Sets the value of the modifyts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyts(String value) {
        this.modifyts = value;
    }

    /**
     * Gets the value of the modifyuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuserid() {
        return modifyuserid;
    }

    /**
     * Sets the value of the modifyuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuserid(String value) {
        this.modifyuserid = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the shipmentContainerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentContainerKey() {
        return shipmentContainerKey;
    }

    /**
     * Sets the value of the shipmentContainerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentContainerKey(String value) {
        this.shipmentContainerKey = value;
    }

    /**
     * Gets the value of the taxGeoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxGeoCode() {
        return taxGeoCode;
    }

    /**
     * Sets the value of the taxGeoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxGeoCode(String value) {
        this.taxGeoCode = value;
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
     * Gets the value of the activityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityLocation }
     *     
     */
    public ActivityLocation getActivityLocation() {
        return activityLocation;
    }

    /**
     * Sets the value of the activityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityLocation }
     *     
     */
    public void setActivityLocation(ActivityLocation value) {
        this.activityLocation = value;
    }

}