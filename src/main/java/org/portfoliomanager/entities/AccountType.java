
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="username">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="securityAnswers" type="{}securityAnswersType"/>
 *         &lt;element name="contact" type="{}contactType"/>
 *         &lt;element name="organization" type="{}organizationType"/>
 *         &lt;element name="webserviceUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeTestPropertiesInGraphics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountType", propOrder = {

})
public class AccountType {

    protected Long id;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected SecurityAnswersType securityAnswers;
    @XmlElement(required = true)
    protected ContactType contact;
    @XmlElement(required = true)
    protected OrganizationType organization;
    protected boolean webserviceUser;
    protected boolean searchable;
    protected Boolean includeTestPropertiesInGraphics;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the securityAnswers property.
     *
     * @return
     *     possible object is
     *     {@link SecurityAnswersType }
     *
     */
    public SecurityAnswersType getSecurityAnswers() {
        return securityAnswers;
    }

    /**
     * Sets the value of the securityAnswers property.
     *
     * @param value
     *     allowed object is
     *     {@link SecurityAnswersType }
     *
     */
    public void setSecurityAnswers(SecurityAnswersType value) {
        this.securityAnswers = value;
    }

    /**
     * Gets the value of the contact property.
     *
     * @return
     *     possible object is
     *     {@link ContactType }
     *
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganization(OrganizationType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the webserviceUser property.
     * 
     */
    public boolean isWebserviceUser() {
        return webserviceUser;
    }

    /**
     * Sets the value of the webserviceUser property.
     * 
     */
    public void setWebserviceUser(boolean value) {
        this.webserviceUser = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the includeTestPropertiesInGraphics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTestPropertiesInGraphics() {
        return includeTestPropertiesInGraphics;
    }

    /**
     * Sets the value of the includeTestPropertiesInGraphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTestPropertiesInGraphics(Boolean value) {
        this.includeTestPropertiesInGraphics = value;
    }

}
