
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlantDesignFlowRateUnitsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlantDesignFlowRateUnitsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Million Gallons per Day"/>
 *     &lt;enumeration value="Cubic Meters per Day"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlantDesignFlowRateUnitsType")
@XmlEnum
public enum PlantDesignFlowRateUnitsType {

    @XmlEnumValue("Million Gallons per Day")
    MILLION_GALLONS_PER_DAY("Million Gallons per Day"),
    @XmlEnumValue("Cubic Meters per Day")
    CUBIC_METERS_PER_DAY("Cubic Meters per Day");
    private final String value;

    PlantDesignFlowRateUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlantDesignFlowRateUnitsType fromValue(String v) {
        for (PlantDesignFlowRateUnitsType c: PlantDesignFlowRateUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
