
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for propertyMetricsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyMetricsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}propertyMetrics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyMetricsList", propOrder = {
    "propertyMetrics"
})
public class PropertyMetricsList {

    protected List<PropertyMetricsType> propertyMetrics;

    /**
     * Gets the value of the propertyMetrics property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyMetrics property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyMetrics().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyMetricsType }
     *
     *
     */
    public List<PropertyMetricsType> getPropertyMetrics() {
        if (propertyMetrics == null) {
            propertyMetrics = new ArrayList<PropertyMetricsType>();
        }
        return this.propertyMetrics;
    }

}
