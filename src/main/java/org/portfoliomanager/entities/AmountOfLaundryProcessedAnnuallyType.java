
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for amountOfLaundryProcessedAnnuallyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="amountOfLaundryProcessedAnnuallyType">
 *   &lt;complexContent>
 *     &lt;extension base="{}useAttributeBase">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="units" use="required" type="{}amountOfLaundryProcessedAnnuallyUnitsType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amountOfLaundryProcessedAnnuallyType", propOrder = {
    "value"
})
public class AmountOfLaundryProcessedAnnuallyType
    extends UseAttributeBase
{

    protected BigDecimal value;
    @XmlAttribute(name = "units", required = true)
    protected AmountOfLaundryProcessedAnnuallyUnitsType units;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the units property.
     *
     * @return
     *     possible object is
     *     {@link AmountOfLaundryProcessedAnnuallyUnitsType }
     *
     */
    public AmountOfLaundryProcessedAnnuallyUnitsType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountOfLaundryProcessedAnnuallyUnitsType }
     *     
     */
    public void setUnits(AmountOfLaundryProcessedAnnuallyUnitsType value) {
        this.units = value;
    }

}
