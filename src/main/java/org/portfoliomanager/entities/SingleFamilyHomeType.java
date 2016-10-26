
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for singleFamilyHomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleFamilyHomeType">
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
 *                   &lt;element ref="{}numberOfBedrooms" minOccurs="0"/>
 *                   &lt;element ref="{}numberOfPeople" minOccurs="0"/>
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
@XmlType(name = "singleFamilyHomeType", propOrder = {

})
public class SingleFamilyHomeType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected SingleFamilyHomeType.UseDetails useDetails;
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
     *     {@link SingleFamilyHomeType.UseDetails }
     *
     */
    public SingleFamilyHomeType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link SingleFamilyHomeType.UseDetails }
     *
     */
    public void setUseDetails(SingleFamilyHomeType.UseDetails value) {
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
     *         &lt;element ref="{}numberOfBedrooms" minOccurs="0"/>
     *         &lt;element ref="{}numberOfPeople" minOccurs="0"/>
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
        protected UseDecimalType numberOfBedrooms;
        protected UseIntegerType numberOfPeople;

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
         * Gets the value of the numberOfPeople property.
         *
         * @return
         *     possible object is
         *     {@link UseIntegerType }
         *
         */
        public UseIntegerType getNumberOfPeople() {
            return numberOfPeople;
        }

        /**
         * Sets the value of the numberOfPeople property.
         *
         * @param value
         *     allowed object is
         *     {@link UseIntegerType }
         *     
         */
        public void setNumberOfPeople(UseIntegerType value) {
            this.numberOfPeople = value;
        }

    }

}
