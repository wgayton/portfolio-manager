
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="supportedMeterTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="meterType" type="{}typeOfMeter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="termsOfUse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="none" type="{}emptyType"/>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "dataExchangeSettings")
public class DataExchangeSettings {

    protected DataExchangeSettings.SupportedMeterTypes supportedMeterTypes;
    protected DataExchangeSettings.TermsOfUse termsOfUse;

    /**
     * Gets the value of the supportedMeterTypes property.
     *
     * @return
     *     possible object is
     *     {@link DataExchangeSettings.SupportedMeterTypes }
     *
     */
    public DataExchangeSettings.SupportedMeterTypes getSupportedMeterTypes() {
        return supportedMeterTypes;
    }

    /**
     * Sets the value of the supportedMeterTypes property.
     *
     * @param value
     *     allowed object is
     *     {@link DataExchangeSettings.SupportedMeterTypes }
     *
     */
    public void setSupportedMeterTypes(DataExchangeSettings.SupportedMeterTypes value) {
        this.supportedMeterTypes = value;
    }

    /**
     * Gets the value of the termsOfUse property.
     *
     * @return
     *     possible object is
     *     {@link DataExchangeSettings.TermsOfUse }
     *
     */
    public DataExchangeSettings.TermsOfUse getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * Sets the value of the termsOfUse property.
     *
     * @param value
     *     allowed object is
     *     {@link DataExchangeSettings.TermsOfUse }
     *
     */
    public void setTermsOfUse(DataExchangeSettings.TermsOfUse value) {
        this.termsOfUse = value;
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
     *       &lt;sequence>
     *         &lt;element name="meterType" type="{}typeOfMeter" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "meterType"
    })
    public static class SupportedMeterTypes {

        @XmlSchemaType(name = "string")
        protected List<TypeOfMeter> meterType;

        /**
         * Gets the value of the meterType property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meterType property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeterType().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeOfMeter }
         *
         *
         */
        public List<TypeOfMeter> getMeterType() {
            if (meterType == null) {
                meterType = new ArrayList<TypeOfMeter>();
            }
            return this.meterType;
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
     *       &lt;choice>
     *         &lt;element name="none" type="{}emptyType"/>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
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
        "none",
        "text",
        "url"
    })
    public static class TermsOfUse {

        protected String none;
        protected String text;
        @XmlSchemaType(name = "anyURI")
        protected String url;

        /**
         * Gets the value of the none property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNone() {
            return none;
        }

        /**
         * Sets the value of the none property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNone(String value) {
            this.none = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }

}
