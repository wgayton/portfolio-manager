
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * A service type used for representing a meter consumption entry
 * 
 * <p>Java class for meterConsumptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterConsumptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="energyExportedOffSite" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="greenPower" type="{}greenPowerType" minOccurs="0"/>
 *         &lt;element name="RECOwnership" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Owned"/>
 *               &lt;enumeration value="Sold"/>
 *               &lt;enumeration value="Arbitrage"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="audit" type="{}logType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="estimatedValue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isGreenPower" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterConsumptionType", propOrder = {

})
public class MeterConsumptionType {

    protected Long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected BigDecimal usage;
    protected BigDecimal cost;
    protected BigDecimal energyExportedOffSite;
    protected GreenPowerType greenPower;
    @XmlElement(name = "RECOwnership")
    protected String recOwnership;
    protected LogType audit;
    @XmlAttribute(name = "estimatedValue")
    protected Boolean estimatedValue;
    @XmlAttribute(name = "isGreenPower")
    protected Boolean isGreenPower;

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
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the usage property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setUsage(BigDecimal value) {
        this.usage = value;
    }

    /**
     * Gets the value of the cost property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Gets the value of the energyExportedOffSite property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getEnergyExportedOffSite() {
        return energyExportedOffSite;
    }

    /**
     * Sets the value of the energyExportedOffSite property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setEnergyExportedOffSite(BigDecimal value) {
        this.energyExportedOffSite = value;
    }

    /**
     * Gets the value of the greenPower property.
     *
     * @return
     *     possible object is
     *     {@link GreenPowerType }
     *
     */
    public GreenPowerType getGreenPower() {
        return greenPower;
    }

    /**
     * Sets the value of the greenPower property.
     *
     * @param value
     *     allowed object is
     *     {@link GreenPowerType }
     *
     */
    public void setGreenPower(GreenPowerType value) {
        this.greenPower = value;
    }

    /**
     * Gets the value of the recOwnership property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRECOwnership() {
        return recOwnership;
    }

    /**
     * Sets the value of the recOwnership property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRECOwnership(String value) {
        this.recOwnership = value;
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

    /**
     * Gets the value of the estimatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstimatedValue() {
        return estimatedValue;
    }

    /**
     * Sets the value of the estimatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstimatedValue(Boolean value) {
        this.estimatedValue = value;
    }

    /**
     * Gets the value of the isGreenPower property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGreenPower() {
        return isGreenPower;
    }

    /**
     * Sets the value of the isGreenPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGreenPower(Boolean value) {
        this.isGreenPower = value;
    }

}
