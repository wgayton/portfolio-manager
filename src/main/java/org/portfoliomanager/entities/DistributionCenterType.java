
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distributionCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distributionCenterType">
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
 *                   &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
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
@XmlType(name = "distributionCenterType", propOrder = {

})
public class DistributionCenterType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected DistributionCenterType.UseDetails useDetails;
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
     *     {@link DistributionCenterType.UseDetails }
     *
     */
    public DistributionCenterType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link DistributionCenterType.UseDetails }
     *
     */
    public void setUseDetails(DistributionCenterType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfWalkInRefrigerationUnits" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
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
        protected UseDecimalType numberOfWalkInRefrigerationUnits;
        protected PercentHeatedType percentHeated;
        protected PercentCooledType percentCooled;

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

    }

}
