
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataCenterType">
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
 *                   &lt;element ref="{}coolingEquipmentRedundancy" minOccurs="0"/>
 *                   &lt;element ref="{}itEnergyMeterConfiguration" minOccurs="0"/>
 *                   &lt;element ref="{}upsSystemRedundancy" minOccurs="0"/>
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
@XmlType(name = "dataCenterType", propOrder = {

})
public class DataCenterType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected DataCenterType.UseDetails useDetails;
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
     *     {@link DataCenterType.UseDetails }
     *
     */
    public DataCenterType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link DataCenterType.UseDetails }
     *
     */
    public void setUseDetails(DataCenterType.UseDetails value) {
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
     *         &lt;element ref="{}coolingEquipmentRedundancy" minOccurs="0"/>
     *         &lt;element ref="{}itEnergyMeterConfiguration" minOccurs="0"/>
     *         &lt;element ref="{}upsSystemRedundancy" minOccurs="0"/>
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
        protected CoolingEquipmentRedundancyType coolingEquipmentRedundancy;
        protected ItEnergyConfigurationType itEnergyMeterConfiguration;
        protected UpsSystemRedundancyType upsSystemRedundancy;

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
         * Gets the value of the coolingEquipmentRedundancy property.
         *
         * @return
         *     possible object is
         *     {@link CoolingEquipmentRedundancyType }
         *
         */
        public CoolingEquipmentRedundancyType getCoolingEquipmentRedundancy() {
            return coolingEquipmentRedundancy;
        }

        /**
         * Sets the value of the coolingEquipmentRedundancy property.
         *
         * @param value
         *     allowed object is
         *     {@link CoolingEquipmentRedundancyType }
         *
         */
        public void setCoolingEquipmentRedundancy(CoolingEquipmentRedundancyType value) {
            this.coolingEquipmentRedundancy = value;
        }

        /**
         * Gets the value of the itEnergyMeterConfiguration property.
         *
         * @return
         *     possible object is
         *     {@link ItEnergyConfigurationType }
         *
         */
        public ItEnergyConfigurationType getItEnergyMeterConfiguration() {
            return itEnergyMeterConfiguration;
        }

        /**
         * Sets the value of the itEnergyMeterConfiguration property.
         *
         * @param value
         *     allowed object is
         *     {@link ItEnergyConfigurationType }
         *
         */
        public void setItEnergyMeterConfiguration(ItEnergyConfigurationType value) {
            this.itEnergyMeterConfiguration = value;
        }

        /**
         * Gets the value of the upsSystemRedundancy property.
         *
         * @return
         *     possible object is
         *     {@link UpsSystemRedundancyType }
         *
         */
        public UpsSystemRedundancyType getUpsSystemRedundancy() {
            return upsSystemRedundancy;
        }

        /**
         * Sets the value of the upsSystemRedundancy property.
         *
         * @param value
         *     allowed object is
         *     {@link UpsSystemRedundancyType }
         *     
         */
        public void setUpsSystemRedundancy(UpsSystemRedundancyType value) {
            this.upsSystemRedundancy = value;
        }

    }

}
