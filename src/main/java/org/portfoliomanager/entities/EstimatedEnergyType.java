
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * <p>Java class for estimatedEnergyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estimatedEnergyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="energyType" type="{}allEnergyMetersType"/>
 *         &lt;element name="energyUnit" type="{}designUnitOfMeasure"/>
 *         &lt;element name="estimatedAnnualEnergyUsage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="energyRateCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="energyRateCostUnit" type="{}designUnitOfMeasure" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estimatedEnergyType", propOrder = {

})
public class EstimatedEnergyType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AllEnergyMetersType energyType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DesignUnitOfMeasure energyUnit;
    protected long estimatedAnnualEnergyUsage;
    protected BigDecimal energyRateCost;
    @XmlSchemaType(name = "string")
    protected DesignUnitOfMeasure energyRateCostUnit;

    /**
     * Gets the value of the energyType property.
     * 
     * @return
     *     possible object is
     *     {@link AllEnergyMetersType }
     *     
     */
    public AllEnergyMetersType getEnergyType() {
        return energyType;
    }

    /**
     * Sets the value of the energyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllEnergyMetersType }
     *     
     */
    public void setEnergyType(AllEnergyMetersType value) {
        this.energyType = value;
    }

    /**
     * Gets the value of the energyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DesignUnitOfMeasure }
     *     
     */
    public DesignUnitOfMeasure getEnergyUnit() {
        return energyUnit;
    }

    /**
     * Sets the value of the energyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignUnitOfMeasure }
     *     
     */
    public void setEnergyUnit(DesignUnitOfMeasure value) {
        this.energyUnit = value;
    }

    /**
     * Gets the value of the estimatedAnnualEnergyUsage property.
     * 
     */
    public long getEstimatedAnnualEnergyUsage() {
        return estimatedAnnualEnergyUsage;
    }

    /**
     * Sets the value of the estimatedAnnualEnergyUsage property.
     * 
     */
    public void setEstimatedAnnualEnergyUsage(long value) {
        this.estimatedAnnualEnergyUsage = value;
    }

    /**
     * Gets the value of the energyRateCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnergyRateCost() {
        return energyRateCost;
    }

    /**
     * Sets the value of the energyRateCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnergyRateCost(BigDecimal value) {
        this.energyRateCost = value;
    }

    /**
     * Gets the value of the energyRateCostUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DesignUnitOfMeasure }
     *     
     */
    public DesignUnitOfMeasure getEnergyRateCostUnit() {
        return energyRateCostUnit;
    }

    /**
     * Sets the value of the energyRateCostUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignUnitOfMeasure }
     *     
     */
    public void setEnergyRateCostUnit(DesignUnitOfMeasure value) {
        this.energyRateCostUnit = value;
    }

}
