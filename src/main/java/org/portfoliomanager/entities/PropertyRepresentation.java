
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;


/**
 * 
 *                     Indicates whether the whole facility energy consumption or only a portion of that total is represented by its meters. (Added 03/2011)
 *                 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="propertyRepresentationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Whole Property"/>
 *               &lt;enumeration value="Common Area Energy Consumption Only"/>
 *               &lt;enumeration value="Tenant Energy Consumption Only"/>
 *               &lt;enumeration value="Combination of Tenant and Common Area Consumption"/>
 *               &lt;enumeration value="Other"/>
 *               &lt;enumeration value="No Selection Made"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tenantCommonAreaEnergyUseList" type="{}tenantCommonAreaEnergyUseInformationType" minOccurs="0"/>
 *         &lt;element name="propertyRepresentationTypeOtherDesc" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "propertyRepresentation")
public class PropertyRepresentation {

    @XmlElement(required = true)
    protected String propertyRepresentationType;
    protected TenantCommonAreaEnergyUseInformationType tenantCommonAreaEnergyUseList;
    protected String propertyRepresentationTypeOtherDesc;

    /**
     * Gets the value of the propertyRepresentationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRepresentationType() {
        return propertyRepresentationType;
    }

    /**
     * Sets the value of the propertyRepresentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRepresentationType(String value) {
        this.propertyRepresentationType = value;
    }

    /**
     * Gets the value of the tenantCommonAreaEnergyUseList property.
     * 
     * @return
     *     possible object is
     *     {@link TenantCommonAreaEnergyUseInformationType }
     *     
     */
    public TenantCommonAreaEnergyUseInformationType getTenantCommonAreaEnergyUseList() {
        return tenantCommonAreaEnergyUseList;
    }

    /**
     * Sets the value of the tenantCommonAreaEnergyUseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenantCommonAreaEnergyUseInformationType }
     *     
     */
    public void setTenantCommonAreaEnergyUseList(TenantCommonAreaEnergyUseInformationType value) {
        this.tenantCommonAreaEnergyUseList = value;
    }

    /**
     * Gets the value of the propertyRepresentationTypeOtherDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyRepresentationTypeOtherDesc() {
        return propertyRepresentationTypeOtherDesc;
    }

    /**
     * Sets the value of the propertyRepresentationTypeOtherDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyRepresentationTypeOtherDesc(String value) {
        this.propertyRepresentationTypeOtherDesc = value;
    }

}
