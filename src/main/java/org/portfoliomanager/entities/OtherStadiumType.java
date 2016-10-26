
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherStadiumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherStadiumType">
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
 *                   &lt;element ref="{}enclosedFloorArea" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfSportingEventsPerYear" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfConcertShowEventsPerYear" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfSpecialOtherEventsPerYear" minOccurs="0"/>
 *                   &lt;element ref="{}sizeOfElectronicScoreBoards" minOccurs="0"/>
 *                   &lt;element ref="{}iceEvents" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfComputers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
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
@XmlType(name = "otherStadiumType", propOrder = {

})
public class OtherStadiumType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected OtherStadiumType.UseDetails useDetails;
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
     *     {@link OtherStadiumType.UseDetails }
     *
     */
    public OtherStadiumType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link OtherStadiumType.UseDetails }
     *
     */
    public void setUseDetails(OtherStadiumType.UseDetails value) {
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
     *         &lt;element ref="{}enclosedFloorArea" minOccurs="0"/>
     *         &lt;element ref="{}numberOfSportingEventsPerYear" minOccurs="0"/>
     *         &lt;element ref="{}numberOfConcertShowEventsPerYear" minOccurs="0"/>
     *         &lt;element ref="{}numberOfSpecialOtherEventsPerYear" minOccurs="0"/>
     *         &lt;element ref="{}sizeOfElectronicScoreBoards" minOccurs="0"/>
     *         &lt;element ref="{}iceEvents" minOccurs="0"/>
     *         &lt;element ref="{}numberOfComputers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
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
        protected OptionalFloorAreaType enclosedFloorArea;
        protected UseIntegerType numberOfSportingEventsPerYear;
        protected UseIntegerType numberOfConcertShowEventsPerYear;
        protected UseIntegerType numberOfSpecialOtherEventsPerYear;
        protected OptionalFloorAreaType sizeOfElectronicScoreBoards;
        protected UseYesNoType iceEvents;
        protected UseDecimalType numberOfComputers;
        protected UseDecimalType numberOfWalkInRefrigerationUnits;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;

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
         * Gets the value of the enclosedFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getEnclosedFloorArea() {
            return enclosedFloorArea;
        }

        /**
         * Sets the value of the enclosedFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setEnclosedFloorArea(OptionalFloorAreaType value) {
            this.enclosedFloorArea = value;
        }

        /**
         * Gets the value of the numberOfSportingEventsPerYear property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfSportingEventsPerYear() {
            return numberOfSportingEventsPerYear;
        }

        /**
         * Sets the value of the numberOfSportingEventsPerYear property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfSportingEventsPerYear(UseIntegerType value) {
            this.numberOfSportingEventsPerYear = value;
        }

        /**
         * Gets the value of the numberOfConcertShowEventsPerYear property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfConcertShowEventsPerYear() {
            return numberOfConcertShowEventsPerYear;
        }

        /**
         * Sets the value of the numberOfConcertShowEventsPerYear property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfConcertShowEventsPerYear(UseIntegerType value) {
            this.numberOfConcertShowEventsPerYear = value;
        }

        /**
         * Gets the value of the numberOfSpecialOtherEventsPerYear property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfSpecialOtherEventsPerYear() {
            return numberOfSpecialOtherEventsPerYear;
        }

        /**
         * Sets the value of the numberOfSpecialOtherEventsPerYear property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfSpecialOtherEventsPerYear(UseIntegerType value) {
            this.numberOfSpecialOtherEventsPerYear = value;
        }

        /**
         * Gets the value of the sizeOfElectronicScoreBoards property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getSizeOfElectronicScoreBoards() {
            return sizeOfElectronicScoreBoards;
        }

        /**
         * Sets the value of the sizeOfElectronicScoreBoards property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setSizeOfElectronicScoreBoards(OptionalFloorAreaType value) {
            this.sizeOfElectronicScoreBoards = value;
        }

        /**
         * Gets the value of the iceEvents property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getIceEvents() {
            return iceEvents;
        }

        /**
         * Sets the value of the iceEvents property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setIceEvents(UseYesNoType value) {
            this.iceEvents = value;
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
         * Gets the value of the numberOfWalkInRefrigerationUnits property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfWalkInRefrigerationUnits() {
            return numberOfWalkInRefrigerationUnits;
        }

        /**
         * Sets the value of the numberOfWalkInRefrigerationUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfWalkInRefrigerationUnits(UseDecimalType value) {
            this.numberOfWalkInRefrigerationUnits = value;
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

    }

}
