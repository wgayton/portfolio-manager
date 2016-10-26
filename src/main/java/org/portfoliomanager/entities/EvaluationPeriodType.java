
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for evaluationPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evaluationPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="preImplementationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="postImplementationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluationPeriodType", propOrder = {

})
public class EvaluationPeriodType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preImplementationDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postImplementationDate;

    /**
     * Gets the value of the preImplementationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreImplementationDate() {
        return preImplementationDate;
    }

    /**
     * Sets the value of the preImplementationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreImplementationDate(XMLGregorianCalendar value) {
        this.preImplementationDate = value;
    }

    /**
     * Gets the value of the postImplementationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostImplementationDate() {
        return postImplementationDate;
    }

    /**
     * Sets the value of the postImplementationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostImplementationDate(XMLGregorianCalendar value) {
        this.postImplementationDate = value;
    }

}
