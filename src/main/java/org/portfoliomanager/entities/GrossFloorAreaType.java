
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The total gross floor area of all buildings at the property, measured at the exterior boundary of the enclosing walls, including all areas within the building (common, tenant, maintenance, etc). 
 * 
 * <p>Java class for grossFloorAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grossFloorAreaType">
 *   &lt;complexContent>
 *     &lt;extension base="{}floorAreaTypeBase">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grossFloorAreaType", propOrder = {
    "value"
})
public class GrossFloorAreaType
    extends FloorAreaTypeBase
{

    protected int value;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
