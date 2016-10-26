
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for notificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="meterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="notificationCreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notificationCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationCreatedByAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notificationType", propOrder = {
    "notificationTypeCode",
    "notificationId",
    "description",
    "accountId",
    "propertyId",
    "meterId",
    "notificationCreatedDate",
    "notificationCreatedBy",
    "notificationCreatedByAccountId"
})
public class NotificationType {

    @XmlElement(required = true)
    protected String notificationTypeCode;
    protected long notificationId;
    @XmlElement(required = true)
    protected String description;
    protected Long accountId;
    protected Long propertyId;
    protected Long meterId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notificationCreatedDate;
    protected String notificationCreatedBy;
    protected String notificationCreatedByAccountId;

    /**
     * Gets the value of the notificationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationTypeCode() {
        return notificationTypeCode;
    }

    /**
     * Sets the value of the notificationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationTypeCode(String value) {
        this.notificationTypeCode = value;
    }

    /**
     * Gets the value of the notificationId property.
     * 
     */
    public long getNotificationId() {
        return notificationId;
    }

    /**
     * Sets the value of the notificationId property.
     * 
     */
    public void setNotificationId(long value) {
        this.notificationId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     * Gets the value of the notificationCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationCreatedDate() {
        return notificationCreatedDate;
    }

    /**
     * Sets the value of the notificationCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationCreatedDate(XMLGregorianCalendar value) {
        this.notificationCreatedDate = value;
    }

    /**
     * Gets the value of the notificationCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCreatedBy() {
        return notificationCreatedBy;
    }

    /**
     * Sets the value of the notificationCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCreatedBy(String value) {
        this.notificationCreatedBy = value;
    }

    /**
     * Gets the value of the notificationCreatedByAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationCreatedByAccountId() {
        return notificationCreatedByAccountId;
    }

    /**
     * Sets the value of the notificationCreatedByAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationCreatedByAccountId(String value) {
        this.notificationCreatedByAccountId = value;
    }

}
