
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baselineAndTargetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baselineAndTargetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseline" type="{}baselineType" minOccurs="0"/>
 *         &lt;element name="target" type="{}performanceTargetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baselineAndTargetType", propOrder = {
    "baseline",
    "target"
})
public class BaselineAndTargetType {

    protected BaselineType baseline;
    protected PerformanceTargetType target;

    /**
     * Gets the value of the baseline property.
     *
     * @return
     *     possible object is
     *     {@link BaselineType }
     *
     */
    public BaselineType getBaseline() {
        return baseline;
    }

    /**
     * Sets the value of the baseline property.
     *
     * @param value
     *     allowed object is
     *     {@link BaselineType }
     *
     */
    public void setBaseline(BaselineType value) {
        this.baseline = value;
    }

    /**
     * Gets the value of the target property.
     *
     * @return
     *     possible object is
     *     {@link PerformanceTargetType }
     *
     */
    public PerformanceTargetType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value
     *     allowed object is
     *     {@link PerformanceTargetType }
     *     
     */
    public void setTarget(PerformanceTargetType value) {
        this.target = value;
    }

}
