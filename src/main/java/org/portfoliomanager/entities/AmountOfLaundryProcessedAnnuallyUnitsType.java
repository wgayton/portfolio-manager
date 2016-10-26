
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for amountOfLaundryProcessedAnnuallyUnitsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="amountOfLaundryProcessedAnnuallyUnitsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="short tons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "amountOfLaundryProcessedAnnuallyUnitsType")
@XmlEnum
public enum AmountOfLaundryProcessedAnnuallyUnitsType {

    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("short tons")
    SHORT_TONS("short tons");
    private final String value;

    AmountOfLaundryProcessedAnnuallyUnitsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountOfLaundryProcessedAnnuallyUnitsType fromValue(String v) {
        for (AmountOfLaundryProcessedAnnuallyUnitsType c: AmountOfLaundryProcessedAnnuallyUnitsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
