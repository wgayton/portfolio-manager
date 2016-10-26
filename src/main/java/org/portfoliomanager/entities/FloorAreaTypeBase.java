
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for floorAreaTypeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="floorAreaTypeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{}useAttributeBase">
 *       &lt;attribute name="units" use="required" type="{}grossFloorAreaUnitsType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "floorAreaTypeBase")
@XmlSeeAlso({
    OptionalFloorAreaType.class,
    GrossFloorAreaType.class
})
public class FloorAreaTypeBase
    extends UseAttributeBase
{

    @XmlAttribute(name = "units", required = true)
    protected GrossFloorAreaUnitsType units;

    /**
     * Gets the value of the units property.
     *
     * @return
     *     possible object is
     *     {@link GrossFloorAreaUnitsType }
     *
     */
    public GrossFloorAreaUnitsType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     *
     * @param value
     *     allowed object is
     *     {@link GrossFloorAreaUnitsType }
     *     
     */
    public void setUnits(GrossFloorAreaUnitsType value) {
        this.units = value;
    }

}
