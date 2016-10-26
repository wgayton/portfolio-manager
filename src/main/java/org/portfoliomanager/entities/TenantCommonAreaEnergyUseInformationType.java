
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for tenantCommonAreaEnergyUseInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tenantCommonAreaEnergyUseInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="energyUse" type="{}tenantCommonAreaEnergyType" maxOccurs="8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tenantCommonAreaEnergyUseInformationType", propOrder = {
    "energyUse"
})
public class TenantCommonAreaEnergyUseInformationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<TenantCommonAreaEnergyType> energyUse;

    /**
     * Gets the value of the energyUse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyUse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyUse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenantCommonAreaEnergyType }
     *
     *
     */
    public List<TenantCommonAreaEnergyType> getEnergyUse() {
        if (energyUse == null) {
            energyUse = new ArrayList<TenantCommonAreaEnergyType>();
        }
        return this.energyUse;
    }

}
