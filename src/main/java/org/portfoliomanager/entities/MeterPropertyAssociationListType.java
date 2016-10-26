
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterPropertyAssociationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterPropertyAssociationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="energyMeterAssociation" type="{}energyMeterAssocAndConfigType" minOccurs="0"/>
 *         &lt;element name="waterMeterAssociation" type="{}waterMeterAssocAndConfigType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterPropertyAssociationListType", propOrder = {

})
public class MeterPropertyAssociationListType {

    protected EnergyMeterAssocAndConfigType energyMeterAssociation;
    protected WaterMeterAssocAndConfigType waterMeterAssociation;

    /**
     * Gets the value of the energyMeterAssociation property.
     *
     * @return
     *     possible object is
     *     {@link EnergyMeterAssocAndConfigType }
     *
     */
    public EnergyMeterAssocAndConfigType getEnergyMeterAssociation() {
        return energyMeterAssociation;
    }

    /**
     * Sets the value of the energyMeterAssociation property.
     *
     * @param value
     *     allowed object is
     *     {@link EnergyMeterAssocAndConfigType }
     *
     */
    public void setEnergyMeterAssociation(EnergyMeterAssocAndConfigType value) {
        this.energyMeterAssociation = value;
    }

    /**
     * Gets the value of the waterMeterAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link WaterMeterAssocAndConfigType }
     *     
     */
    public WaterMeterAssocAndConfigType getWaterMeterAssociation() {
        return waterMeterAssociation;
    }

    /**
     * Sets the value of the waterMeterAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterMeterAssocAndConfigType }
     *     
     */
    public void setWaterMeterAssociation(WaterMeterAssocAndConfigType value) {
        this.waterMeterAssociation = value;
    }

}
