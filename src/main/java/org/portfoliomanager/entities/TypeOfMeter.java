
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfMeter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfMeter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Coal Anthracite"/>
 *     &lt;enumeration value="Coal Bituminous"/>
 *     &lt;enumeration value="Coke"/>
 *     &lt;enumeration value="Diesel"/>
 *     &lt;enumeration value="District Chilled Water - Absorption Chiller using Natural Gas"/>
 *     &lt;enumeration value="District Chilled Water - Electric-Driven Chiller"/>
 *     &lt;enumeration value="District Chilled Water - Engine-Driven Chiller using Natural Gas"/>
 *     &lt;enumeration value="District Chilled Water - Other"/>
 *     &lt;enumeration value="District Hot Water"/>
 *     &lt;enumeration value="District Steam"/>
 *     &lt;enumeration value="Electric"/>
 *     &lt;enumeration value="Electric on Site Solar"/>
 *     &lt;enumeration value="Electric on Site Wind"/>
 *     &lt;enumeration value="Fuel Oil No 1"/>
 *     &lt;enumeration value="Fuel Oil No 2"/>
 *     &lt;enumeration value="Fuel Oil No 4"/>
 *     &lt;enumeration value="Fuel Oil No 5 or 6"/>
 *     &lt;enumeration value="Kerosene"/>
 *     &lt;enumeration value="Natural Gas"/>
 *     &lt;enumeration value="Other (Energy)"/>
 *     &lt;enumeration value="Propane"/>
 *     &lt;enumeration value="Wood"/>
 *     &lt;enumeration value="IT Equipment Input Energy (meters on each piece of equipment)"/>
 *     &lt;enumeration value="Power Distribution Unit (PDU) Input Energy"/>
 *     &lt;enumeration value="Power Distribution Unit (PDU) Output Energy"/>
 *     &lt;enumeration value="Uninterruptible Power Supply (UPS) Output Energy"/>
 *     &lt;enumeration value="Alternative Water Generated On-Site - Mixed Indoor/Outdoor"/>
 *     &lt;enumeration value="Alternative Water Generated On-Site - Indoor"/>
 *     &lt;enumeration value="Alternative Water Generated On-Site - Outdoor"/>
 *     &lt;enumeration value="Municipally Supplied Potable Water - Mixed Indoor/Outdoor"/>
 *     &lt;enumeration value="Municipally Supplied Potable Water - Indoor"/>
 *     &lt;enumeration value="Municipally Supplied Potable Water - Outdoor"/>
 *     &lt;enumeration value="Municipally Supplied Reclaimed Water - Mixed Indoor/Outdoor"/>
 *     &lt;enumeration value="Municipally Supplied Reclaimed Water - Indoor"/>
 *     &lt;enumeration value="Municipally Supplied Reclaimed Water - Outdoor"/>
 *     &lt;enumeration value="Other - Mixed Indoor/Outdoor (Water)"/>
 *     &lt;enumeration value="Other - Outdoor"/>
 *     &lt;enumeration value="Other - Indoor"/>
 *     &lt;enumeration value="Average Influent Flow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfMeter")
@XmlEnum
public enum TypeOfMeter {

    @XmlEnumValue("Coal Anthracite")
    COAL_ANTHRACITE("Coal Anthracite"),
    @XmlEnumValue("Coal Bituminous")
    COAL_BITUMINOUS("Coal Bituminous"),
    @XmlEnumValue("Coke")
    COKE("Coke"),
    @XmlEnumValue("Diesel")
    DIESEL("Diesel"),
    @XmlEnumValue("District Chilled Water - Absorption Chiller using Natural Gas")
    DISTRICT_CHILLED_WATER_ABSORPTION_CHILLER_USING_NATURAL_GAS("District Chilled Water - Absorption Chiller using Natural Gas"),
    @XmlEnumValue("District Chilled Water - Electric-Driven Chiller")
    DISTRICT_CHILLED_WATER_ELECTRIC_DRIVEN_CHILLER("District Chilled Water - Electric-Driven Chiller"),
    @XmlEnumValue("District Chilled Water - Engine-Driven Chiller using Natural Gas")
    DISTRICT_CHILLED_WATER_ENGINE_DRIVEN_CHILLER_USING_NATURAL_GAS("District Chilled Water - Engine-Driven Chiller using Natural Gas"),
    @XmlEnumValue("District Chilled Water - Other")
    DISTRICT_CHILLED_WATER_OTHER("District Chilled Water - Other"),
    @XmlEnumValue("District Hot Water")
    DISTRICT_HOT_WATER("District Hot Water"),
    @XmlEnumValue("District Steam")
    DISTRICT_STEAM("District Steam"),
    @XmlEnumValue("Electric")
    ELECTRIC("Electric"),
    @XmlEnumValue("Electric on Site Solar")
    ELECTRIC_ON_SITE_SOLAR("Electric on Site Solar"),
    @XmlEnumValue("Electric on Site Wind")
    ELECTRIC_ON_SITE_WIND("Electric on Site Wind"),
    @XmlEnumValue("Fuel Oil No 1")
    FUEL_OIL_NO_1("Fuel Oil No 1"),
    @XmlEnumValue("Fuel Oil No 2")
    FUEL_OIL_NO_2("Fuel Oil No 2"),
    @XmlEnumValue("Fuel Oil No 4")
    FUEL_OIL_NO_4("Fuel Oil No 4"),
    @XmlEnumValue("Fuel Oil No 5 or 6")
    FUEL_OIL_NO_5_OR_6("Fuel Oil No 5 or 6"),
    @XmlEnumValue("Kerosene")
    KEROSENE("Kerosene"),
    @XmlEnumValue("Natural Gas")
    NATURAL_GAS("Natural Gas"),
    @XmlEnumValue("Other (Energy)")
    OTHER_ENERGY("Other (Energy)"),
    @XmlEnumValue("Propane")
    PROPANE("Propane"),
    @XmlEnumValue("Wood")
    WOOD("Wood"),
    @XmlEnumValue("IT Equipment Input Energy (meters on each piece of equipment)")
    IT_EQUIPMENT_INPUT_ENERGY_METERS_ON_EACH_PIECE_OF_EQUIPMENT("IT Equipment Input Energy (meters on each piece of equipment)"),
    @XmlEnumValue("Power Distribution Unit (PDU) Input Energy")
    POWER_DISTRIBUTION_UNIT_PDU_INPUT_ENERGY("Power Distribution Unit (PDU) Input Energy"),
    @XmlEnumValue("Power Distribution Unit (PDU) Output Energy")
    POWER_DISTRIBUTION_UNIT_PDU_OUTPUT_ENERGY("Power Distribution Unit (PDU) Output Energy"),
    @XmlEnumValue("Uninterruptible Power Supply (UPS) Output Energy")
    UNINTERRUPTIBLE_POWER_SUPPLY_UPS_OUTPUT_ENERGY("Uninterruptible Power Supply (UPS) Output Energy"),
    @XmlEnumValue("Alternative Water Generated On-Site - Mixed Indoor/Outdoor")
    ALTERNATIVE_WATER_GENERATED_ON_SITE_MIXED_INDOOR_OUTDOOR("Alternative Water Generated On-Site - Mixed Indoor/Outdoor"),
    @XmlEnumValue("Alternative Water Generated On-Site - Indoor")
    ALTERNATIVE_WATER_GENERATED_ON_SITE_INDOOR("Alternative Water Generated On-Site - Indoor"),
    @XmlEnumValue("Alternative Water Generated On-Site - Outdoor")
    ALTERNATIVE_WATER_GENERATED_ON_SITE_OUTDOOR("Alternative Water Generated On-Site - Outdoor"),
    @XmlEnumValue("Municipally Supplied Potable Water - Mixed Indoor/Outdoor")
    MUNICIPALLY_SUPPLIED_POTABLE_WATER_MIXED_INDOOR_OUTDOOR("Municipally Supplied Potable Water - Mixed Indoor/Outdoor"),
    @XmlEnumValue("Municipally Supplied Potable Water - Indoor")
    MUNICIPALLY_SUPPLIED_POTABLE_WATER_INDOOR("Municipally Supplied Potable Water - Indoor"),
    @XmlEnumValue("Municipally Supplied Potable Water - Outdoor")
    MUNICIPALLY_SUPPLIED_POTABLE_WATER_OUTDOOR("Municipally Supplied Potable Water - Outdoor"),
    @XmlEnumValue("Municipally Supplied Reclaimed Water - Mixed Indoor/Outdoor")
    MUNICIPALLY_SUPPLIED_RECLAIMED_WATER_MIXED_INDOOR_OUTDOOR("Municipally Supplied Reclaimed Water - Mixed Indoor/Outdoor"),
    @XmlEnumValue("Municipally Supplied Reclaimed Water - Indoor")
    MUNICIPALLY_SUPPLIED_RECLAIMED_WATER_INDOOR("Municipally Supplied Reclaimed Water - Indoor"),
    @XmlEnumValue("Municipally Supplied Reclaimed Water - Outdoor")
    MUNICIPALLY_SUPPLIED_RECLAIMED_WATER_OUTDOOR("Municipally Supplied Reclaimed Water - Outdoor"),
    @XmlEnumValue("Other - Mixed Indoor/Outdoor (Water)")
    OTHER_MIXED_INDOOR_OUTDOOR_WATER("Other - Mixed Indoor/Outdoor (Water)"),
    @XmlEnumValue("Other - Outdoor")
    OTHER_OUTDOOR("Other - Outdoor"),
    @XmlEnumValue("Other - Indoor")
    OTHER_INDOOR("Other - Indoor"),
    @XmlEnumValue("Average Influent Flow")
    AVERAGE_INFLUENT_FLOW("Average Influent Flow");
    private final String value;

    TypeOfMeter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfMeter fromValue(String v) {
        for (TypeOfMeter c: TypeOfMeter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
