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
@XmlRootElement(name = "ItemAttrGroupLocale")
public class ItemAttrGroupLocale {

    @XmlAttribute(name = "Country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "ItemAttrGroupKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttrGroupKey;
    @XmlAttribute(name = "ItemAttrGroupLocaleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttrGroupLocaleKey;
    @XmlAttribute(name = "ItemAttributeGroupDescription")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String itemAttributeGroupDescription;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "Variant")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String variant;

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
     * Gets the value of the itemAttrGroupKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemAttrGroupKey() {
        return itemAttrGroupKey;
    }

    /**
     * Sets the value of the itemAttrGroupKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemAttrGroupKey(String value) {
        this.itemAttrGroupKey = value;
    }

    /**
     * Gets the value of the itemAttrGroupLocaleKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemAttrGroupLocaleKey() {
        return itemAttrGroupLocaleKey;
    }

    /**
     * Sets the value of the itemAttrGroupLocaleKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemAttrGroupLocaleKey(String value) {
        this.itemAttrGroupLocaleKey = value;
    }

    /**
     * Gets the value of the itemAttributeGroupDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getItemAttributeGroupDescription() {
        return itemAttributeGroupDescription;
    }

    /**
     * Sets the value of the itemAttributeGroupDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setItemAttributeGroupDescription(String value) {
        this.itemAttributeGroupDescription = value;
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

}
