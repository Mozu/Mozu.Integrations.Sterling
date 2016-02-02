//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.31 at 01:35:41 PM CST 
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
@XmlRootElement(name = "PricingRuleAttributeValue")
public class PricingRuleAttributeValue {

    @XmlAttribute(name = "GroupId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String groupId;
    @XmlAttribute(name = "IncludeOrExclude")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String includeOrExclude;
    @XmlAttribute(name = "PricingRuleAttributeValueKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRuleAttributeValueKey;
    @XmlAttribute(name = "PricingRuleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pricingRuleKey;
    @XmlAttribute(name = "Quantity")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String quantity;
    @XmlAttribute(name = "TriggerAttributeDomainID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeDomainID;
    @XmlAttribute(name = "TriggerAttributeDoubleValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeDoubleValue;
    @XmlAttribute(name = "TriggerAttributeGroupID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeGroupID;
    @XmlAttribute(name = "TriggerAttributeID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeID;
    @XmlAttribute(name = "TriggerAttributeIntegerValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeIntegerValue;
    @XmlAttribute(name = "TriggerAttributeValue")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String triggerAttributeValue;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the includeOrExclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeOrExclude() {
        return includeOrExclude;
    }

    /**
     * Sets the value of the includeOrExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeOrExclude(String value) {
        this.includeOrExclude = value;
    }

    /**
     * Gets the value of the pricingRuleAttributeValueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRuleAttributeValueKey() {
        return pricingRuleAttributeValueKey;
    }

    /**
     * Sets the value of the pricingRuleAttributeValueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRuleAttributeValueKey(String value) {
        this.pricingRuleAttributeValueKey = value;
    }

    /**
     * Gets the value of the pricingRuleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingRuleKey() {
        return pricingRuleKey;
    }

    /**
     * Sets the value of the pricingRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingRuleKey(String value) {
        this.pricingRuleKey = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the triggerAttributeDomainID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeDomainID() {
        return triggerAttributeDomainID;
    }

    /**
     * Sets the value of the triggerAttributeDomainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeDomainID(String value) {
        this.triggerAttributeDomainID = value;
    }

    /**
     * Gets the value of the triggerAttributeDoubleValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeDoubleValue() {
        return triggerAttributeDoubleValue;
    }

    /**
     * Sets the value of the triggerAttributeDoubleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeDoubleValue(String value) {
        this.triggerAttributeDoubleValue = value;
    }

    /**
     * Gets the value of the triggerAttributeGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeGroupID() {
        return triggerAttributeGroupID;
    }

    /**
     * Sets the value of the triggerAttributeGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeGroupID(String value) {
        this.triggerAttributeGroupID = value;
    }

    /**
     * Gets the value of the triggerAttributeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeID() {
        return triggerAttributeID;
    }

    /**
     * Sets the value of the triggerAttributeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeID(String value) {
        this.triggerAttributeID = value;
    }

    /**
     * Gets the value of the triggerAttributeIntegerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeIntegerValue() {
        return triggerAttributeIntegerValue;
    }

    /**
     * Sets the value of the triggerAttributeIntegerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeIntegerValue(String value) {
        this.triggerAttributeIntegerValue = value;
    }

    /**
     * Gets the value of the triggerAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerAttributeValue() {
        return triggerAttributeValue;
    }

    /**
     * Sets the value of the triggerAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerAttributeValue(String value) {
        this.triggerAttributeValue = value;
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