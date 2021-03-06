
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="country">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="US"/>
 *             &lt;enumeration value="CA"/>
 *             &lt;enumeration value="AD"/>
 *             &lt;enumeration value="AE"/>
 *             &lt;enumeration value="AF"/>
 *             &lt;enumeration value="AG"/>
 *             &lt;enumeration value="AL"/>
 *             &lt;enumeration value="AM"/>
 *             &lt;enumeration value="AN"/>
 *             &lt;enumeration value="AO"/>
 *             &lt;enumeration value="AQ"/>
 *             &lt;enumeration value="AR"/>
 *             &lt;enumeration value="AS"/>
 *             &lt;enumeration value="AT"/>
 *             &lt;enumeration value="AU"/>
 *             &lt;enumeration value="AW"/>
 *             &lt;enumeration value="AZ"/>
 *             &lt;enumeration value="BA"/>
 *             &lt;enumeration value="BB"/>
 *             &lt;enumeration value="BD"/>
 *             &lt;enumeration value="BE"/>
 *             &lt;enumeration value="BF"/>
 *             &lt;enumeration value="BG"/>
 *             &lt;enumeration value="BH"/>
 *             &lt;enumeration value="BI"/>
 *             &lt;enumeration value="BJ"/>
 *             &lt;enumeration value="BM"/>
 *             &lt;enumeration value="BN"/>
 *             &lt;enumeration value="BO"/>
 *             &lt;enumeration value="BR"/>
 *             &lt;enumeration value="BS"/>
 *             &lt;enumeration value="BT"/>
 *             &lt;enumeration value="BV"/>
 *             &lt;enumeration value="BW"/>
 *             &lt;enumeration value="BY"/>
 *             &lt;enumeration value="BZ"/>
 *             &lt;enumeration value="CC"/>
 *             &lt;enumeration value="CD"/>
 *             &lt;enumeration value="CF"/>
 *             &lt;enumeration value="CG"/>
 *             &lt;enumeration value="CH"/>
 *             &lt;enumeration value="CI"/>
 *             &lt;enumeration value="CK"/>
 *             &lt;enumeration value="CL"/>
 *             &lt;enumeration value="CM"/>
 *             &lt;enumeration value="CN"/>
 *             &lt;enumeration value="CO"/>
 *             &lt;enumeration value="CR"/>
 *             &lt;enumeration value="CS"/>
 *             &lt;enumeration value="CU"/>
 *             &lt;enumeration value="CV"/>
 *             &lt;enumeration value="CX"/>
 *             &lt;enumeration value="CY"/>
 *             &lt;enumeration value="CZ"/>
 *             &lt;enumeration value="DE"/>
 *             &lt;enumeration value="DJ"/>
 *             &lt;enumeration value="DK"/>
 *             &lt;enumeration value="DM"/>
 *             &lt;enumeration value="DO"/>
 *             &lt;enumeration value="DZ"/>
 *             &lt;enumeration value="EC"/>
 *             &lt;enumeration value="EE"/>
 *             &lt;enumeration value="EG"/>
 *             &lt;enumeration value="EH"/>
 *             &lt;enumeration value="ER"/>
 *             &lt;enumeration value="ES"/>
 *             &lt;enumeration value="ET"/>
 *             &lt;enumeration value="FI"/>
 *             &lt;enumeration value="FJ"/>
 *             &lt;enumeration value="FK"/>
 *             &lt;enumeration value="FM"/>
 *             &lt;enumeration value="FO"/>
 *             &lt;enumeration value="FR"/>
 *             &lt;enumeration value="GA"/>
 *             &lt;enumeration value="GB"/>
 *             &lt;enumeration value="GD"/>
 *             &lt;enumeration value="GE"/>
 *             &lt;enumeration value="GF"/>
 *             &lt;enumeration value="GH"/>
 *             &lt;enumeration value="GI"/>
 *             &lt;enumeration value="GL"/>
 *             &lt;enumeration value="GM"/>
 *             &lt;enumeration value="GN"/>
 *             &lt;enumeration value="GP"/>
 *             &lt;enumeration value="GQ"/>
 *             &lt;enumeration value="GR"/>
 *             &lt;enumeration value="GS"/>
 *             &lt;enumeration value="GT"/>
 *             &lt;enumeration value="GU"/>
 *             &lt;enumeration value="GW"/>
 *             &lt;enumeration value="GY"/>
 *             &lt;enumeration value="HK"/>
 *             &lt;enumeration value="HM"/>
 *             &lt;enumeration value="HN"/>
 *             &lt;enumeration value="HR"/>
 *             &lt;enumeration value="HT"/>
 *             &lt;enumeration value="HU"/>
 *             &lt;enumeration value="ID"/>
 *             &lt;enumeration value="IE"/>
 *             &lt;enumeration value="IL"/>
 *             &lt;enumeration value="IN"/>
 *             &lt;enumeration value="IO"/>
 *             &lt;enumeration value="IQ"/>
 *             &lt;enumeration value="IR"/>
 *             &lt;enumeration value="IS"/>
 *             &lt;enumeration value="IT"/>
 *             &lt;enumeration value="JM"/>
 *             &lt;enumeration value="JO"/>
 *             &lt;enumeration value="JP"/>
 *             &lt;enumeration value="KE"/>
 *             &lt;enumeration value="KG"/>
 *             &lt;enumeration value="KH"/>
 *             &lt;enumeration value="KI"/>
 *             &lt;enumeration value="KM"/>
 *             &lt;enumeration value="KN"/>
 *             &lt;enumeration value="KP"/>
 *             &lt;enumeration value="KR"/>
 *             &lt;enumeration value="KW"/>
 *             &lt;enumeration value="KY"/>
 *             &lt;enumeration value="KZ"/>
 *             &lt;enumeration value="LA"/>
 *             &lt;enumeration value="LB"/>
 *             &lt;enumeration value="LC"/>
 *             &lt;enumeration value="LI"/>
 *             &lt;enumeration value="LK"/>
 *             &lt;enumeration value="LR"/>
 *             &lt;enumeration value="LS"/>
 *             &lt;enumeration value="LT"/>
 *             &lt;enumeration value="LU"/>
 *             &lt;enumeration value="LV"/>
 *             &lt;enumeration value="LY"/>
 *             &lt;enumeration value="MA"/>
 *             &lt;enumeration value="MC"/>
 *             &lt;enumeration value="MD"/>
 *             &lt;enumeration value="MG"/>
 *             &lt;enumeration value="MH"/>
 *             &lt;enumeration value="MK"/>
 *             &lt;enumeration value="ML"/>
 *             &lt;enumeration value="MM"/>
 *             &lt;enumeration value="MN"/>
 *             &lt;enumeration value="MO"/>
 *             &lt;enumeration value="MP"/>
 *             &lt;enumeration value="MQ"/>
 *             &lt;enumeration value="MR"/>
 *             &lt;enumeration value="MS"/>
 *             &lt;enumeration value="MT"/>
 *             &lt;enumeration value="MU"/>
 *             &lt;enumeration value="MV"/>
 *             &lt;enumeration value="MW"/>
 *             &lt;enumeration value="MX"/>
 *             &lt;enumeration value="MY"/>
 *             &lt;enumeration value="MZ"/>
 *             &lt;enumeration value="NA"/>
 *             &lt;enumeration value="NC"/>
 *             &lt;enumeration value="NE"/>
 *             &lt;enumeration value="NF"/>
 *             &lt;enumeration value="NG"/>
 *             &lt;enumeration value="NI"/>
 *             &lt;enumeration value="NL"/>
 *             &lt;enumeration value="NO"/>
 *             &lt;enumeration value="NP"/>
 *             &lt;enumeration value="NR"/>
 *             &lt;enumeration value="NU"/>
 *             &lt;enumeration value="NZ"/>
 *             &lt;enumeration value="OM"/>
 *             &lt;enumeration value="PA"/>
 *             &lt;enumeration value="PE"/>
 *             &lt;enumeration value="PF"/>
 *             &lt;enumeration value="PG"/>
 *             &lt;enumeration value="PH"/>
 *             &lt;enumeration value="PK"/>
 *             &lt;enumeration value="PL"/>
 *             &lt;enumeration value="PM"/>
 *             &lt;enumeration value="PN"/>
 *             &lt;enumeration value="PR"/>
 *             &lt;enumeration value="PS"/>
 *             &lt;enumeration value="PW"/>
 *             &lt;enumeration value="PY"/>
 *             &lt;enumeration value="QA"/>
 *             &lt;enumeration value="RE"/>
 *             &lt;enumeration value="RO"/>
 *             &lt;enumeration value="RU"/>
 *             &lt;enumeration value="RW"/>
 *             &lt;enumeration value="SA"/>
 *             &lt;enumeration value="SB"/>
 *             &lt;enumeration value="SC"/>
 *             &lt;enumeration value="SD"/>
 *             &lt;enumeration value="SE"/>
 *             &lt;enumeration value="SG"/>
 *             &lt;enumeration value="SH"/>
 *             &lt;enumeration value="SI"/>
 *             &lt;enumeration value="SJ"/>
 *             &lt;enumeration value="SK"/>
 *             &lt;enumeration value="SL"/>
 *             &lt;enumeration value="SM"/>
 *             &lt;enumeration value="SN"/>
 *             &lt;enumeration value="SO"/>
 *             &lt;enumeration value="SR"/>
 *             &lt;enumeration value="ST"/>
 *             &lt;enumeration value="SV"/>
 *             &lt;enumeration value="SY"/>
 *             &lt;enumeration value="SZ"/>
 *             &lt;enumeration value="TC"/>
 *             &lt;enumeration value="TD"/>
 *             &lt;enumeration value="TF"/>
 *             &lt;enumeration value="TG"/>
 *             &lt;enumeration value="TH"/>
 *             &lt;enumeration value="TJ"/>
 *             &lt;enumeration value="TK"/>
 *             &lt;enumeration value="TL"/>
 *             &lt;enumeration value="TM"/>
 *             &lt;enumeration value="TN"/>
 *             &lt;enumeration value="TO"/>
 *             &lt;enumeration value="TR"/>
 *             &lt;enumeration value="TT"/>
 *             &lt;enumeration value="TV"/>
 *             &lt;enumeration value="TW"/>
 *             &lt;enumeration value="TZ"/>
 *             &lt;enumeration value="UA"/>
 *             &lt;enumeration value="UG"/>
 *             &lt;enumeration value="UM"/>
 *             &lt;enumeration value="UY"/>
 *             &lt;enumeration value="UZ"/>
 *             &lt;enumeration value="VC"/>
 *             &lt;enumeration value="VE"/>
 *             &lt;enumeration value="VG"/>
 *             &lt;enumeration value="VI"/>
 *             &lt;enumeration value="VN"/>
 *             &lt;enumeration value="VU"/>
 *             &lt;enumeration value="WF"/>
 *             &lt;enumeration value="WS"/>
 *             &lt;enumeration value="YE"/>
 *             &lt;enumeration value="YT"/>
 *             &lt;enumeration value="ZA"/>
 *             &lt;enumeration value="ZM"/>
 *             &lt;enumeration value="ZW"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyType")
public class AgencyType {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "country")
    protected String country;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
