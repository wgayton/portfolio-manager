
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for estimatedEnergyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estimatedEnergyListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="designEntry" type="{}estimatedEnergyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estimatedEnergyListType", propOrder = {
    "designEntry"
})
public class EstimatedEnergyListType {

    protected List<EstimatedEnergyType> designEntry;

    /**
     * Gets the value of the designEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedEnergyType }
     *
     *
     */
    public List<EstimatedEnergyType> getDesignEntry() {
        if (designEntry == null) {
            designEntry = new ArrayList<EstimatedEnergyType>();
        }
        return this.designEntry;
    }

}
