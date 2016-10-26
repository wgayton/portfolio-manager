
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for designUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="designUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ccf (hundred cubic feet)"/>
 *     &lt;enumeration value="cf (cubic feet)"/>
 *     &lt;enumeration value="cm (Cubic meters)"/>
 *     &lt;enumeration value="Cords"/>
 *     &lt;enumeration value="Gallons (UK)"/>
 *     &lt;enumeration value="Gallons (US)"/>
 *     &lt;enumeration value="GJ"/>
 *     &lt;enumeration value="kBtu (thousand Btu)"/>
 *     &lt;enumeration value="kcf (thousand cubic feet)"/>
 *     &lt;enumeration value="Kcm (Thousand Cubic meters)"/>
 *     &lt;enumeration value="KGal (thousand gallons) (UK)"/>
 *     &lt;enumeration value="KGal (thousand gallons) (US)"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="KLbs. (thousand pounds)"/>
 *     &lt;enumeration value="kWh (thousand Watt-hours)"/>
 *     &lt;enumeration value="Liters"/>
 *     &lt;enumeration value="MBtu (million Btu)"/>
 *     &lt;enumeration value="MCF(million cubic feet)"/>
 *     &lt;enumeration value="mg/l (milligrams per liter)"/>
 *     &lt;enumeration value="MGal (million gallons) (UK)"/>
 *     &lt;enumeration value="MGal (million gallons) (US)"/>
 *     &lt;enumeration value="Million Gallons per Day"/>
 *     &lt;enumeration value="MLbs. (million pounds)"/>
 *     &lt;enumeration value="MWh (million Watt-hours)"/>
 *     &lt;enumeration value="pounds"/>
 *     &lt;enumeration value="Pounds per year"/>
 *     &lt;enumeration value="therms"/>
 *     &lt;enumeration value="ton hours"/>
 *     &lt;enumeration value="Tonnes (metric)"/>
 *     &lt;enumeration value="tons"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "designUnitOfMeasure")
@XmlEnum
public enum DesignUnitOfMeasure {

    @XmlEnumValue("ccf (hundred cubic feet)")
    CCF_HUNDRED_CUBIC_FEET("ccf (hundred cubic feet)"),
    @XmlEnumValue("cf (cubic feet)")
    CF_CUBIC_FEET("cf (cubic feet)"),
    @XmlEnumValue("cm (Cubic meters)")
    CM_CUBIC_METERS("cm (Cubic meters)"),
    @XmlEnumValue("Cords")
    CORDS("Cords"),
    @XmlEnumValue("Gallons (UK)")
    GALLONS_UK("Gallons (UK)"),
    @XmlEnumValue("Gallons (US)")
    GALLONS_US("Gallons (US)"),
    GJ("GJ"),
    @XmlEnumValue("kBtu (thousand Btu)")
    K_BTU_THOUSAND_BTU("kBtu (thousand Btu)"),
    @XmlEnumValue("kcf (thousand cubic feet)")
    KCF_THOUSAND_CUBIC_FEET("kcf (thousand cubic feet)"),
    @XmlEnumValue("Kcm (Thousand Cubic meters)")
    KCM_THOUSAND_CUBIC_METERS("Kcm (Thousand Cubic meters)"),
    @XmlEnumValue("KGal (thousand gallons) (UK)")
    K_GAL_THOUSAND_GALLONS_UK("KGal (thousand gallons) (UK)"),
    @XmlEnumValue("KGal (thousand gallons) (US)")
    K_GAL_THOUSAND_GALLONS_US("KGal (thousand gallons) (US)"),
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("KLbs. (thousand pounds)")
    K_LBS_THOUSAND_POUNDS("KLbs. (thousand pounds)"),
    @XmlEnumValue("kWh (thousand Watt-hours)")
    K_WH_THOUSAND_WATT_HOURS("kWh (thousand Watt-hours)"),
    @XmlEnumValue("Liters")
    LITERS("Liters"),
    @XmlEnumValue("MBtu (million Btu)")
    M_BTU_MILLION_BTU("MBtu (million Btu)"),
    @XmlEnumValue("MCF(million cubic feet)")
    MCF_MILLION_CUBIC_FEET("MCF(million cubic feet)"),
    @XmlEnumValue("mg/l (milligrams per liter)")
    MG_L_MILLIGRAMS_PER_LITER("mg/l (milligrams per liter)"),
    @XmlEnumValue("MGal (million gallons) (UK)")
    M_GAL_MILLION_GALLONS_UK("MGal (million gallons) (UK)"),
    @XmlEnumValue("MGal (million gallons) (US)")
    M_GAL_MILLION_GALLONS_US("MGal (million gallons) (US)"),
    @XmlEnumValue("Million Gallons per Day")
    MILLION_GALLONS_PER_DAY("Million Gallons per Day"),
    @XmlEnumValue("MLbs. (million pounds)")
    M_LBS_MILLION_POUNDS("MLbs. (million pounds)"),
    @XmlEnumValue("MWh (million Watt-hours)")
    M_WH_MILLION_WATT_HOURS("MWh (million Watt-hours)"),
    @XmlEnumValue("pounds")
    POUNDS("pounds"),
    @XmlEnumValue("Pounds per year")
    POUNDS_PER_YEAR("Pounds per year"),
    @XmlEnumValue("therms")
    THERMS("therms"),
    @XmlEnumValue("ton hours")
    TON_HOURS("ton hours"),
    @XmlEnumValue("Tonnes (metric)")
    TONNES_METRIC("Tonnes (metric)"),
    @XmlEnumValue("tons")
    TONS("tons");
    private final String value;

    DesignUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DesignUnitOfMeasure fromValue(String v) {
        for (DesignUnitOfMeasure c: DesignUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
