
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for organizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="primaryBusiness" type="{}primaryBusinessType"/>
 *         &lt;element name="otherBusinessDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="energyStarPartner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="energyStarPartnerType" type="{}typeOfEnergyStarPartner" minOccurs="0"/>
 *         &lt;element name="otherPartnerDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1000"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationType", propOrder = {

})
public class OrganizationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrimaryBusinessType primaryBusiness;
    protected String otherBusinessDescription;
    protected boolean energyStarPartner;
    @XmlSchemaType(name = "string")
    protected TypeOfEnergyStarPartner energyStarPartnerType;
    protected String otherPartnerDescription;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the primaryBusiness property.
     *
     * @return
     *     possible object is
     *     {@link PrimaryBusinessType }
     *
     */
    public PrimaryBusinessType getPrimaryBusiness() {
        return primaryBusiness;
    }

    /**
     * Sets the value of the primaryBusiness property.
     *
     * @param value
     *     allowed object is
     *     {@link PrimaryBusinessType }
     *
     */
    public void setPrimaryBusiness(PrimaryBusinessType value) {
        this.primaryBusiness = value;
    }

    /**
     * Gets the value of the otherBusinessDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOtherBusinessDescription() {
        return otherBusinessDescription;
    }

    /**
     * Sets the value of the otherBusinessDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOtherBusinessDescription(String value) {
        this.otherBusinessDescription = value;
    }

    /**
     * Gets the value of the energyStarPartner property.
     *
     */
    public boolean isEnergyStarPartner() {
        return energyStarPartner;
    }

    /**
     * Sets the value of the energyStarPartner property.
     *
     */
    public void setEnergyStarPartner(boolean value) {
        this.energyStarPartner = value;
    }

    /**
     * Gets the value of the energyStarPartnerType property.
     *
     * @return
     *     possible object is
     *     {@link TypeOfEnergyStarPartner }
     *
     */
    public TypeOfEnergyStarPartner getEnergyStarPartnerType() {
        return energyStarPartnerType;
    }

    /**
     * Sets the value of the energyStarPartnerType property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeOfEnergyStarPartner }
     *     
     */
    public void setEnergyStarPartnerType(TypeOfEnergyStarPartner value) {
        this.energyStarPartnerType = value;
    }

    /**
     * Gets the value of the otherPartnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartnerDescription() {
        return otherPartnerDescription;
    }

    /**
     * Sets the value of the otherPartnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartnerDescription(String value) {
        this.otherPartnerDescription = value;
    }

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

}
