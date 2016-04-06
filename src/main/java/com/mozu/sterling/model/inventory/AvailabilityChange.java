//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.04.05 at 10:42:18 AM CDT
//


package com.mozu.sterling.model.inventory;

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
    "availabilityInformation"
})
@XmlRootElement(name = "AvailabilityChange")
public class AvailabilityChange {

    @XmlAttribute(name = "AgentCriteriaId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String agentCriteriaId;
    @XmlAttribute(name = "AlertLevel")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alertLevel;
    @XmlAttribute(name = "AlertQuantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alertQuantity;
    @XmlAttribute(name = "AlertRaisedOn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alertRaisedOn;
    @XmlAttribute(name = "AlertType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alertType;
    @XmlAttribute(name = "DistributionRuleId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String distributionRuleId;
    @XmlAttribute(name = "FirstFutureAvailableDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String firstFutureAvailableDate;
    @XmlAttribute(name = "FutureAvailableDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String futureAvailableDate;
    @XmlAttribute(name = "FutureAvailableQuantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String futureAvailableQuantity;
    @XmlAttribute(name = "IsDefaultDistributionGroup")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isDefaultDistributionGroup;
    @XmlAttribute(name = "MonitorOption")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String monitorOption;
    @XmlAttribute(name = "Node")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String node;
    @XmlAttribute(name = "OnhandAvailableDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onhandAvailableDate;
    @XmlAttribute(name = "OnhandAvailableQuantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String onhandAvailableQuantity;
    @XmlAttribute(name = "OrganizationCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String organizationCode;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "AvailabilityInformation")
    protected AvailabilityInformation availabilityInformation;

    /**
     * Gets the value of the agentCriteriaId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgentCriteriaId() {
        return agentCriteriaId;
    }

    /**
     * Sets the value of the agentCriteriaId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgentCriteriaId(String value) {
        this.agentCriteriaId = value;
    }

    /**
     * Gets the value of the alertLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlertLevel() {
        return alertLevel;
    }

    /**
     * Sets the value of the alertLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlertLevel(String value) {
        this.alertLevel = value;
    }

    /**
     * Gets the value of the alertQuantity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlertQuantity() {
        return alertQuantity;
    }

    /**
     * Sets the value of the alertQuantity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlertQuantity(String value) {
        this.alertQuantity = value;
    }

    /**
     * Gets the value of the alertRaisedOn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlertRaisedOn() {
        return alertRaisedOn;
    }

    /**
     * Sets the value of the alertRaisedOn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlertRaisedOn(String value) {
        this.alertRaisedOn = value;
    }

    /**
     * Gets the value of the alertType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the distributionRuleId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDistributionRuleId() {
        return distributionRuleId;
    }

    /**
     * Sets the value of the distributionRuleId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDistributionRuleId(String value) {
        this.distributionRuleId = value;
    }

    /**
     * Gets the value of the firstFutureAvailableDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstFutureAvailableDate() {
        return firstFutureAvailableDate;
    }

    /**
     * Sets the value of the firstFutureAvailableDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstFutureAvailableDate(String value) {
        this.firstFutureAvailableDate = value;
    }

    /**
     * Gets the value of the futureAvailableDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFutureAvailableDate() {
        return futureAvailableDate;
    }

    /**
     * Sets the value of the futureAvailableDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFutureAvailableDate(String value) {
        this.futureAvailableDate = value;
    }

    /**
     * Gets the value of the futureAvailableQuantity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFutureAvailableQuantity() {
        return futureAvailableQuantity;
    }

    /**
     * Sets the value of the futureAvailableQuantity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFutureAvailableQuantity(String value) {
        this.futureAvailableQuantity = value;
    }

    /**
     * Gets the value of the isDefaultDistributionGroup property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIsDefaultDistributionGroup() {
        return isDefaultDistributionGroup;
    }

    /**
     * Sets the value of the isDefaultDistributionGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIsDefaultDistributionGroup(String value) {
        this.isDefaultDistributionGroup = value;
    }

    /**
     * Gets the value of the monitorOption property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonitorOption() {
        return monitorOption;
    }

    /**
     * Sets the value of the monitorOption property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonitorOption(String value) {
        this.monitorOption = value;
    }

    /**
     * Gets the value of the node property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the onhandAvailableDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnhandAvailableDate() {
        return onhandAvailableDate;
    }

    /**
     * Sets the value of the onhandAvailableDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnhandAvailableDate(String value) {
        this.onhandAvailableDate = value;
    }

    /**
     * Gets the value of the onhandAvailableQuantity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnhandAvailableQuantity() {
        return onhandAvailableQuantity;
    }

    /**
     * Sets the value of the onhandAvailableQuantity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnhandAvailableQuantity(String value) {
        this.onhandAvailableQuantity = value;
    }

    /**
     * Gets the value of the organizationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
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
     * Gets the value of the availabilityInformation property.
     *
     * @return
     *     possible object is
     *     {@link AvailabilityInformation }
     *
     */
    public AvailabilityInformation getAvailabilityInformation() {
        return availabilityInformation;
    }

    /**
     * Sets the value of the availabilityInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link AvailabilityInformation }
     *
     */
    public void setAvailabilityInformation(AvailabilityInformation value) {
        this.availabilityInformation = value;
    }

}
