
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allEnergyMetersType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="allEnergyMetersType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electric"/>
 *     &lt;enumeration value="Electric on Site Solar"/>
 *     &lt;enumeration value="Electric on Site Wind"/>
 *     &lt;enumeration value="Natural Gas"/>
 *     &lt;enumeration value="Propane"/>
 *     &lt;enumeration value="Diesel"/>
 *     &lt;enumeration value="District Steam"/>
 *     &lt;enumeration value="District Hot Water"/>
 *     &lt;enumeration value="District Chilled Water - Absorption Chiller using Natural Gas"/>
 *     &lt;enumeration value="District Chilled Water - Electric-Driven Chiller"/>
 *     &lt;enumeration value="District Chilled Water - Engine-Driven Chiller using Natural Gas"/>
 *     &lt;enumeration value="District Chilled Water - Other"/>
 *     &lt;enumeration value="Fuel Oil No 1"/>
 *     &lt;enumeration value="Fuel Oil No 2"/>
 *     &lt;enumeration value="Fuel Oil No 4"/>
 *     &lt;enumeration value="Fuel Oil No 5 or 6"/>
 *     &lt;enumeration value="Coal Anthracite"/>
 *     &lt;enumeration value="Coal Bituminous"/>
 *     &lt;enumeration value="Coke"/>
 *     &lt;enumeration value="Wood"/>
 *     &lt;enumeration value="Kerosene"/>
 *     &lt;enumeration value="Other (Energy)"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "allEnergyMetersType")
@XmlEnum
public enum AllEnergyMetersType {

    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    @XmlEnumValue("Electric on Site Solar")
    ELECTRIC_ON_SITE_SOLAR("Electric on Site Solar"),
    @XmlEnumValue("Electric on Site Wind")
    ELECTRIC_ON_SITE_WIND("Electric on Site Wind"),
    @XmlEnumValue("Natural Gas")
    NATURAL_GAS("Natural Gas"),
    @XmlEnumValue("Propane")
    PROPANE("Propane"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    @XmlEnumValue("District Steam")
    DISTRICT_STEAM("District Steam"),
    @XmlEnumValue("District Hot Water")
    DISTRICT_HOT_WATER("District Hot Water"),
    @XmlEnumValue("District Chilled Water - Absorption Chiller using Natural Gas")
    DISTRICT_CHILLED_WATER_ABSORPTION_CHILLER_USING_NATURAL_GAS("District Chilled Water - Absorption Chiller using Natural Gas"),
    @XmlEnumValue("District Chilled Water - Electric-Driven Chiller")
    DISTRICT_CHILLED_WATER_ELECTRIC_DRIVEN_CHILLER("District Chilled Water - Electric-Driven Chiller"),
    @XmlEnumValue("District Chilled Water - Engine-Driven Chiller using Natural Gas")
    DISTRICT_CHILLED_WATER_ENGINE_DRIVEN_CHILLER_USING_NATURAL_GAS("District Chilled Water - Engine-Driven Chiller using Natural Gas"),
    @XmlEnumValue("District Chilled Water - Other")
    DISTRICT_CHILLED_WATER_OTHER("District Chilled Water - Other"),
    @XmlEnumValue("Fuel Oil No 1")
    FUEL_OIL_NO_1("Fuel Oil No 1"),
    @XmlEnumValue("Fuel Oil No 2")
    FUEL_OIL_NO_2("Fuel Oil No 2"),
    @XmlEnumValue("Fuel Oil No 4")
    FUEL_OIL_NO_4("Fuel Oil No 4"),
    @XmlEnumValue("Fuel Oil No 5 or 6")
    FUEL_OIL_NO_5_OR_6("Fuel Oil No 5 or 6"),
    @XmlEnumValue("Coal Anthracite")
    COAL_ANTHRACITE("Coal Anthracite"),
    @XmlEnumValue("Coal Bituminous")
    COAL_BITUMINOUS("Coal Bituminous"),
    @XmlEnumValue("Coke")
    COKE("Coke"),
    @XmlEnumValue("Wood")
    WOOD("Wood"),
    @XmlEnumValue("Kerosene")
    KEROSENE("Kerosene"),
    @XmlEnumValue("Other (Energy)")
    OTHER_ENERGY("Other (Energy)");
    private final String value;

    AllEnergyMetersType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AllEnergyMetersType fromValue(String v) {
        for (AllEnergyMetersType c: AllEnergyMetersType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
