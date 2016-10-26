
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lengthUnitsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lengthUnitsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="Meters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lengthUnitsType")
@XmlEnum
public enum LengthUnitsType {

    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("Meters")
    METERS("Meters");
    private final String value;

    LengthUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnitsType fromValue(String v) {
        for (LengthUnitsType c: LengthUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
