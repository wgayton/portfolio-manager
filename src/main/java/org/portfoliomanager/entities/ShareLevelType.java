
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shareLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="shareLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Read Write"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "shareLevelType")
@XmlEnum
public enum ShareLevelType {

    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Read Write")
    READ_WRITE("Read Write");
    private final String value;

    ShareLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareLevelType fromValue(String v) {
        for (ShareLevelType c: ShareLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
