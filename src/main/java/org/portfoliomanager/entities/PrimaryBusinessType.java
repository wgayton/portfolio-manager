
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primaryBusinessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="primaryBusinessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Architecture/Design Firm"/>
 *     &lt;enumeration value="Banking/Financial"/>
 *     &lt;enumeration value="Commercial Real Estate"/>
 *     &lt;enumeration value="Congregation/Faith-Based Organization"/>
 *     &lt;enumeration value="Data Center"/>
 *     &lt;enumeration value="Drinking Water Treatment/Distribution"/>
 *     &lt;enumeration value="Education"/>
 *     &lt;enumeration value="Energy Efficiency Program"/>
 *     &lt;enumeration value="Entertainment/Recreation"/>
 *     &lt;enumeration value="Food Service"/>
 *     &lt;enumeration value="Government: Local (U.S.)"/>
 *     &lt;enumeration value="Government: Outside U.S."/>
 *     &lt;enumeration value="Government: State (U.S.)"/>
 *     &lt;enumeration value="Government: Federal (U.S.)"/>
 *     &lt;enumeration value="Healthcare"/>
 *     &lt;enumeration value="Hospitality"/>
 *     &lt;enumeration value="Legal Services"/>
 *     &lt;enumeration value="Manufacturing/Industrial"/>
 *     &lt;enumeration value="Media"/>
 *     &lt;enumeration value="Multifamily Housing"/>
 *     &lt;enumeration value="Retail"/>
 *     &lt;enumeration value="Senior Care"/>
 *     &lt;enumeration value="Service and Product Provider/Consultant"/>
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="Utility"/>
 *     &lt;enumeration value="Wastewater Treatment"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "primaryBusinessType")
@XmlEnum
public enum PrimaryBusinessType {

    @XmlEnumValue("Architecture/Design Firm")
    ARCHITECTURE_DESIGN_FIRM("Architecture/Design Firm"),
    @XmlEnumValue("Banking/Financial")
    BANKING_FINANCIAL("Banking/Financial"),
    @XmlEnumValue("Commercial Real Estate")
    COMMERCIAL_REAL_ESTATE("Commercial Real Estate"),
    @XmlEnumValue("Congregation/Faith-Based Organization")
    CONGREGATION_FAITH_BASED_ORGANIZATION("Congregation/Faith-Based Organization"),
    @XmlEnumValue("Data Center")
    DATA_CENTER("Data Center"),
    @XmlEnumValue("Drinking Water Treatment/Distribution")
    DRINKING_WATER_TREATMENT_DISTRIBUTION("Drinking Water Treatment/Distribution"),
    @XmlEnumValue("Education")
    EDUCATION("Education"),
    @XmlEnumValue("Energy Efficiency Program")
    ENERGY_EFFICIENCY_PROGRAM("Energy Efficiency Program"),
    @XmlEnumValue("Entertainment/Recreation")
    ENTERTAINMENT_RECREATION("Entertainment/Recreation"),
    @XmlEnumValue("Food Service")
    FOOD_SERVICE("Food Service"),
    @XmlEnumValue("Government: Local (U.S.)")
    GOVERNMENT_LOCAL_U_S("Government: Local (U.S.)"),
    @XmlEnumValue("Government: Outside U.S.")
    GOVERNMENT_OUTSIDE_U_S("Government: Outside U.S."),
    @XmlEnumValue("Government: State (U.S.)")
    GOVERNMENT_STATE_U_S("Government: State (U.S.)"),
    @XmlEnumValue("Government: Federal (U.S.)")
    GOVERNMENT_FEDERAL_U_S("Government: Federal (U.S.)"),
    @XmlEnumValue("Healthcare")
    HEALTHCARE("Healthcare"),
    @XmlEnumValue("Hospitality")
    HOSPITALITY("Hospitality"),
    @XmlEnumValue("Legal Services")
    LEGAL_SERVICES("Legal Services"),
    @XmlEnumValue("Manufacturing/Industrial")
    MANUFACTURING_INDUSTRIAL("Manufacturing/Industrial"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    @XmlEnumValue("Multifamily Housing")
    MULTIFAMILY_HOUSING("Multifamily Housing"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("Senior Care")
    SENIOR_CARE("Senior Care"),
    @XmlEnumValue("Service and Product Provider/Consultant")
    SERVICE_AND_PRODUCT_PROVIDER_CONSULTANT("Service and Product Provider/Consultant"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("Utility")
    UTILITY("Utility"),
    @XmlEnumValue("Wastewater Treatment")
    WASTEWATER_TREATMENT("Wastewater Treatment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PrimaryBusinessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimaryBusinessType fromValue(String v) {
        for (PrimaryBusinessType c: PrimaryBusinessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
