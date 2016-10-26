
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for warningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="warningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="warningNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="warningDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "warningType")
public class WarningType {

    @XmlAttribute(name = "warningNumber")
    protected String warningNumber;
    @XmlAttribute(name = "warningDescription")
    protected String warningDescription;

    /**
     * Gets the value of the warningNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningNumber() {
        return warningNumber;
    }

    /**
     * Sets the value of the warningNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningNumber(String value) {
        this.warningNumber = value;
    }

    /**
     * Gets the value of the warningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarningDescription() {
        return warningDescription;
    }

    /**
     * Sets the value of the warningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarningDescription(String value) {
        this.warningDescription = value;
    }

}
