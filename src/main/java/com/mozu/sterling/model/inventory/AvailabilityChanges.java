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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "availabilityChange"
})
@XmlRootElement(name = "AvailabilityChanges")
public class AvailabilityChanges {

    @XmlElement(name = "AvailabilityChange")
    protected List<AvailabilityChange> availabilityChange;

    /**
     * Gets the value of the availabilityChange property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availabilityChange property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailabilityChange().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailabilityChange }
     *
     *
     */
    public List<AvailabilityChange> getAvailabilityChange() {
        if (availabilityChange == null) {
            availabilityChange = new ArrayList<AvailabilityChange>();
        }
        return this.availabilityChange;
    }

}
