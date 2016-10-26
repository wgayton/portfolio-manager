
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A service type used for representing a meter
 * 
 * <p>Java class for meterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{}typeOfMeter"/>
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="metered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ccf (hundred cubic feet)"/>
 *               &lt;enumeration value="cf (cubic feet)"/>
 *               &lt;enumeration value="cGal (hundred gallons) (UK)"/>
 *               &lt;enumeration value="cGal (hundred gallons) (US)"/>
 *               &lt;enumeration value="Cubic Meters per Day"/>
 *               &lt;enumeration value="cm (Cubic meters)"/>
 *               &lt;enumeration value="Cords"/>
 *               &lt;enumeration value="Gallons (UK)"/>
 *               &lt;enumeration value="Gallons (US)"/>
 *               &lt;enumeration value="GJ"/>
 *               &lt;enumeration value="kBtu (thousand Btu)"/>
 *               &lt;enumeration value="kcf (thousand cubic feet)"/>
 *               &lt;enumeration value="Kcm (Thousand Cubic meters)"/>
 *               &lt;enumeration value="KGal (thousand gallons) (UK)"/>
 *               &lt;enumeration value="KGal (thousand gallons) (US)"/>
 *               &lt;enumeration value="Kilogram"/>
 *               &lt;enumeration value="KLbs. (thousand pounds)"/>
 *               &lt;enumeration value="kWh (thousand Watt-hours)"/>
 *               &lt;enumeration value="Liters"/>
 *               &lt;enumeration value="MBtu (million Btu)"/>
 *               &lt;enumeration value="MCF(million cubic feet)"/>
 *               &lt;enumeration value="mg/l (milligrams per liter)"/>
 *               &lt;enumeration value="MGal (million gallons) (UK)"/>
 *               &lt;enumeration value="MGal (million gallons) (US)"/>
 *               &lt;enumeration value="Million Gallons per Day"/>
 *               &lt;enumeration value="MLbs. (million pounds)"/>
 *               &lt;enumeration value="MWh (million Watt-hours)"/>
 *               &lt;enumeration value="pounds"/>
 *               &lt;enumeration value="Pounds per year"/>
 *               &lt;enumeration value="therms"/>
 *               &lt;enumeration value="ton hours"/>
 *               &lt;enumeration value="Tonnes (metric)"/>
 *               &lt;enumeration value="tons"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="firstBillDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="inUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inactiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="otherDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accessLevel" type="{}shareLevelType" minOccurs="0"/>
 *         &lt;element name="audit" type="{}logType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterType", propOrder = {

})
public class MeterType {

    protected Long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfMeter type;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = "true")
    protected Boolean metered;
    @XmlElement(required = true)
    protected String unitOfMeasure;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstBillDate;
    protected boolean inUse;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inactiveDate;
    protected String otherDescription;
    @XmlSchemaType(name = "string")
    protected ShareLevelType accessLevel;
    protected LogType audit;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link TypeOfMeter }
     *
     */
    public TypeOfMeter getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link TypeOfMeter }
     *
     */
    public void setType(TypeOfMeter value) {
        this.type = value;
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

    /**
     * Gets the value of the metered property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isMetered() {
        return metered;
    }

    /**
     * Sets the value of the metered property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setMetered(Boolean value) {
        this.metered = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the firstBillDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFirstBillDate() {
        return firstBillDate;
    }

    /**
     * Sets the value of the firstBillDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFirstBillDate(XMLGregorianCalendar value) {
        this.firstBillDate = value;
    }

    /**
     * Gets the value of the inUse property.
     *
     */
    public boolean isInUse() {
        return inUse;
    }

    /**
     * Sets the value of the inUse property.
     *
     */
    public void setInUse(boolean value) {
        this.inUse = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setInactiveDate(XMLGregorianCalendar value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the otherDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOtherDescription() {
        return otherDescription;
    }

    /**
     * Sets the value of the otherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOtherDescription(String value) {
        this.otherDescription = value;
    }

    /**
     * Gets the value of the accessLevel property.
     *
     * @return
     *     possible object is
     *     {@link ShareLevelType }
     *
     */
    public ShareLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link ShareLevelType }
     *
     */
    public void setAccessLevel(ShareLevelType value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the audit property.
     *
     * @return
     *     possible object is
     *     {@link LogType }
     *
     */
    public LogType getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     *
     * @param value
     *     allowed object is
     *     {@link LogType }
     *     
     */
    public void setAudit(LogType value) {
        this.audit = value;
    }

}
