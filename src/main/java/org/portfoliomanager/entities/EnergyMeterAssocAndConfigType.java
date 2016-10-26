
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for energyMeterAssocAndConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyMeterAssocAndConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="meters" type="{}meterListType"/>
 *         &lt;element ref="{}propertyRepresentation"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyMeterAssocAndConfigType", propOrder = {

})
public class EnergyMeterAssocAndConfigType {

    @XmlElement(required = true)
    protected MeterListType meters;
    @XmlElement(required = true)
    protected PropertyRepresentation propertyRepresentation;

    /**
     * Gets the value of the meters property.
     * 
     * @return
     *     possible object is
     *     {@link MeterListType }
     *     
     */
    public MeterListType getMeters() {
        return meters;
    }

    /**
     * Sets the value of the meters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterListType }
     *     
     */
    public void setMeters(MeterListType value) {
        this.meters = value;
    }

    /**
     * Gets the value of the propertyRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRepresentation }
     *     
     */
    public PropertyRepresentation getPropertyRepresentation() {
        return propertyRepresentation;
    }

    /**
     * Sets the value of the propertyRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRepresentation }
     *     
     */
    public void setPropertyRepresentation(PropertyRepresentation value) {
        this.propertyRepresentation = value;
    }

}
