
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multifamilyHousingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multifamilyHousingType">
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
 *                   &lt;element ref="{}numberOfBedrooms" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsMidRiseSetting" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfLaundryHookupsInAllUnits" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfLaundryHookupsInCommonArea" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsLowRiseSetting" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfResidentialLivingUnitsHighRiseSetting" minOccurs="0"/>
 *                   &lt;element ref="{}residentPopulation" minOccurs="0"/>
 *                   &lt;element ref="{}governmentSubsidizedHousing" minOccurs="0"/>
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
@XmlType(name = "multifamilyHousingType", propOrder = {

})
public class MultifamilyHousingType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected MultifamilyHousingType.UseDetails useDetails;
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
     *     {@link MultifamilyHousingType.UseDetails }
     *
     */
    public MultifamilyHousingType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link MultifamilyHousingType.UseDetails }
     *
     */
    public void setUseDetails(MultifamilyHousingType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfBedrooms" minOccurs="0"/>
     *         &lt;element ref="{}numberOfResidentialLivingUnitsMidRiseSetting" minOccurs="0"/>
     *         &lt;element ref="{}numberOfLaundryHookupsInAllUnits" minOccurs="0"/>
     *         &lt;element ref="{}numberOfLaundryHookupsInCommonArea" minOccurs="0"/>
     *         &lt;element ref="{}numberOfResidentialLivingUnitsLowRiseSetting" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}numberOfResidentialLivingUnitsHighRiseSetting" minOccurs="0"/>
     *         &lt;element ref="{}residentPopulation" minOccurs="0"/>
     *         &lt;element ref="{}governmentSubsidizedHousing" minOccurs="0"/>
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
        protected UseDecimalType numberOfBedrooms;
        protected UseDecimalType numberOfResidentialLivingUnitsMidRiseSetting;
        protected UseIntegerType numberOfLaundryHookupsInAllUnits;
        protected UseIntegerType numberOfLaundryHookupsInCommonArea;
        protected UseDecimalType numberOfResidentialLivingUnitsLowRiseSetting;
        protected PercentHeatedType percentHeated;
        protected PercentCooledType percentCooled;
        protected UseDecimalType numberOfResidentialLivingUnitsHighRiseSetting;
        protected ResidentPopulationType residentPopulation;
        protected UseYesNoType governmentSubsidizedHousing;

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
         * Gets the value of the numberOfBedrooms property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfBedrooms() {
            return numberOfBedrooms;
        }

        /**
         * Sets the value of the numberOfBedrooms property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfBedrooms(UseDecimalType value) {
            this.numberOfBedrooms = value;
        }

        /**
         * Gets the value of the numberOfResidentialLivingUnitsMidRiseSetting property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsMidRiseSetting() {
            return numberOfResidentialLivingUnitsMidRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsMidRiseSetting property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialLivingUnitsMidRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsMidRiseSetting = value;
        }

        /**
         * Gets the value of the numberOfLaundryHookupsInAllUnits property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfLaundryHookupsInAllUnits() {
            return numberOfLaundryHookupsInAllUnits;
        }

        /**
         * Sets the value of the numberOfLaundryHookupsInAllUnits property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfLaundryHookupsInAllUnits(UseIntegerType value) {
            this.numberOfLaundryHookupsInAllUnits = value;
        }

        /**
         * Gets the value of the numberOfLaundryHookupsInCommonArea property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfLaundryHookupsInCommonArea() {
            return numberOfLaundryHookupsInCommonArea;
        }

        /**
         * Sets the value of the numberOfLaundryHookupsInCommonArea property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *
         */
        public void setNumberOfLaundryHookupsInCommonArea(UseIntegerType value) {
            this.numberOfLaundryHookupsInCommonArea = value;
        }

        /**
         * Gets the value of the numberOfResidentialLivingUnitsLowRiseSetting property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsLowRiseSetting() {
            return numberOfResidentialLivingUnitsLowRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsLowRiseSetting property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialLivingUnitsLowRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsLowRiseSetting = value;
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
         * Gets the value of the numberOfResidentialLivingUnitsHighRiseSetting property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfResidentialLivingUnitsHighRiseSetting() {
            return numberOfResidentialLivingUnitsHighRiseSetting;
        }

        /**
         * Sets the value of the numberOfResidentialLivingUnitsHighRiseSetting property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfResidentialLivingUnitsHighRiseSetting(UseDecimalType value) {
            this.numberOfResidentialLivingUnitsHighRiseSetting = value;
        }

        /**
         * Gets the value of the residentPopulation property.
         *
         * @return
         *     possible object is
         *     {@link ResidentPopulationType }
         *
         */
        public ResidentPopulationType getResidentPopulation() {
            return residentPopulation;
        }

        /**
         * Sets the value of the residentPopulation property.
         *
         * @param value
         *     allowed object is
         *     {@link ResidentPopulationType }
         *
         */
        public void setResidentPopulation(ResidentPopulationType value) {
            this.residentPopulation = value;
        }

        /**
         * Gets the value of the governmentSubsidizedHousing property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getGovernmentSubsidizedHousing() {
            return governmentSubsidizedHousing;
        }

        /**
         * Sets the value of the governmentSubsidizedHousing property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *     
         */
        public void setGovernmentSubsidizedHousing(UseYesNoType value) {
            this.governmentSubsidizedHousing = value;
        }

    }

}
