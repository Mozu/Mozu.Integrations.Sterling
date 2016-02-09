//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.02.09 at 04:46:29 PM CST
//


package com.mozu.sterling.model.inventory;

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
@XmlRootElement(name = "InventoryItem")
public class InventoryItem {

    @XmlAttribute(name = "InventoryOrganizationCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inventoryOrganizationCode;
    @XmlAttribute(name = "ItemID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemID;
    @XmlAttribute(name = "ProductClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String productClass;
    @XmlAttribute(name = "UnitOfMeasure")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unitOfMeasure;

    /**
     * Gets the value of the inventoryOrganizationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInventoryOrganizationCode() {
        return inventoryOrganizationCode;
    }

    /**
     * Sets the value of the inventoryOrganizationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInventoryOrganizationCode(String value) {
        this.inventoryOrganizationCode = value;
    }

    /**
     * Gets the value of the itemID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the productClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProductClass() {
        return productClass;
    }

    /**
     * Sets the value of the productClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProductClass(String value) {
        this.productClass = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

}
