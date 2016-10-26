
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for useAttributeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="useAttributeBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audit" type="{}logType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="currentAsOf" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="temporary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="default">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Yes"/>
 *             &lt;enumeration value="No"/>
 *             &lt;enumeration value="N/A"/>
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
@XmlType(name = "useAttributeBase", propOrder = {
    "audit"
})
@XmlSeeAlso({
    OnsiteLaundryType.class,
    HoursPerDayGuestsOnsiteType.class,
    UseDecimalType.class,
    UseYesNoType.class,
    PercentHeatedType.class,
    UseIntegerType.class,
    PercentOfficeHeatedType.class,
    ItEnergyConfigurationType.class,
    AmountOfLaundryProcessedAnnuallyType.class,
    CoolingEquipmentRedundancyType.class,
    LengthOfAllOpenClosedRefrigerationUnitsType.class,
    MonthsInUseType.class,
    NumberOfWeekdaysType.class,
    OwnedByType.class,
    PercentCooledType.class,
    PercentOfficeCooledType.class,
    PlantDesignFlowRateType.class,
    PoolType.class,
    PoolSizeType.class,
    ResidentPopulationType.class,
    UseStringType.class,
    UpsSystemRedundancyType.class,
    FloorAreaTypeBase.class,
    MonthsSchoolInUseType.class
})
public abstract class UseAttributeBase {

    protected LogType audit;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "currentAsOf")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentAsOf;
    @XmlAttribute(name = "temporary")
    protected Boolean temporary;
    @XmlAttribute(name = "default")
    protected String _default;

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
     * Gets the value of the currentAsOf property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentAsOf() {
        return currentAsOf;
    }

    /**
     * Sets the value of the currentAsOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentAsOf(XMLGregorianCalendar value) {
        this.currentAsOf = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporary(Boolean value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

}
