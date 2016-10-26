
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicalOfficeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicalOfficeType">
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
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfSurgicalOperatingBeds" minOccurs="0"/>
 *                   &lt;element ref="{}surgeryCenterFloorArea" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfMriMachines" minOccurs="0"/>
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
@XmlType(name = "medicalOfficeType", propOrder = {

})
public class MedicalOfficeType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected MedicalOfficeType.UseDetails useDetails;
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
     *     {@link MedicalOfficeType.UseDetails }
     *
     */
    public MedicalOfficeType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link MedicalOfficeType.UseDetails }
     *
     */
    public void setUseDetails(MedicalOfficeType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}weeklyOperatingHours" minOccurs="0"/>
     *         &lt;element ref="{}numberOfSurgicalOperatingBeds" minOccurs="0"/>
     *         &lt;element ref="{}surgeryCenterFloorArea" minOccurs="0"/>
     *         &lt;element ref="{}numberOfMriMachines" minOccurs="0"/>
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
        protected UseDecimalType numberOfWorkers;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;
        protected UseDecimalType weeklyOperatingHours;
        protected UseDecimalType numberOfSurgicalOperatingBeds;
        protected OptionalFloorAreaType surgeryCenterFloorArea;
        protected UseDecimalType numberOfMriMachines;

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
         * Gets the value of the numberOfSurgicalOperatingBeds property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfSurgicalOperatingBeds() {
            return numberOfSurgicalOperatingBeds;
        }

        /**
         * Sets the value of the numberOfSurgicalOperatingBeds property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfSurgicalOperatingBeds(UseDecimalType value) {
            this.numberOfSurgicalOperatingBeds = value;
        }

        /**
         * Gets the value of the surgeryCenterFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getSurgeryCenterFloorArea() {
            return surgeryCenterFloorArea;
        }

        /**
         * Sets the value of the surgeryCenterFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public void setSurgeryCenterFloorArea(OptionalFloorAreaType value) {
            this.surgeryCenterFloorArea = value;
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

    }

}
