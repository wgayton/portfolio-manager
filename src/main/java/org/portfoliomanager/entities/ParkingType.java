
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{}propertyUseNameType"/>
 *         &lt;element name="useDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}supplementalHeating" minOccurs="0"/>
 *                   &lt;element ref="{}openFootage"/>
 *                   &lt;element ref="{}completelyEnclosedFootage"/>
 *                   &lt;element ref="{}partiallyEnclosedFootage"/>
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
@XmlType(name = "parkingType", propOrder = {

})
public class ParkingType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ParkingType.UseDetails useDetails;
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
     *     {@link ParkingType.UseDetails }
     *
     */
    public ParkingType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link ParkingType.UseDetails }
     *
     */
    public void setUseDetails(ParkingType.UseDetails value) {
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
     *         &lt;element ref="{}supplementalHeating" minOccurs="0"/>
     *         &lt;element ref="{}openFootage"/>
     *         &lt;element ref="{}completelyEnclosedFootage"/>
     *         &lt;element ref="{}partiallyEnclosedFootage"/>
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

        protected UseYesNoType supplementalHeating;
        @XmlElement(required = true)
        protected GrossFloorAreaType openFootage;
        @XmlElement(required = true)
        protected GrossFloorAreaType completelyEnclosedFootage;
        @XmlElement(required = true)
        protected GrossFloorAreaType partiallyEnclosedFootage;

        /**
         * Gets the value of the supplementalHeating property.
         *
         * @return
         *     possible object is
         *     {@link UseYesNoType }
         *
         */
        public UseYesNoType getSupplementalHeating() {
            return supplementalHeating;
        }

        /**
         * Sets the value of the supplementalHeating property.
         *
         * @param value
         *     allowed object is
         *     {@link UseYesNoType }
         *
         */
        public void setSupplementalHeating(UseYesNoType value) {
            this.supplementalHeating = value;
        }

        /**
         * Gets the value of the openFootage property.
         *
         * @return
         *     possible object is
         *     {@link GrossFloorAreaType }
         *
         */
        public GrossFloorAreaType getOpenFootage() {
            return openFootage;
        }

        /**
         * Sets the value of the openFootage property.
         *
         * @param value
         *     allowed object is
         *     {@link GrossFloorAreaType }
         *
         */
        public void setOpenFootage(GrossFloorAreaType value) {
            this.openFootage = value;
        }

        /**
         * Gets the value of the completelyEnclosedFootage property.
         *
         * @return
         *     possible object is
         *     {@link GrossFloorAreaType }
         *
         */
        public GrossFloorAreaType getCompletelyEnclosedFootage() {
            return completelyEnclosedFootage;
        }

        /**
         * Sets the value of the completelyEnclosedFootage property.
         *
         * @param value
         *     allowed object is
         *     {@link GrossFloorAreaType }
         *
         */
        public void setCompletelyEnclosedFootage(GrossFloorAreaType value) {
            this.completelyEnclosedFootage = value;
        }

        /**
         * Gets the value of the partiallyEnclosedFootage property.
         *
         * @return
         *     possible object is
         *     {@link GrossFloorAreaType }
         *
         */
        public GrossFloorAreaType getPartiallyEnclosedFootage() {
            return partiallyEnclosedFootage;
        }

        /**
         * Sets the value of the partiallyEnclosedFootage property.
         *
         * @param value
         *     allowed object is
         *     {@link GrossFloorAreaType }
         *     
         */
        public void setPartiallyEnclosedFootage(GrossFloorAreaType value) {
            this.partiallyEnclosedFootage = value;
        }

    }

}
