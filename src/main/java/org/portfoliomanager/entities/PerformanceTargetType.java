
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for performanceTargetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="performanceTargetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetMetric">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="No Target"/>
 *               &lt;enumeration value="Target ENERGY STAR Score"/>
 *               &lt;enumeration value="Target % Better than Baseline"/>
 *               &lt;enumeration value="Target % Better than Median"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="targetValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="19"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="26"/>
 *               &lt;enumeration value="27"/>
 *               &lt;enumeration value="28"/>
 *               &lt;enumeration value="29"/>
 *               &lt;enumeration value="30"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="33"/>
 *               &lt;enumeration value="34"/>
 *               &lt;enumeration value="35"/>
 *               &lt;enumeration value="36"/>
 *               &lt;enumeration value="37"/>
 *               &lt;enumeration value="38"/>
 *               &lt;enumeration value="39"/>
 *               &lt;enumeration value="40"/>
 *               &lt;enumeration value="41"/>
 *               &lt;enumeration value="42"/>
 *               &lt;enumeration value="43"/>
 *               &lt;enumeration value="44"/>
 *               &lt;enumeration value="45"/>
 *               &lt;enumeration value="46"/>
 *               &lt;enumeration value="47"/>
 *               &lt;enumeration value="48"/>
 *               &lt;enumeration value="49"/>
 *               &lt;enumeration value="50"/>
 *               &lt;enumeration value="51"/>
 *               &lt;enumeration value="52"/>
 *               &lt;enumeration value="53"/>
 *               &lt;enumeration value="54"/>
 *               &lt;enumeration value="55"/>
 *               &lt;enumeration value="56"/>
 *               &lt;enumeration value="57"/>
 *               &lt;enumeration value="58"/>
 *               &lt;enumeration value="59"/>
 *               &lt;enumeration value="60"/>
 *               &lt;enumeration value="61"/>
 *               &lt;enumeration value="62"/>
 *               &lt;enumeration value="63"/>
 *               &lt;enumeration value="64"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="66"/>
 *               &lt;enumeration value="67"/>
 *               &lt;enumeration value="68"/>
 *               &lt;enumeration value="69"/>
 *               &lt;enumeration value="70"/>
 *               &lt;enumeration value="71"/>
 *               &lt;enumeration value="72"/>
 *               &lt;enumeration value="73"/>
 *               &lt;enumeration value="74"/>
 *               &lt;enumeration value="75"/>
 *               &lt;enumeration value="76"/>
 *               &lt;enumeration value="77"/>
 *               &lt;enumeration value="78"/>
 *               &lt;enumeration value="79"/>
 *               &lt;enumeration value="80"/>
 *               &lt;enumeration value="81"/>
 *               &lt;enumeration value="82"/>
 *               &lt;enumeration value="83"/>
 *               &lt;enumeration value="84"/>
 *               &lt;enumeration value="85"/>
 *               &lt;enumeration value="86"/>
 *               &lt;enumeration value="87"/>
 *               &lt;enumeration value="88"/>
 *               &lt;enumeration value="89"/>
 *               &lt;enumeration value="90"/>
 *               &lt;enumeration value="91"/>
 *               &lt;enumeration value="92"/>
 *               &lt;enumeration value="93"/>
 *               &lt;enumeration value="94"/>
 *               &lt;enumeration value="95"/>
 *               &lt;enumeration value="96"/>
 *               &lt;enumeration value="97"/>
 *               &lt;enumeration value="98"/>
 *               &lt;enumeration value="99"/>
 *               &lt;enumeration value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "performanceTargetType", propOrder = {
    "targetMetric",
    "targetValue"
})
public class PerformanceTargetType {

    @XmlElement(required = true)
    protected String targetMetric;
    protected BigInteger targetValue;

    /**
     * Gets the value of the targetMetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetMetric() {
        return targetMetric;
    }

    /**
     * Sets the value of the targetMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetMetric(String value) {
        this.targetMetric = value;
    }

    /**
     * Gets the value of the targetValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetValue() {
        return targetValue;
    }

    /**
     * Sets the value of the targetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetValue(BigInteger value) {
        this.targetValue = value;
    }

}
