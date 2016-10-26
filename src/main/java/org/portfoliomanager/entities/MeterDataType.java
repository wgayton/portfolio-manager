
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * A service type used for getting and receiving meter consumption data
 * 
 * <p>Java class for meterDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}meterConsumption" maxOccurs="120" minOccurs="0"/>
 *         &lt;element ref="{}meterDelivery" maxOccurs="120" minOccurs="0"/>
 *         &lt;element name="links" type="{}linksType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterDataType", propOrder = {
    "meterConsumption",
    "meterDelivery",
    "links"
})
public class MeterDataType {

    protected List<MeterConsumptionType> meterConsumption;
    protected List<MeterDeliveryType> meterDelivery;
    protected LinksType links;

    /**
     * Gets the value of the meterConsumption property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterConsumption property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterConsumption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterConsumptionType }
     *
     *
     */
    public List<MeterConsumptionType> getMeterConsumption() {
        if (meterConsumption == null) {
            meterConsumption = new ArrayList<MeterConsumptionType>();
        }
        return this.meterConsumption;
    }

    /**
     * Gets the value of the meterDelivery property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterDelivery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterDelivery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterDeliveryType }
     *
     *
     */
    public List<MeterDeliveryType> getMeterDelivery() {
        if (meterDelivery == null) {
            meterDelivery = new ArrayList<MeterDeliveryType>();
        }
        return this.meterDelivery;
    }

    /**
     * Gets the value of the links property.
     *
     * @return
     *     possible object is
     *     {@link LinksType }
     *
     */
    public LinksType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     *
     * @param value
     *     allowed object is
     *     {@link LinksType }
     *     
     */
    public void setLinks(LinksType value) {
        this.links = value;
    }

}
