//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.16 at 12:31:15 PM CDT 
//


package com.mozu.sterling.model.order;

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
    "productItem"
})
@XmlRootElement(name = "ProductItems")
public class ProductItems {

    @XmlElement(name = "ProductItem")
    protected ProductItem productItem;

    /**
     * Gets the value of the productItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductItem }
     *     
     */
    public ProductItem getProductItem() {
        return productItem;
    }

    /**
     * Sets the value of the productItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItem }
     *     
     */
    public void setProductItem(ProductItem value) {
        this.productItem = value;
    }

}
