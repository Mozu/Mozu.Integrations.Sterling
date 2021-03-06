//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.04.05 at 10:42:18 AM CDT
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
@XmlRootElement(name = "AssetLocale")
public class AssetLocale {

    @XmlAttribute(name = "AssetKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String assetKey;
    @XmlAttribute(name = "AssetLocaleKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String assetLocaleKey;
    @XmlAttribute(name = "ContentID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contentID;
    @XmlAttribute(name = "ContentLocation")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String contentLocation;
    @XmlAttribute(name = "Country")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "Description")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String description;
    @XmlAttribute(name = "Label")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String label;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "Variant")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String variant;

    /**
     * Gets the value of the assetKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetKey() {
        return assetKey;
    }

    /**
     * Sets the value of the assetKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetKey(String value) {
        this.assetKey = value;
    }

    /**
     * Gets the value of the assetLocaleKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAssetLocaleKey() {
        return assetLocaleKey;
    }

    /**
     * Sets the value of the assetLocaleKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAssetLocaleKey(String value) {
        this.assetLocaleKey = value;
    }

    /**
     * Gets the value of the contentID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the contentLocation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Sets the value of the contentLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentLocation(String value) {
        this.contentLocation = value;
    }

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
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLabel(String value) {
        this.label = value;
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
