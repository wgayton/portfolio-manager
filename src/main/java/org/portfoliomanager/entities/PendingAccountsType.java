
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pendingAccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pendingAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{}customFieldList" minOccurs="0"/>
 *         &lt;element ref="{}accountInfo"/>
 *         &lt;element name="connectionAudit" type="{}logType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pendingAccountsType", propOrder = {
    "accountId",
    "customFieldList",
    "accountInfo",
    "connectionAudit"
})
public class PendingAccountsType {

    protected long accountId;
    protected CustomFieldList customFieldList;
    @XmlElement(required = true)
    protected AccountInfo accountInfo;
    protected LogType connectionAudit;

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
     * Gets the value of the accountInfo property.
     *
     * @return
     *     possible object is
     *     {@link AccountInfo }
     *
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link AccountInfo }
     *
     */
    public void setAccountInfo(AccountInfo value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the connectionAudit property.
     *
     * @return
     *     possible object is
     *     {@link LogType }
     *
     */
    public LogType getConnectionAudit() {
        return connectionAudit;
    }

    /**
     * Sets the value of the connectionAudit property.
     *
     * @param value
     *     allowed object is
     *     {@link LogType }
     *     
     */
    public void setConnectionAudit(LogType value) {
        this.connectionAudit = value;
    }

}
