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
    "itemLocale"
})
@XmlRootElement(name = "ItemLocaleList")
public class ItemLocaleList {

    @XmlAttribute(name = "TotalNumberOfRecords")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String totalNumberOfRecords;
    @XmlAttribute(name = "a-dtype")
    protected List<String> aDtype;
    @XmlElement(name = "ItemLocale")
    protected ItemLocale itemLocale;

    /**
     * Gets the value of the totalNumberOfRecords property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalNumberOfRecords() {
        return totalNumberOfRecords;
    }

    /**
     * Sets the value of the totalNumberOfRecords property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalNumberOfRecords(String value) {
        this.totalNumberOfRecords = value;
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
     * Gets the value of the itemLocale property.
     *
     * @return
     *     possible object is
     *     {@link ItemLocale }
     *
     */
    public ItemLocale getItemLocale() {
        return itemLocale;
    }

    /**
     * Sets the value of the itemLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link ItemLocale }
     *
     */
    public void setItemLocale(ItemLocale value) {
        this.itemLocale = value;
    }

}
