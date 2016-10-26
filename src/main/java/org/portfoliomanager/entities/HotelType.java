
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This xml type represents a property use type. If an element is missing it will be
 *                 populated with a default value.
 *             
 * 
 * <p>Java class for hotelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelType">
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
 *                   &lt;element ref="{}fullServiceSpaFloorArea" minOccurs="0"/>
 *                   &lt;element ref="{}gymCenterFloorArea" minOccurs="0"/>
 *                   &lt;element ref="{}hoursPerDayGuestsOnsite" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfGuestMealsServedPerYear" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfHotelRooms" minOccurs="0"/>
 *                   &lt;element ref="{}laundryFacility" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}cookingFacilities" minOccurs="0"/>
 *                   &lt;element ref="{}amountOfLaundryProcessedAnnually" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
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
@XmlType(name = "hotelType", propOrder = {

})
public class HotelType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected HotelType.UseDetails useDetails;
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
     *     {@link HotelType.UseDetails }
     *
     */
    public HotelType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link HotelType.UseDetails }
     *
     */
    public void setUseDetails(HotelType.UseDetails value) {
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
     *         &lt;element ref="{}fullServiceSpaFloorArea" minOccurs="0"/>
     *         &lt;element ref="{}gymCenterFloorArea" minOccurs="0"/>
     *         &lt;element ref="{}hoursPerDayGuestsOnsite" minOccurs="0"/>
     *         &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}numberOfGuestMealsServedPerYear" minOccurs="0"/>
     *         &lt;element ref="{}numberOfHotelRooms" minOccurs="0"/>
     *         &lt;element ref="{}laundryFacility" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}cookingFacilities" minOccurs="0"/>
     *         &lt;element ref="{}amountOfLaundryProcessedAnnually" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
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
        protected OptionalFloorAreaType fullServiceSpaFloorArea;
        protected OptionalFloorAreaType gymCenterFloorArea;
        protected HoursPerDayGuestsOnsiteType hoursPerDayGuestsOnsite;
        protected UseDecimalType numberOfCommercialRefrigerationUnits;
        protected UseIntegerType numberOfGuestMealsServedPerYear;
        protected UseDecimalType numberOfHotelRooms;
        protected OnsiteLaundryType laundryFacility;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;
        protected UseYesNoType cookingFacilities;
        protected AmountOfLaundryProcessedAnnuallyType amountOfLaundryProcessedAnnually;
        protected UseDecimalType numberOfWorkers;

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
         * Gets the value of the fullServiceSpaFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getFullServiceSpaFloorArea() {
            return fullServiceSpaFloorArea;
        }

        /**
         * Sets the value of the fullServiceSpaFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setFullServiceSpaFloorArea(OptionalFloorAreaType value) {
            this.fullServiceSpaFloorArea = value;
        }

        /**
         * Gets the value of the gymCenterFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getGymCenterFloorArea() {
            return gymCenterFloorArea;
        }

        /**
         * Sets the value of the gymCenterFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setGymCenterFloorArea(OptionalFloorAreaType value) {
            this.gymCenterFloorArea = value;
        }

        /**
         * Gets the value of the hoursPerDayGuestsOnsite property.
         *
         * @return
         *     possible object is
         *     {@link HoursPerDayGuestsOnsiteType }
         *
         */
        public HoursPerDayGuestsOnsiteType getHoursPerDayGuestsOnsite() {
            return hoursPerDayGuestsOnsite;
        }

        /**
         * Sets the value of the hoursPerDayGuestsOnsite property.
         *
         * @param value
         *     allowed object is
         *     {@link HoursPerDayGuestsOnsiteType }
         *
         */
        public void setHoursPerDayGuestsOnsite(HoursPerDayGuestsOnsiteType value) {
            this.hoursPerDayGuestsOnsite = value;
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
         * Gets the value of the numberOfGuestMealsServedPerYear property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfGuestMealsServedPerYear() {
            return numberOfGuestMealsServedPerYear;
        }

        /**
         * Sets the value of the numberOfGuestMealsServedPerYear property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfGuestMealsServedPerYear(UseIntegerType value) {
            this.numberOfGuestMealsServedPerYear = value;
        }

        /**
         * Gets the value of the numberOfHotelRooms property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfHotelRooms() {
            return numberOfHotelRooms;
        }

        /**
         * Sets the value of the numberOfHotelRooms property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfHotelRooms(UseDecimalType value) {
            this.numberOfHotelRooms = value;
        }

        /**
         * Gets the value of the laundryFacility property.
         *
         * @return
         *     possible object is
         *     {@link OnsiteLaundryType }
         *
         */
        public OnsiteLaundryType getLaundryFacility() {
            return laundryFacility;
        }

        /**
         * Sets the value of the laundryFacility property.
         *
         * @param value
         *     allowed object is
         *     {@link OnsiteLaundryType }
         *
         */
        public void setLaundryFacility(OnsiteLaundryType value) {
            this.laundryFacility = value;
        }

        /**
         * Gets the value of the percentCooled property.
         *
         * @return
         *     possible object is
         *     {@link PercentCooledType }
         *
         */
        public PercentCooledType getPercentCooled() {
            return percentCooled;
        }

        /**
         * Sets the value of the percentCooled property.
         *
         * @param value
         *     allowed object is
         *     {@link PercentCooledType }
         *
         */
        public void setPercentCooled(PercentCooledType value) {
            this.percentCooled = value;
        }

        /**
         * Gets the value of the percentHeated property.
         *
         * @return
         *     possible object is
         *     {@link PercentHeatedType }
         *
         */
        public PercentHeatedType getPercentHeated() {
            return percentHeated;
        }

        /**
         * Sets the value of the percentHeated property.
         *
         * @param value
         *     allowed object is
         *     {@link PercentHeatedType }
         *
         */
        public void setPercentHeated(PercentHeatedType value) {
            this.percentHeated = value;
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
         * Gets the value of the amountOfLaundryProcessedAnnually property.
         *
         * @return
         *     possible object is
         *     {@link AmountOfLaundryProcessedAnnuallyType }
         *
         */
        public AmountOfLaundryProcessedAnnuallyType getAmountOfLaundryProcessedAnnually() {
            return amountOfLaundryProcessedAnnually;
        }

        /**
         * Sets the value of the amountOfLaundryProcessedAnnually property.
         *
         * @param value
         *     allowed object is
         *     {@link AmountOfLaundryProcessedAnnuallyType }
         *
         */
        public void setAmountOfLaundryProcessedAnnually(AmountOfLaundryProcessedAnnuallyType value) {
            this.amountOfLaundryProcessedAnnually = value;
        }

        /**
         * Gets the value of the numberOfWorkers property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfWorkers() {
            return numberOfWorkers;
        }

        /**
         * Sets the value of the numberOfWorkers property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setNumberOfWorkers(UseDecimalType value) {
            this.numberOfWorkers = value;
        }

    }

}
