
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baselineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baselineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="energyBaselineDate" type="{}baselineDateType" minOccurs="0"/>
 *         &lt;element name="waterBaselineDate" type="{}baselineDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baselineType", propOrder = {
    "energyBaselineDate",
    "waterBaselineDate"
})
public class BaselineType {

    @XmlSchemaType(name = "anySimpleType")
    protected String energyBaselineDate;
    @XmlSchemaType(name = "anySimpleType")
    protected String waterBaselineDate;

    /**
     * Gets the value of the energyBaselineDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyBaselineDate() {
        return energyBaselineDate;
    }

    /**
     * Sets the value of the energyBaselineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyBaselineDate(String value) {
        this.energyBaselineDate = value;
    }

    /**
     * Gets the value of the waterBaselineDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaterBaselineDate() {
        return waterBaselineDate;
    }

    /**
     * Sets the value of the waterBaselineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaterBaselineDate(String value) {
        this.waterBaselineDate = value;
    }

}
