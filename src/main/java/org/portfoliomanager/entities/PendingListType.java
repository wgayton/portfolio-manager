
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for pendingListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pendingListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{}pendingAccountsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="property" type="{}pendingPropertiesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="meter" type="{}pendingMetersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="links" type="{}linksType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendingListType", propOrder = {
    "account",
    "property",
    "meter",
    "links"
})
public class PendingListType {

    protected List<PendingAccountsType> account;
    protected List<PendingPropertiesType> property;
    protected List<PendingMetersType> meter;
    protected LinksType links;

    /**
     * Gets the value of the account property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingAccountsType }
     *
     *
     */
    public List<PendingAccountsType> getAccount() {
        if (account == null) {
            account = new ArrayList<PendingAccountsType>();
        }
        return this.account;
    }

    /**
     * Gets the value of the property property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingPropertiesType }
     *
     *
     */
    public List<PendingPropertiesType> getProperty() {
        if (property == null) {
            property = new ArrayList<PendingPropertiesType>();
        }
        return this.property;
    }

    /**
     * Gets the value of the meter property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meter property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeter().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingMetersType }
     *
     *
     */
    public List<PendingMetersType> getMeter() {
        if (meter == null) {
            meter = new ArrayList<PendingMetersType>();
        }
        return this.meter;
    }

    /**
     * Gets the value of the links property.
     *
     * @return
     *     possible object is
     *     {@link LinksType }
     *
     */
    public LinksType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     *
     * @param value
     *     allowed object is
     *     {@link LinksType }
     *     
     */
    public void setLinks(LinksType value) {
        this.links = value;
    }

}
