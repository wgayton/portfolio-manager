
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfEnergyStarPartner.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfEnergyStarPartner">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Associations"/>
 *     &lt;enumeration value="Organizations that Own/Manage/Lease Buildings and Plants"/>
 *     &lt;enumeration value="Service and Product Providers"/>
 *     &lt;enumeration value="Small Businesses"/>
 *     &lt;enumeration value="Utilities and Energy Efficiency Program Sponsors"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfEnergyStarPartner")
@XmlEnum
public enum TypeOfEnergyStarPartner {

    @XmlEnumValue("Associations")
    ASSOCIATIONS("Associations"),
    @XmlEnumValue("Organizations that Own/Manage/Lease Buildings and Plants")
    ORGANIZATIONS_THAT_OWN_MANAGE_LEASE_BUILDINGS_AND_PLANTS("Organizations that Own/Manage/Lease Buildings and Plants"),
    @XmlEnumValue("Service and Product Providers")
    SERVICE_AND_PRODUCT_PROVIDERS("Service and Product Providers"),
    @XmlEnumValue("Small Businesses")
    SMALL_BUSINESSES("Small Businesses"),
    @XmlEnumValue("Utilities and Energy Efficiency Program Sponsors")
    UTILITIES_AND_ENERGY_EFFICIENCY_PROGRAM_SPONSORS("Utilities and Energy Efficiency Program Sponsors"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeOfEnergyStarPartner(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfEnergyStarPartner fromValue(String v) {
        for (TypeOfEnergyStarPartner c: TypeOfEnergyStarPartner.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
