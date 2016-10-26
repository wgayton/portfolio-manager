
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grossFloorAreaUnitsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="grossFloorAreaUnitsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Square Feet"/>
 *     &lt;enumeration value="Square Meters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "grossFloorAreaUnitsType")
@XmlEnum
public enum GrossFloorAreaUnitsType {

    @XmlEnumValue("Square Feet")
    SQUARE_FEET("Square Feet"),
    @XmlEnumValue("Square Meters")
    SQUARE_METERS("Square Meters");
    private final String value;

    GrossFloorAreaUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrossFloorAreaUnitsType fromValue(String v) {
        for (GrossFloorAreaUnitsType c: GrossFloorAreaUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
