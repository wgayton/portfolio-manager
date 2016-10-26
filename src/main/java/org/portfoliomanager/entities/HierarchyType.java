
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hierarchyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyUseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="useDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="consumptionDataId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hierarchyType", propOrder = {
    "accountId",
    "propertyId",
    "propertyUseId",
    "useDetailId",
    "meterId",
    "consumptionDataId"
})
public class HierarchyType {

    protected Long accountId;
    protected Long propertyId;
    protected Long propertyUseId;
    protected Long useDetailId;
    protected Long meterId;
    protected Long consumptionDataId;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPropertyId(Long value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the propertyUseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPropertyUseId() {
        return propertyUseId;
    }

    /**
     * Sets the value of the propertyUseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPropertyUseId(Long value) {
        this.propertyUseId = value;
    }

    /**
     * Gets the value of the useDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUseDetailId() {
        return useDetailId;
    }

    /**
     * Sets the value of the useDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUseDetailId(Long value) {
        this.useDetailId = value;
    }

    /**
     * Gets the value of the meterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeterId() {
        return meterId;
    }

    /**
     * Sets the value of the meterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeterId(Long value) {
        this.meterId = value;
    }

    /**
     * Gets the value of the consumptionDataId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConsumptionDataId() {
        return consumptionDataId;
    }

    /**
     * Sets the value of the consumptionDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConsumptionDataId(Long value) {
        this.consumptionDataId = value;
    }

}
