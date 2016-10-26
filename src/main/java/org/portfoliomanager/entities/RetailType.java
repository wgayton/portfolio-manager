
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retailType">
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
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfComputers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfCashRegisters" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfOpenClosedRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}singleStore" minOccurs="0"/>
 *                   &lt;element ref="{}exteriorEntranceToThePublic" minOccurs="0"/>
 *                   &lt;element ref="{}areaOfAllWalkInRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}lengthOfAllOpenClosedRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}cookingFacilities" minOccurs="0"/>
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
@XmlType(name = "retailType", propOrder = {

})
public class RetailType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected RetailType.UseDetails useDetails;
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
     *     {@link RetailType.UseDetails }
     *
     */
    public RetailType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link RetailType.UseDetails }
     *
     */
    public void setUseDetails(RetailType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfComputers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfCashRegisters" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}numberOfOpenClosedRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}singleStore" minOccurs="0"/>
     *         &lt;element ref="{}exteriorEntranceToThePublic" minOccurs="0"/>
     *         &lt;element ref="{}areaOfAllWalkInRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}lengthOfAllOpenClosedRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}cookingFacilities" minOccurs="0"/>
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
        protected UseDecimalType numberOfWorkers;
        protected UseDecimalType numberOfComputers;
        protected UseDecimalType numberOfCashRegisters;
        protected UseDecimalType numberOfWalkInRefrigerationUnits;
        protected UseDecimalType numberOfOpenClosedRefrigerationUnits;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;
        protected UseYesNoType singleStore;
        protected UseYesNoType exteriorEntranceToThePublic;
        protected OptionalFloorAreaType areaOfAllWalkInRefrigerationUnits;
        protected LengthOfAllOpenClosedRefrigerationUnitsType lengthOfAllOpenClosedRefrigerationUnits;
        protected UseYesNoType cookingFacilities;

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
         * Gets the value of the numberOfCashRegisters property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfCashRegisters() {
            return numberOfCashRegisters;
        }

        /**
         * Sets the value of the numberOfCashRegisters property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfCashRegisters(UseDecimalType value) {
            this.numberOfCashRegisters = value;
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
         * Gets the value of the numberOfOpenClosedRefrigerationUnits property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfOpenClosedRefrigerationUnits() {
            return numberOfOpenClosedRefrigerationUnits;
        }

        /**
         * Sets the value of the numberOfOpenClosedRefrigerationUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfOpenClosedRefrigerationUnits(UseDecimalType value) {
            this.numberOfOpenClosedRefrigerationUnits = value;
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
         * Gets the value of the singleStore property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getSingleStore() {
            return singleStore;
        }

        /**
         * Sets the value of the singleStore property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setSingleStore(UseYesNoType value) {
            this.singleStore = value;
        }

        /**
         * Gets the value of the exteriorEntranceToThePublic property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getExteriorEntranceToThePublic() {
            return exteriorEntranceToThePublic;
        }

        /**
         * Sets the value of the exteriorEntranceToThePublic property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setExteriorEntranceToThePublic(UseYesNoType value) {
            this.exteriorEntranceToThePublic = value;
        }

        /**
         * Gets the value of the areaOfAllWalkInRefrigerationUnits property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getAreaOfAllWalkInRefrigerationUnits() {
            return areaOfAllWalkInRefrigerationUnits;
        }

        /**
         * Sets the value of the areaOfAllWalkInRefrigerationUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setAreaOfAllWalkInRefrigerationUnits(OptionalFloorAreaType value) {
            this.areaOfAllWalkInRefrigerationUnits = value;
        }

        /**
         * Gets the value of the lengthOfAllOpenClosedRefrigerationUnits property.
         *
         * @return
         *     possible object is
         *     {@link LengthOfAllOpenClosedRefrigerationUnitsType }
         *
         */
        public LengthOfAllOpenClosedRefrigerationUnitsType getLengthOfAllOpenClosedRefrigerationUnits() {
            return lengthOfAllOpenClosedRefrigerationUnits;
        }

        /**
         * Sets the value of the lengthOfAllOpenClosedRefrigerationUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link LengthOfAllOpenClosedRefrigerationUnitsType }
         *
         */
        public void setLengthOfAllOpenClosedRefrigerationUnits(LengthOfAllOpenClosedRefrigerationUnitsType value) {
            this.lengthOfAllOpenClosedRefrigerationUnits = value;
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

    }

}
