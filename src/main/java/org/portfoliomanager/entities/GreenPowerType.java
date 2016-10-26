
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for greenPowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="greenPowerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="sources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="biomassPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="biogasPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="geothermalPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="smallHydroPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="solarPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="windPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="unknownPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="generationLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="generationPlant" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="eGridSubRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="unknown" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "greenPowerType", propOrder = {

})
public class GreenPowerType {

    @XmlElement(required = true)
    protected BigDecimal value;
    @XmlElement(required = true)
    protected GreenPowerType.Sources sources;
    @XmlElement(required = true)
    protected GreenPowerType.GenerationLocation generationLocation;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the sources property.
     *
     * @return
     *     possible object is
     *     {@link GreenPowerType.Sources }
     *
     */
    public GreenPowerType.Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     *
     * @param value
     *     allowed object is
     *     {@link GreenPowerType.Sources }
     *
     */
    public void setSources(GreenPowerType.Sources value) {
        this.sources = value;
    }

    /**
     * Gets the value of the generationLocation property.
     *
     * @return
     *     possible object is
     *     {@link GreenPowerType.GenerationLocation }
     *
     */
    public GreenPowerType.GenerationLocation getGenerationLocation() {
        return generationLocation;
    }

    /**
     * Sets the value of the generationLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link GreenPowerType.GenerationLocation }
     *
     */
    public void setGenerationLocation(GreenPowerType.GenerationLocation value) {
        this.generationLocation = value;
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
     *       &lt;choice>
     *         &lt;element name="generationPlant" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="eGridSubRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="unknown" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "generationPlant",
        "eGridSubRegion",
        "unknown"
    })
    public static class GenerationLocation {

        protected BigInteger generationPlant;
        protected String eGridSubRegion;
        protected String unknown;

        /**
         * Gets the value of the generationPlant property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getGenerationPlant() {
            return generationPlant;
        }

        /**
         * Sets the value of the generationPlant property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setGenerationPlant(BigInteger value) {
            this.generationPlant = value;
        }

        /**
         * Gets the value of the eGridSubRegion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEGridSubRegion() {
            return eGridSubRegion;
        }

        /**
         * Sets the value of the eGridSubRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEGridSubRegion(String value) {
            this.eGridSubRegion = value;
        }

        /**
         * Gets the value of the unknown property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnknown() {
            return unknown;
        }

        /**
         * Sets the value of the unknown property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnknown(String value) {
            this.unknown = value;
        }

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
     *         &lt;element name="biomassPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="biogasPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="geothermalPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="smallHydroPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="solarPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="windPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="unknownPct" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    public static class Sources {

        @XmlElement(required = true)
        protected BigDecimal biomassPct;
        @XmlElement(required = true)
        protected BigDecimal biogasPct;
        @XmlElement(required = true)
        protected BigDecimal geothermalPct;
        @XmlElement(required = true)
        protected BigDecimal smallHydroPct;
        @XmlElement(required = true)
        protected BigDecimal solarPct;
        @XmlElement(required = true)
        protected BigDecimal windPct;
        @XmlElement(required = true)
        protected BigDecimal unknownPct;

        /**
         * Gets the value of the biomassPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBiomassPct() {
            return biomassPct;
        }

        /**
         * Sets the value of the biomassPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBiomassPct(BigDecimal value) {
            this.biomassPct = value;
        }

        /**
         * Gets the value of the biogasPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBiogasPct() {
            return biogasPct;
        }

        /**
         * Sets the value of the biogasPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBiogasPct(BigDecimal value) {
            this.biogasPct = value;
        }

        /**
         * Gets the value of the geothermalPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGeothermalPct() {
            return geothermalPct;
        }

        /**
         * Sets the value of the geothermalPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGeothermalPct(BigDecimal value) {
            this.geothermalPct = value;
        }

        /**
         * Gets the value of the smallHydroPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSmallHydroPct() {
            return smallHydroPct;
        }

        /**
         * Sets the value of the smallHydroPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSmallHydroPct(BigDecimal value) {
            this.smallHydroPct = value;
        }

        /**
         * Gets the value of the solarPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSolarPct() {
            return solarPct;
        }

        /**
         * Sets the value of the solarPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSolarPct(BigDecimal value) {
            this.solarPct = value;
        }

        /**
         * Gets the value of the windPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWindPct() {
            return windPct;
        }

        /**
         * Sets the value of the windPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWindPct(BigDecimal value) {
            this.windPct = value;
        }

        /**
         * Gets the value of the unknownPct property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnknownPct() {
            return unknownPct;
        }

        /**
         * Sets the value of the unknownPct property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnknownPct(BigDecimal value) {
            this.unknownPct = value;
        }

    }

}
