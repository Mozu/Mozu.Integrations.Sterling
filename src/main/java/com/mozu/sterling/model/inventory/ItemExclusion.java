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
@XmlRootElement(name = "ItemExclusion")
public class ItemExclusion {

    @XmlAttribute(name = "ExclusionCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String exclusionCode;

    /**
     * Gets the value of the exclusionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExclusionCode() {
        return exclusionCode;
    }

    /**
     * Sets the value of the exclusionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExclusionCode(String value) {
        this.exclusionCode = value;
    }

}
