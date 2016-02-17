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
    "primaryInformation"
})
@XmlRootElement(name = "ItemLocale")
public class ItemLocale {

    @XmlAttribute(name = "Country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "ItemKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemKey;
    @XmlAttribute(name = "ItemLocaleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemLocaleKey;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "Variant")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String variant;
    @XmlElement(name = "PrimaryInformation")
    protected PrimaryInformation primaryInformation;

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the itemKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * Sets the value of the itemKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemKey(String value) {
        this.itemKey = value;
    }

    /**
     * Gets the value of the itemLocaleKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemLocaleKey() {
        return itemLocaleKey;
    }

    /**
     * Sets the value of the itemLocaleKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemLocaleKey(String value) {
        this.itemLocaleKey = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the variant property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVariant(String value) {
        this.variant = value;
    }

    /**
     * Gets the value of the primaryInformation property.
     *
     * @return
     *     possible object is
     *     {@link PrimaryInformation }
     *
     */
    public PrimaryInformation getPrimaryInformation() {
        return primaryInformation;
    }

    /**
     * Sets the value of the primaryInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link PrimaryInformation }
     *
     */
    public void setPrimaryInformation(PrimaryInformation value) {
        this.primaryInformation = value;
    }

}