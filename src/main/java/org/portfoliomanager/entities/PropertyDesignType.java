
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for propertyDesignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyDesignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="primaryFunction" type="{}primaryFunctionType"/>
 *         &lt;element name="grossFloorArea" type="{}grossFloorAreaType"/>
 *         &lt;element name="plannedConstructionCompletionYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="address" type="{}addressType"/>
 *         &lt;element name="numberOfBuildings">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyDesignType", propOrder = {

})
public class PropertyDesignType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrimaryFunctionType primaryFunction;
    @XmlElement(required = true)
    protected GrossFloorAreaType grossFloorArea;
    protected int plannedConstructionCompletionYear;
    @XmlElement(required = true)
    protected AddressType address;
    protected int numberOfBuildings;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the primaryFunction property.
     *
     * @return
     *     possible object is
     *     {@link PrimaryFunctionType }
     *
     */
    public PrimaryFunctionType getPrimaryFunction() {
        return primaryFunction;
    }

    /**
     * Sets the value of the primaryFunction property.
     *
     * @param value
     *     allowed object is
     *     {@link PrimaryFunctionType }
     *
     */
    public void setPrimaryFunction(PrimaryFunctionType value) {
        this.primaryFunction = value;
    }

    /**
     * Gets the value of the grossFloorArea property.
     *
     * @return
     *     possible object is
     *     {@link GrossFloorAreaType }
     *
     */
    public GrossFloorAreaType getGrossFloorArea() {
        return grossFloorArea;
    }

    /**
     * Sets the value of the grossFloorArea property.
     *
     * @param value
     *     allowed object is
     *     {@link GrossFloorAreaType }
     *
     */
    public void setGrossFloorArea(GrossFloorAreaType value) {
        this.grossFloorArea = value;
    }

    /**
     * Gets the value of the plannedConstructionCompletionYear property.
     *
     */
    public int getPlannedConstructionCompletionYear() {
        return plannedConstructionCompletionYear;
    }

    /**
     * Sets the value of the plannedConstructionCompletionYear property.
     *
     */
    public void setPlannedConstructionCompletionYear(int value) {
        this.plannedConstructionCompletionYear = value;
    }

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link AddressType }
     *
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the numberOfBuildings property.
     * 
     */
    public int getNumberOfBuildings() {
        return numberOfBuildings;
    }

    /**
     * Sets the value of the numberOfBuildings property.
     * 
     */
    public void setNumberOfBuildings(int value) {
        this.numberOfBuildings = value;
    }

}
