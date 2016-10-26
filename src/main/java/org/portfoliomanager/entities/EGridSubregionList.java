
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;sequence>
 *         &lt;element ref="{}eGridSubregion" maxOccurs="unbounded" minOccurs="0"/>
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
    "eGridSubregion"
})
@XmlRootElement(name = "eGridSubregionList")
public class EGridSubregionList {

    protected List<EGridSubregion> eGridSubregion;

    /**
     * Gets the value of the eGridSubregion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eGridSubregion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGridSubregion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EGridSubregion }
     *
     *
     */
    public List<EGridSubregion> getEGridSubregion() {
        if (eGridSubregion == null) {
            eGridSubregion = new ArrayList<EGridSubregion>();
        }
        return this.eGridSubregion;
    }

}
