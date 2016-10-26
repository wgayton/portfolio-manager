
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for residentialCareFacilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="residentialCareFacilityType">
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
 *                   &lt;element ref="{}numberOfResidentialLivingUnits" minOccurs="0"/>
 *                   &lt;element ref="{}averageNumberOfResidents" minOccurs="0"/>
 *                   &lt;element ref="{}maximumResidentCapacity" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfComputers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfCommercialWashingMachines" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfResidentialWashingMachines" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfResidentialLiftSystems" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}licensedBedCapacity" minOccurs="0"/>
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
@XmlType(name = "residentialCareFacilityType", propOrder = {

})
public class ResidentialCareFacilityType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ResidentialCareFacilityType.UseDetails useDetails;
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
     *     {@link ResidentialCareFacilityType.UseDetails }
     *
     */
    public ResidentialCareFacilityType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link ResidentialCareFacilityType.UseDetails }
     *
     */
    public void setUseDetails(ResidentialCareFacilityType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfResidentialLivingUnits" minOccurs="0"/>
     *         &lt;element ref="{}averageNumberOfResidents" minOccurs="0"/>
     *         &lt;element ref="{}maximumResidentCapacity" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfComputers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfCommercialRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}numberOfCommercialWashingMachines" minOccurs="0"/>
     *         &lt;element ref="{}numberOfResidentialWashingMachines" minOccurs="0"/>
     *         &lt;element ref="{}numberOfResidentialLiftSystems" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}licensedBedCapacity" minOccurs="0"/>
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
        protected UseDecimalType numberOfResidentialLivingUnits;
        protected UseDecimalType averageNumberOfResidents;
        protected UseDecimalType maximumResidentCapacity;
        protected UseDecimalType numberOfWorkers;
        protected UseDecimalType numberOfComputers;
        protected UseDecimalType numberOfCommercialRefrigerationUnits;
        protected UseDecimalType numberOfCommercialWashingMachines;
        protected UseDecimalType numberOfResidentialWashingMachines;
        protected UseDecimalType numberOfResidentialLiftSystems;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;
        protected UseDecimalType licensedBedCapacity;

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
         * Gets the value of the numberOfResidentialLivingUnits property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialLivingUnits() {
            return numberOfResidentialLivingUnits;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialLivingUnits(UseDecimalType value) {
            this.numberOfResidentialLivingUnits = value;
        }

        /**
         * Gets the value of the averageNumberOfResidents property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getAverageNumberOfResidents() {
            return averageNumberOfResidents;
        }

        /**
         * Sets the value of the averageNumberOfResidents property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setAverageNumberOfResidents(UseDecimalType value) {
            this.averageNumberOfResidents = value;
        }

        /**
         * Gets the value of the maximumResidentCapacity property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getMaximumResidentCapacity() {
            return maximumResidentCapacity;
        }

        /**
         * Sets the value of the maximumResidentCapacity property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setMaximumResidentCapacity(UseDecimalType value) {
            this.maximumResidentCapacity = value;
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
         * Gets the value of the numberOfCommercialWashingMachines property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfCommercialWashingMachines() {
            return numberOfCommercialWashingMachines;
        }

        /**
         * Sets the value of the numberOfCommercialWashingMachines property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfCommercialWashingMachines(UseDecimalType value) {
            this.numberOfCommercialWashingMachines = value;
        }

        /**
         * Gets the value of the numberOfResidentialWashingMachines property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialWashingMachines() {
            return numberOfResidentialWashingMachines;
        }

        /**
         * Sets the value of the numberOfResidentialWashingMachines property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialWashingMachines(UseDecimalType value) {
            this.numberOfResidentialWashingMachines = value;
        }

        /**
         * Gets the value of the numberOfResidentialLiftSystems property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialLiftSystems() {
            return numberOfResidentialLiftSystems;
        }

        /**
         * Sets the value of the numberOfResidentialLiftSystems property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialLiftSystems(UseDecimalType value) {
            this.numberOfResidentialLiftSystems = value;
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
         * Gets the value of the licensedBedCapacity property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getLicensedBedCapacity() {
            return licensedBedCapacity;
        }

        /**
         * Sets the value of the licensedBedCapacity property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *     
         */
        public void setLicensedBedCapacity(UseDecimalType value) {
            this.licensedBedCapacity = value;
        }

    }

}
