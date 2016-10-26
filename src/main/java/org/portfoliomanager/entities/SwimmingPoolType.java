
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for swimmingPoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="swimmingPoolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{}propertyUseNameType"/>
 *         &lt;element name="useDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element ref="{}poolSize"/>
 *                   &lt;element ref="{}poolLocation" minOccurs="0"/>
 *                   &lt;element ref="{}monthsInUse" minOccurs="0"/>
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
@XmlType(name = "swimmingPoolType", propOrder = {

})
public class SwimmingPoolType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected SwimmingPoolType.UseDetails useDetails;
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
     *     {@link SwimmingPoolType.UseDetails }
     *
     */
    public SwimmingPoolType.UseDetails getUseDetails() {
        return useDetails;
    }

    /**
     * Sets the value of the useDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link SwimmingPoolType.UseDetails }
     *
     */
    public void setUseDetails(SwimmingPoolType.UseDetails value) {
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
     *         &lt;element ref="{}poolSize"/>
     *         &lt;element ref="{}poolLocation" minOccurs="0"/>
     *         &lt;element ref="{}monthsInUse" minOccurs="0"/>
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
        protected PoolSizeType poolSize;
        protected PoolType poolLocation;
        protected MonthsInUseType monthsInUse;

        /**
         * Gets the value of the poolSize property.
         *
         * @return
         *     possible object is
         *     {@link PoolSizeType }
         *
         */
        public PoolSizeType getPoolSize() {
            return poolSize;
        }

        /**
         * Sets the value of the poolSize property.
         *
         * @param value
         *     allowed object is
         *     {@link PoolSizeType }
         *
         */
        public void setPoolSize(PoolSizeType value) {
            this.poolSize = value;
        }

        /**
         * Gets the value of the poolLocation property.
         *
         * @return
         *     possible object is
         *     {@link PoolType }
         *
         */
        public PoolType getPoolLocation() {
            return poolLocation;
        }

        /**
         * Sets the value of the poolLocation property.
         *
         * @param value
         *     allowed object is
         *     {@link PoolType }
         *
         */
        public void setPoolLocation(PoolType value) {
            this.poolLocation = value;
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

    }

}
