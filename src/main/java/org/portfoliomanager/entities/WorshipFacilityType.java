
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for worshipFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="worshipFacilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{}propertyUseNameType"/>
 *         &lt;element name="useDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}totalGrossFloorArea"/>
 *                   &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfComputers" minOccurs="0"/>
 *                   &lt;element ref="{}cookingFacilities" minOccurs="0"/>
 *                   &lt;element ref="{}seatingCapacity" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWeekdaysOpen" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "worshipFacilityType", propOrder = {

})
public class WorshipFacilityType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected WorshipFacilityType.UseDetails useDetails;
    protected LogType audit;

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
     * Gets the value of the useDetails property.
     *
     * @return
     *     possible object is
     *     {@link WorshipFacilityType.UseDetails }
     *
     */
    public WorshipFacilityType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link WorshipFacilityType.UseDetails }
     *
     */
    public void setUseDetails(WorshipFacilityType.UseDetails value) {
        this.useDetails = value;
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
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element ref="{}totalGrossFloorArea"/>
     *         &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/>
     *         &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}numberOfComputers" minOccurs="0"/>
     *         &lt;element ref="{}cookingFacilities" minOccurs="0"/>
     *         &lt;element ref="{}seatingCapacity" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWeekdaysOpen" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class UseDetails {

        @XmlElement(required = true)
        protected GrossFloorAreaType totalGrossFloorArea;
        protected UseDecimalType weeklyOperatingHours;
        protected UseDecimalType numberOfCommercialRefrigerationUnits;
        protected UseDecimalType numberOfComputers;
        protected UseYesNoType cookingFacilities;
        protected UseDecimalType seatingCapacity;
        protected NumberOfWeekdaysType numberOfWeekdaysOpen;

        /**
         * Gets the value of the totalGrossFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link GrossFloorAreaType }
         *
         */
        public GrossFloorAreaType getTotalGrossFloorArea() {
            return totalGrossFloorArea;
        }

        /**
         * Sets the value of the totalGrossFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link GrossFloorAreaType }
         *
         */
        public void setTotalGrossFloorArea(GrossFloorAreaType value) {
            this.totalGrossFloorArea = value;
        }

        /**
         * Gets the value of the weeklyOperatingHours property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getWeeklyOperatingHours() {
            return weeklyOperatingHours;
        }

        /**
         * Sets the value of the weeklyOperatingHours property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setWeeklyOperatingHours(UseDecimalType value) {
            this.weeklyOperatingHours = value;
        }

        /**
         * Gets the value of the numberOfCommercialRefrigerationUnits property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfCommercialRefrigerationUnits() {
            return numberOfCommercialRefrigerationUnits;
        }

        /**
         * Sets the value of the numberOfCommercialRefrigerationUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfCommercialRefrigerationUnits(UseDecimalType value) {
            this.numberOfCommercialRefrigerationUnits = value;
        }

        /**
         * Gets the value of the numberOfComputers property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfComputers() {
            return numberOfComputers;
        }

        /**
         * Sets the value of the numberOfComputers property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfComputers(UseDecimalType value) {
            this.numberOfComputers = value;
        }

        /**
         * Gets the value of the cookingFacilities property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getCookingFacilities() {
            return cookingFacilities;
        }

        /**
         * Sets the value of the cookingFacilities property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setCookingFacilities(UseYesNoType value) {
            this.cookingFacilities = value;
        }

        /**
         * Gets the value of the seatingCapacity property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getSeatingCapacity() {
            return seatingCapacity;
        }

        /**
         * Sets the value of the seatingCapacity property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setSeatingCapacity(UseDecimalType value) {
            this.seatingCapacity = value;
        }

        /**
         * Gets the value of the numberOfWeekdaysOpen property.
         *
         * @return
         *     possible object is
         *     {@link NumberOfWeekdaysType }
         *
         */
        public NumberOfWeekdaysType getNumberOfWeekdaysOpen() {
            return numberOfWeekdaysOpen;
        }

        /**
         * Sets the value of the numberOfWeekdaysOpen property.
         *
         * @param value
         *     allowed object is
         *     {@link NumberOfWeekdaysType }
         *     
         */
        public void setNumberOfWeekdaysOpen(NumberOfWeekdaysType value) {
            this.numberOfWeekdaysOpen = value;
        }

    }

}
