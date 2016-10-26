
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;enumeration value="-1"/>
 *             &lt;enumeration value="-2"/>
 *             &lt;enumeration value="-3"/>
 *             &lt;enumeration value="-4"/>
 *             &lt;enumeration value="-5"/>
 *             &lt;enumeration value="-6"/>
 *             &lt;enumeration value="-7"/>
 *             &lt;enumeration value="-8"/>
 *             &lt;enumeration value="-9"/>
 *             &lt;enumeration value="-10"/>
 *             &lt;enumeration value="-11"/>
 *             &lt;enumeration value="-12"/>
 *             &lt;enumeration value="-13"/>
 *             &lt;enumeration value="-14"/>
 *             &lt;enumeration value="-15"/>
 *             &lt;enumeration value="-16"/>
 *             &lt;enumeration value="-17"/>
 *             &lt;enumeration value="-18"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "questionType")
public class QuestionType {

    @XmlAttribute(name = "id", required = true)
    protected long id;
    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
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

}
