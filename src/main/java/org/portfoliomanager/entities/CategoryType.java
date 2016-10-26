
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for categoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="categoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Recommissioning (Stage 1)"/>
 *     &lt;enumeration value="Lighting (Stage 2)"/>
 *     &lt;enumeration value="Load Reductions (Stage 3)"/>
 *     &lt;enumeration value="Fan Systems (Stage 4)"/>
 *     &lt;enumeration value="Heating &amp; Cooling Plant (Stage 5)"/>
 *     &lt;enumeration value="Behavioral/Outreach"/>
 *     &lt;enumeration value="Other Technologies/Strategies"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "categoryType")
@XmlEnum
public enum CategoryType {

    @XmlEnumValue("Recommissioning (Stage 1)")
    RECOMMISSIONING_STAGE_1("Recommissioning (Stage 1)"),
    @XmlEnumValue("Lighting (Stage 2)")
    LIGHTING_STAGE_2("Lighting (Stage 2)"),
    @XmlEnumValue("Load Reductions (Stage 3)")
    LOAD_REDUCTIONS_STAGE_3("Load Reductions (Stage 3)"),
    @XmlEnumValue("Fan Systems (Stage 4)")
    FAN_SYSTEMS_STAGE_4("Fan Systems (Stage 4)"),
    @XmlEnumValue("Heating & Cooling Plant (Stage 5)")
    HEATING_COOLING_PLANT_STAGE_5("Heating & Cooling Plant (Stage 5)"),
    @XmlEnumValue("Behavioral/Outreach")
    BEHAVIORAL_OUTREACH("Behavioral/Outreach"),
    @XmlEnumValue("Other Technologies/Strategies")
    OTHER_TECHNOLOGIES_STRATEGIES("Other Technologies/Strategies");
    private final String value;

    CategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryType fromValue(String v) {
        for (CategoryType c: CategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
