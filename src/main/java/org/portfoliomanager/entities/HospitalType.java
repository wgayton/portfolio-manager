
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hospitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hospitalType">
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
 *                   &lt;element ref="{}hasLaboratory" minOccurs="0"/>
 *                   &lt;element ref="{}onSiteLaundryFacility" minOccurs="0"/>
 *                   &lt;element ref="{}maximumNumberOfFloors" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfStaffedBeds" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfFTEWorkers" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfMriMachines" minOccurs="0"/>
 *                   &lt;element ref="{}ownedBy" minOccurs="0"/>
 *                   &lt;element ref="{}isTertiaryCare" minOccurs="0"/>
 *                   &lt;element ref="{}licensedBedCapacity" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
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
@XmlType(name = "hospitalType", propOrder = {

})
public class HospitalType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected HospitalType.UseDetails useDetails;
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
     *     {@link HospitalType.UseDetails }
     *
     */
    public HospitalType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link HospitalType.UseDetails }
     *
     */
    public void setUseDetails(HospitalType.UseDetails value) {
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
     *         &lt;element ref="{}hasLaboratory" minOccurs="0"/>
     *         &lt;element ref="{}onSiteLaundryFacility" minOccurs="0"/>
     *         &lt;element ref="{}maximumNumberOfFloors" minOccurs="0"/>
     *         &lt;element ref="{}numberOfStaffedBeds" minOccurs="0"/>
     *         &lt;element ref="{}numberOfFTEWorkers" minOccurs="0"/>
     *         &lt;element ref="{}numberOfMriMachines" minOccurs="0"/>
     *         &lt;element ref="{}ownedBy" minOccurs="0"/>
     *         &lt;element ref="{}isTertiaryCare" minOccurs="0"/>
     *         &lt;element ref="{}licensedBedCapacity" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
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
        protected UseYesNoType hasLaboratory;
        protected UseYesNoType onSiteLaundryFacility;
        protected UseIntegerType maximumNumberOfFloors;
        protected UseDecimalType numberOfStaffedBeds;
        protected UseDecimalType numberOfFTEWorkers;
        protected UseDecimalType numberOfMriMachines;
        protected OwnedByType ownedBy;
        protected UseYesNoType isTertiaryCare;
        protected UseDecimalType licensedBedCapacity;
        protected UseDecimalType numberOfWorkers;
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
         * Gets the value of the hasLaboratory property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getHasLaboratory() {
            return hasLaboratory;
        }

        /**
         * Sets the value of the hasLaboratory property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setHasLaboratory(UseYesNoType value) {
            this.hasLaboratory = value;
        }

        /**
         * Gets the value of the onSiteLaundryFacility property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getOnSiteLaundryFacility() {
            return onSiteLaundryFacility;
        }

        /**
         * Sets the value of the onSiteLaundryFacility property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setOnSiteLaundryFacility(UseYesNoType value) {
            this.onSiteLaundryFacility = value;
        }

        /**
         * Gets the value of the maximumNumberOfFloors property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getMaximumNumberOfFloors() {
            return maximumNumberOfFloors;
        }

        /**
         * Sets the value of the maximumNumberOfFloors property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setMaximumNumberOfFloors(UseIntegerType value) {
            this.maximumNumberOfFloors = value;
        }

        /**
         * Gets the value of the numberOfStaffedBeds property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfStaffedBeds() {
            return numberOfStaffedBeds;
        }

        /**
         * Sets the value of the numberOfStaffedBeds property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfStaffedBeds(UseDecimalType value) {
            this.numberOfStaffedBeds = value;
        }

        /**
         * Gets the value of the numberOfFTEWorkers property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfFTEWorkers() {
            return numberOfFTEWorkers;
        }

        /**
         * Sets the value of the numberOfFTEWorkers property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfFTEWorkers(UseDecimalType value) {
            this.numberOfFTEWorkers = value;
        }

        /**
         * Gets the value of the numberOfMriMachines property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfMriMachines() {
            return numberOfMriMachines;
        }

        /**
         * Sets the value of the numberOfMriMachines property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfMriMachines(UseDecimalType value) {
            this.numberOfMriMachines = value;
        }

        /**
         * Gets the value of the ownedBy property.
         *
         * @return
         *     possible object is
         *     {@link OwnedByType }
         *
         */
        public OwnedByType getOwnedBy() {
            return ownedBy;
        }

        /**
         * Sets the value of the ownedBy property.
         *
         * @param value
         *     allowed object is
         *     {@link OwnedByType }
         *
         */
        public void setOwnedBy(OwnedByType value) {
            this.ownedBy = value;
        }

        /**
         * Gets the value of the isTertiaryCare property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getIsTertiaryCare() {
            return isTertiaryCare;
        }

        /**
         * Sets the value of the isTertiaryCare property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setIsTertiaryCare(UseYesNoType value) {
            this.isTertiaryCare = value;
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
