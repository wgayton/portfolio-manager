
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for useYesNoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="useYesNoType">
 *   &lt;complexContent>
 *     &lt;extension base="{}useAttributeBase">
 *       &lt;sequence>
 *         &lt;element name="value" type="{}yesNo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "useYesNoType", propOrder = {
    "value"
})
public class UseYesNoType
    extends UseAttributeBase
{

    @XmlSchemaType(name = "string")
    protected YesNo value;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link YesNo }
     *
     */
    public YesNo getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setValue(YesNo value) {
        this.value = value;
    }

}
