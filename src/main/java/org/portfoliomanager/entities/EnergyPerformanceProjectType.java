
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>Java class for energyPerformanceProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyPerformanceProjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="projectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="projectDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="propertyName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="implementationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="category" type="{}categoryType" minOccurs="0"/>
 *         &lt;element name="categoryOtherDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="investmentCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimatedSavingsCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="evaluationPeriod" type="{}evaluationPeriodType" minOccurs="0"/>
 *         &lt;element name="audit" type="{}logType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyPerformanceProjectType", propOrder = {

})
public class EnergyPerformanceProjectType {

    protected String projectName;
    protected String projectDescription;
    protected Long propertyId;
    protected String propertyName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar implementationDate;
    @XmlSchemaType(name = "string")
    protected CategoryType category;
    protected String categoryOtherDescription;
    protected BigDecimal investmentCost;
    protected BigDecimal estimatedSavingsCost;
    protected EvaluationPeriodType evaluationPeriod;
    protected LogType audit;

    /**
     * Gets the value of the projectName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the projectDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProjectDescription() {
        return projectDescription;
    }

    /**
     * Sets the value of the projectDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProjectDescription(String value) {
        this.projectDescription = value;
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
     * Gets the value of the propertyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the implementationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getImplementationDate() {
        return implementationDate;
    }

    /**
     * Sets the value of the implementationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setImplementationDate(XMLGregorianCalendar value) {
        this.implementationDate = value;
    }

    /**
     * Gets the value of the category property.
     *
     * @return
     *     possible object is
     *     {@link CategoryType }
     *
     */
    public CategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link CategoryType }
     *
     */
    public void setCategory(CategoryType value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryOtherDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoryOtherDescription() {
        return categoryOtherDescription;
    }

    /**
     * Sets the value of the categoryOtherDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoryOtherDescription(String value) {
        this.categoryOtherDescription = value;
    }

    /**
     * Gets the value of the investmentCost property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getInvestmentCost() {
        return investmentCost;
    }

    /**
     * Sets the value of the investmentCost property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setInvestmentCost(BigDecimal value) {
        this.investmentCost = value;
    }

    /**
     * Gets the value of the estimatedSavingsCost property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getEstimatedSavingsCost() {
        return estimatedSavingsCost;
    }

    /**
     * Sets the value of the estimatedSavingsCost property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setEstimatedSavingsCost(BigDecimal value) {
        this.estimatedSavingsCost = value;
    }

    /**
     * Gets the value of the evaluationPeriod property.
     *
     * @return
     *     possible object is
     *     {@link EvaluationPeriodType }
     *
     */
    public EvaluationPeriodType getEvaluationPeriod() {
        return evaluationPeriod;
    }

    /**
     * Sets the value of the evaluationPeriod property.
     *
     * @param value
     *     allowed object is
     *     {@link EvaluationPeriodType }
     *
     */
    public void setEvaluationPeriod(EvaluationPeriodType value) {
        this.evaluationPeriod = value;
    }

    /**
     * Gets the value of the audit property.
     *
     * @return
     *     possible object is
     *     {@link LogType }
     *
     */
    public LogType getAudit() {
        return audit;
    }

    /**
     * Sets the value of the audit property.
     *
     * @param value
     *     allowed object is
     *     {@link LogType }
     *
     */
    public void setAudit(LogType value) {
        this.audit = value;
    }

}
