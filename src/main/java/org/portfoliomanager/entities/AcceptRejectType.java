
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptRejectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="acceptRejectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "acceptRejectType")
@XmlEnum
public enum AcceptRejectType {

    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Reject")
    REJECT("Reject");
    private final String value;

    AcceptRejectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcceptRejectType fromValue(String v) {
        for (AcceptRejectType c: AcceptRejectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
