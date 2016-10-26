
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for residenceHallDormitoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="residenceHallDormitoryType">
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
 *                   &lt;element ref="{}numberOfRooms" minOccurs="0"/>
 *                   &lt;element ref="{}percentHeated" minOccurs="0"/>
 *                   &lt;element ref="{}percentCooled" minOccurs="0"/>
 *                   &lt;element ref="{}hasComputerLab" minOccurs="0"/>
 *                   &lt;element ref="{}hasDiningHall" minOccurs="0"/>
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
@XmlType(name = "residenceHallDormitoryType", propOrder = {

})
public class ResidenceHallDormitoryType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ResidenceHallDormitoryType.UseDetails useDetails;
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
     *     {@link ResidenceHallDormitoryType.UseDetails }
     *
     */
    public ResidenceHallDormitoryType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link ResidenceHallDormitoryType.UseDetails }
     *
     */
    public void setUseDetails(ResidenceHallDormitoryType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfRooms" minOccurs="0"/>
     *         &lt;element ref="{}percentHeated" minOccurs="0"/>
     *         &lt;element ref="{}percentCooled" minOccurs="0"/>
     *         &lt;element ref="{}hasComputerLab" minOccurs="0"/>
     *         &lt;element ref="{}hasDiningHall" minOccurs="0"/>
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
        protected UseDecimalType numberOfRooms;
        protected PercentHeatedType percentHeated;
        protected PercentCooledType percentCooled;
        protected UseYesNoType hasComputerLab;
        protected UseYesNoType hasDiningHall;

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
         * Gets the value of the numberOfRooms property.
         *
         * @return
         *     possible object is
         *     {@link UseDecimalType }
         *
         */
        public UseDecimalType getNumberOfRooms() {
            return numberOfRooms;
        }

        /**
         * Sets the value of the numberOfRooms property.
         *
         * @param value
         *     allowed object is
         *     {@link UseDecimalType }
         *
         */
        public void setNumberOfRooms(UseDecimalType value) {
            this.numberOfRooms = value;
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
         * Gets the value of the hasComputerLab property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getHasComputerLab() {
            return hasComputerLab;
        }

        /**
         * Sets the value of the hasComputerLab property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setHasComputerLab(UseYesNoType value) {
            this.hasComputerLab = value;
        }

        /**
         * Gets the value of the hasDiningHall property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getHasDiningHall() {
            return hasDiningHall;
        }

        /**
         * Sets the value of the hasDiningHall property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *     
         */
        public void setHasDiningHall(UseYesNoType value) {
            this.hasDiningHall = value;
        }

    }

}
