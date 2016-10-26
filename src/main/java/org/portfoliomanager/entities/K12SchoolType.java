
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for k12SchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12SchoolType">
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
 *                   &lt;element ref="{}openOnWeekends" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfComputers" minOccurs="0"/>
 *                   &lt;element ref="{}cookingFacilities" minOccurs="0"/>
 *                   &lt;element ref="{}isHighSchool" minOccurs="0"/>
 *                   &lt;element ref="{}monthsInUse" minOccurs="0"/>
 *                   &lt;element ref="{}schoolDistrict" minOccurs="0"/>
 *                   &lt;element ref="{}studentSeatingCapacity" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
 *                   &lt;element ref="{}gymnasiumFloorArea" minOccurs="0"/>
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
@XmlType(name = "k12SchoolType", propOrder = {

})
public class K12SchoolType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected K12SchoolType.UseDetails useDetails;
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
     *     {@link K12SchoolType.UseDetails }
     *
     */
    public K12SchoolType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.UseDetails }
     *
     */
    public void setUseDetails(K12SchoolType.UseDetails value) {
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
     *         &lt;element ref="{}openOnWeekends" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}numberOfComputers" minOccurs="0"/>
     *         &lt;element ref="{}cookingFacilities" minOccurs="0"/>
     *         &lt;element ref="{}isHighSchool" minOccurs="0"/>
     *         &lt;element ref="{}monthsInUse" minOccurs="0"/>
     *         &lt;element ref="{}schoolDistrict" minOccurs="0"/>
     *         &lt;element ref="{}studentSeatingCapacity" minOccurs="0"/>
     *         &lt;element ref="{}numberOfWorkers" minOccurs="0"/>
     *         &lt;element ref="{}gymnasiumFloorArea" minOccurs="0"/>
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
        protected UseYesNoType openOnWeekends;
        protected UseDecimalType numberOfWalkInRefrigerationUnits;
        protected PercentCooledType percentCooled;
        protected PercentHeatedType percentHeated;
        protected UseDecimalType numberOfComputers;
        protected UseYesNoType cookingFacilities;
        protected UseYesNoType isHighSchool;
        protected MonthsInUseType monthsInUse;
        protected UseStringType schoolDistrict;
        protected UseDecimalType studentSeatingCapacity;
        protected UseDecimalType numberOfWorkers;
        protected OptionalFloorAreaType gymnasiumFloorArea;

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
         * Gets the value of the openOnWeekends property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getOpenOnWeekends() {
            return openOnWeekends;
        }

        /**
         * Sets the value of the openOnWeekends property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setOpenOnWeekends(UseYesNoType value) {
            this.openOnWeekends = value;
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
         * Gets the value of the isHighSchool property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getIsHighSchool() {
            return isHighSchool;
        }

        /**
         * Sets the value of the isHighSchool property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setIsHighSchool(UseYesNoType value) {
            this.isHighSchool = value;
        }

        /**
         * Gets the value of the monthsInUse property.
         *
         * @return
         *     possible object is
         *     {@link MonthsInUseType }
         *
         */
        public MonthsInUseType getMonthsInUse() {
            return monthsInUse;
        }

        /**
         * Sets the value of the monthsInUse property.
         *
         * @param value
         *     allowed object is
         *     {@link MonthsInUseType }
         *
         */
        public void setMonthsInUse(MonthsInUseType value) {
            this.monthsInUse = value;
        }

        /**
         * Gets the value of the schoolDistrict property.
         *
         * @return
         *     possible object is
         *     {@link UseStringType }
         *
         */
        public UseStringType getSchoolDistrict() {
            return schoolDistrict;
        }

        /**
         * Sets the value of the schoolDistrict property.
         *
         * @param value
         *     allowed object is
         *     {@link UseStringType }
         *
         */
        public void setSchoolDistrict(UseStringType value) {
            this.schoolDistrict = value;
        }

        /**
         * Gets the value of the studentSeatingCapacity property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getStudentSeatingCapacity() {
            return studentSeatingCapacity;
        }

        /**
         * Sets the value of the studentSeatingCapacity property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setStudentSeatingCapacity(UseDecimalType value) {
            this.studentSeatingCapacity = value;
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
         * Gets the value of the gymnasiumFloorArea property.
         *
         * @return
         *     possible object is
         *     {@link OptionalFloorAreaType }
         *
         */
        public OptionalFloorAreaType getGymnasiumFloorArea() {
            return gymnasiumFloorArea;
        }

        /**
         * Sets the value of the gymnasiumFloorArea property.
         *
         * @param value
         *     allowed object is
         *     {@link OptionalFloorAreaType }
         *     
         */
        public void setGymnasiumFloorArea(OptionalFloorAreaType value) {
            this.gymnasiumFloorArea = value;
        }

    }

}
