
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constructionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constructionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Existing"/>
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constructionStatusType")
@XmlEnum
public enum ConstructionStatusType {

    @XmlEnumValue("Existing")
    EXISTING("Existing"),
    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Test")
    TEST("Test");
    private final String value;

    ConstructionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionStatusType fromValue(String v) {
        for (ConstructionStatusType c: ConstructionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
