
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for pendingMetersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pendingMetersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meterId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}customFieldList" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{}shareLevelType"/>
 *         &lt;element name="propertyInfo" type="{}propertyType"/>
 *         &lt;element name="meterInfo" type="{}meterType"/>
 *         &lt;element name="shareAudit" type="{}logType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendingMetersType", propOrder = {
    "meterId",
    "propertyId",
    "accountId",
    "customFieldList",
    "accessLevel",
    "propertyInfo",
    "meterInfo",
    "shareAudit"
})
public class PendingMetersType {

    protected long meterId;
    protected long propertyId;
    protected long accountId;
    protected CustomFieldList customFieldList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShareLevelType accessLevel;
    @XmlElement(required = true)
    protected PropertyType propertyInfo;
    @XmlElement(required = true)
    protected MeterType meterInfo;
    protected LogType shareAudit;

    /**
     * Gets the value of the meterId property.
     *
     */
    public long getMeterId() {
        return meterId;
    }

    /**
     * Sets the value of the meterId property.
     *
     */
    public void setMeterId(long value) {
        this.meterId = value;
    }

    /**
     * Gets the value of the propertyId property.
     *
     */
    public long getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     *
     */
    public void setPropertyId(long value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the accountId property.
     *
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the customFieldList property.
     *
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     *
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the accessLevel property.
     *
     * @return
     *     possible object is
     *     {@link ShareLevelType }
     *
     */
    public ShareLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link ShareLevelType }
     *
     */
    public void setAccessLevel(ShareLevelType value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the propertyInfo property.
     *
     * @return
     *     possible object is
     *     {@link PropertyType }
     *
     */
    public PropertyType getPropertyInfo() {
        return propertyInfo;
    }

    /**
     * Sets the value of the propertyInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *
     */
    public void setPropertyInfo(PropertyType value) {
        this.propertyInfo = value;
    }

    /**
     * Gets the value of the meterInfo property.
     *
     * @return
     *     possible object is
     *     {@link MeterType }
     *
     */
    public MeterType getMeterInfo() {
        return meterInfo;
    }

    /**
     * Sets the value of the meterInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link MeterType }
     *
     */
    public void setMeterInfo(MeterType value) {
        this.meterInfo = value;
    }

    /**
     * Gets the value of the shareAudit property.
     *
     * @return
     *     possible object is
     *     {@link LogType }
     *
     */
    public LogType getShareAudit() {
        return shareAudit;
    }

    /**
     * Sets the value of the shareAudit property.
     *
     * @param value
     *     allowed object is
     *     {@link LogType }
     *     
     */
    public void setShareAudit(LogType value) {
        this.shareAudit = value;
    }

}
