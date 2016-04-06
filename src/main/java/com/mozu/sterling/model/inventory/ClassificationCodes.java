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
@XmlRootElement(name = "ClassificationCodes")
public class ClassificationCodes {

    @XmlAttribute(name = "CommodityCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String commodityCode;
    @XmlAttribute(name = "ECCNNo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eccnNo;
    @XmlAttribute(name = "HarmonizedCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harmonizedCode;
    @XmlAttribute(name = "HazmatClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String hazmatClass;
    @XmlAttribute(name = "Model")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String model;
    @XmlAttribute(name = "NAICSCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String naicsCode;
    @XmlAttribute(name = "NMFCClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nmfcClass;
    @XmlAttribute(name = "NMFCCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nmfcCode;
    @XmlAttribute(name = "OperationalConfigurationComplete")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String operationalConfigurationComplete;
    @XmlAttribute(name = "PickingType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pickingType;
    @XmlAttribute(name = "PostingClassification")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String postingClassification;
    @XmlAttribute(name = "Schedule_B_Code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scheduleBCode;
    @XmlAttribute(name = "StorageType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String storageType;
    @XmlAttribute(name = "TaxProductCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String taxProductCode;
    @XmlAttribute(name = "UNSPSC")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String unspsc;
    @XmlAttribute(name = "VelocityCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String velocityCode;

    /**
     * Gets the value of the commodityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the eccnNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getECCNNo() {
        return eccnNo;
    }

    /**
     * Sets the value of the eccnNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setECCNNo(String value) {
        this.eccnNo = value;
    }

    /**
     * Gets the value of the harmonizedCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * Sets the value of the harmonizedCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * Gets the value of the hazmatClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHazmatClass() {
        return hazmatClass;
    }

    /**
     * Sets the value of the hazmatClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHazmatClass(String value) {
        this.hazmatClass = value;
    }

    /**
     * Gets the value of the model property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the naicsCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNAICSCode() {
        return naicsCode;
    }

    /**
     * Sets the value of the naicsCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNAICSCode(String value) {
        this.naicsCode = value;
    }

    /**
     * Gets the value of the nmfcClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNMFCClass() {
        return nmfcClass;
    }

    /**
     * Sets the value of the nmfcClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNMFCClass(String value) {
        this.nmfcClass = value;
    }

    /**
     * Gets the value of the nmfcCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNMFCCode() {
        return nmfcCode;
    }

    /**
     * Sets the value of the nmfcCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNMFCCode(String value) {
        this.nmfcCode = value;
    }

    /**
     * Gets the value of the operationalConfigurationComplete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationalConfigurationComplete() {
        return operationalConfigurationComplete;
    }

    /**
     * Sets the value of the operationalConfigurationComplete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationalConfigurationComplete(String value) {
        this.operationalConfigurationComplete = value;
    }

    /**
     * Gets the value of the pickingType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickingType() {
        return pickingType;
    }

    /**
     * Sets the value of the pickingType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickingType(String value) {
        this.pickingType = value;
    }

    /**
     * Gets the value of the postingClassification property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostingClassification() {
        return postingClassification;
    }

    /**
     * Sets the value of the postingClassification property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostingClassification(String value) {
        this.postingClassification = value;
    }

    /**
     * Gets the value of the scheduleBCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduleBCode() {
        return scheduleBCode;
    }

    /**
     * Sets the value of the scheduleBCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScheduleBCode(String value) {
        this.scheduleBCode = value;
    }

    /**
     * Gets the value of the storageType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStorageType(String value) {
        this.storageType = value;
    }

    /**
     * Gets the value of the taxProductCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxProductCode() {
        return taxProductCode;
    }

    /**
     * Sets the value of the taxProductCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxProductCode(String value) {
        this.taxProductCode = value;
    }

    /**
     * Gets the value of the unspsc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUNSPSC() {
        return unspsc;
    }

    /**
     * Sets the value of the unspsc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUNSPSC(String value) {
        this.unspsc = value;
    }

    /**
     * Gets the value of the velocityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVelocityCode() {
        return velocityCode;
    }

    /**
     * Sets the value of the velocityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVelocityCode(String value) {
        this.velocityCode = value;
    }

}
