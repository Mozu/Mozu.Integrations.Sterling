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
    "attribute",
    "assignedValueList"
})
@XmlRootElement(name = "ItemAttribute")
public class ItemAttribute {

    @XmlAttribute(name = "AttributeDomainID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributeDomainID;
    @XmlAttribute(name = "AttributeGroupID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String attributeGroupID;
    @XmlAttribute(name = "CategoryKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String categoryKey;
    @XmlAttribute(name = "IsInherited")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isInherited;
    @XmlAttribute(name = "IsKeyAttribute")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String isKeyAttribute;
    @XmlAttribute(name = "ItemAttributeDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeDescription;
    @XmlAttribute(name = "ItemAttributeGroupKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeGroupKey;
    @XmlAttribute(name = "ItemAttributeGroupType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeGroupType;
    @XmlAttribute(name = "ItemAttributeKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeKey;
    @XmlAttribute(name = "ItemAttributeName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeName;
    @XmlAttribute(name = "SequenceNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sequenceNo;
    @XmlAttribute(name = "Value")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "Attribute")
    protected Attribute attribute;
    @XmlElement(name = "AssignedValueList")
    protected AssignedValueList assignedValueList;

    /**
     * Gets the value of the attributeDomainID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeDomainID() {
        return attributeDomainID;
    }

    /**
     * Sets the value of the attributeDomainID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeDomainID(String value) {
        this.attributeDomainID = value;
    }

    /**
     * Gets the value of the attributeGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeGroupID() {
        return attributeGroupID;
    }

    /**
     * Sets the value of the attributeGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeGroupID(String value) {
        this.attributeGroupID = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
    }

    /**
     * Gets the value of the isInherited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInherited() {
        return isInherited;
    }

    /**
     * Sets the value of the isInherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInherited(String value) {
        this.isInherited = value;
    }

    /**
     * Gets the value of the isKeyAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsKeyAttribute() {
        return isKeyAttribute;
    }

    /**
     * Sets the value of the isKeyAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsKeyAttribute(String value) {
        this.isKeyAttribute = value;
    }

    /**
     * Gets the value of the itemAttributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAttributeDescription() {
        return itemAttributeDescription;
    }

    /**
     * Sets the value of the itemAttributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAttributeDescription(String value) {
        this.itemAttributeDescription = value;
    }

    /**
     * Gets the value of the itemAttributeGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAttributeGroupKey() {
        return itemAttributeGroupKey;
    }

    /**
     * Sets the value of the itemAttributeGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAttributeGroupKey(String value) {
        this.itemAttributeGroupKey = value;
    }

    /**
     * Gets the value of the itemAttributeGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAttributeGroupType() {
        return itemAttributeGroupType;
    }

    /**
     * Sets the value of the itemAttributeGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAttributeGroupType(String value) {
        this.itemAttributeGroupType = value;
    }

    /**
     * Gets the value of the itemAttributeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAttributeKey() {
        return itemAttributeKey;
    }

    /**
     * Sets the value of the itemAttributeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAttributeKey(String value) {
        this.itemAttributeKey = value;
    }

    /**
     * Gets the value of the itemAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemAttributeName() {
        return itemAttributeName;
    }

    /**
     * Sets the value of the itemAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemAttributeName(String value) {
        this.itemAttributeName = value;
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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link Attribute }
     *     
     */
    public Attribute getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribute }
     *     
     */
    public void setAttribute(Attribute value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the assignedValueList property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedValueList }
     *     
     */
    public AssignedValueList getAssignedValueList() {
        return assignedValueList;
    }

    /**
     * Sets the value of the assignedValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedValueList }
     *     
     */
    public void setAssignedValueList(AssignedValueList value) {
        this.assignedValueList = value;
    }

}
