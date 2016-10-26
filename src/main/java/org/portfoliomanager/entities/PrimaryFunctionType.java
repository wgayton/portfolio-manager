
package org.portfoliomanager.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primaryFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="primaryFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adult Education"/>
 *     &lt;enumeration value="Ambulatory Surgical Center"/>
 *     &lt;enumeration value="Aquarium"/>
 *     &lt;enumeration value="Automobile Dealership"/>
 *     &lt;enumeration value="Bank Branch"/>
 *     &lt;enumeration value="Bar/Nightclub"/>
 *     &lt;enumeration value="Barracks"/>
 *     &lt;enumeration value="Bowling Alley"/>
 *     &lt;enumeration value="Casino"/>
 *     &lt;enumeration value="College/University"/>
 *     &lt;enumeration value="Convenience Store with Gas Station"/>
 *     &lt;enumeration value="Convenience Store without Gas Station"/>
 *     &lt;enumeration value="Convention Center"/>
 *     &lt;enumeration value="Courthouse"/>
 *     &lt;enumeration value="Data Center"/>
 *     &lt;enumeration value="Distribution Center"/>
 *     &lt;enumeration value="Drinking Water Treatment &amp; Distribution"/>
 *     &lt;enumeration value="Enclosed Mall"/>
 *     &lt;enumeration value="Energy/Power Station"/>
 *     &lt;enumeration value="Fast Food Restaurant"/>
 *     &lt;enumeration value="Financial Office"/>
 *     &lt;enumeration value="Fire Station"/>
 *     &lt;enumeration value="Fitness Center/Health Club/Gym"/>
 *     &lt;enumeration value="Food Sales"/>
 *     &lt;enumeration value="Food Service"/>
 *     &lt;enumeration value="Hospital (General Medical &amp; Surgical)"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Ice/Curling Rink"/>
 *     &lt;enumeration value="Indoor Arena"/>
 *     &lt;enumeration value="K-12 School"/>
 *     &lt;enumeration value="Laboratory"/>
 *     &lt;enumeration value="Library"/>
 *     &lt;enumeration value="Lifestyle Center"/>
 *     &lt;enumeration value="Mailing Center/Post Office"/>
 *     &lt;enumeration value="Manufacturing/Industrial Plant"/>
 *     &lt;enumeration value="Medical Office"/>
 *     &lt;enumeration value="Mixed Use Property"/>
 *     &lt;enumeration value="Movie Theater"/>
 *     &lt;enumeration value="Multifamily Housing"/>
 *     &lt;enumeration value="Museum"/>
 *     &lt;enumeration value="Non-Refrigerated Warehouse"/>
 *     &lt;enumeration value="Office"/>
 *     &lt;enumeration value="Other - Education"/>
 *     &lt;enumeration value="Other - Entertainment/Public Assembly"/>
 *     &lt;enumeration value="Other - Lodging/Residential"/>
 *     &lt;enumeration value="Other - Mall"/>
 *     &lt;enumeration value="Other - Public Services"/>
 *     &lt;enumeration value="Other - Recreation"/>
 *     &lt;enumeration value="Other - Restaurant/Bar"/>
 *     &lt;enumeration value="Other - Services"/>
 *     &lt;enumeration value="Other - Stadium"/>
 *     &lt;enumeration value="Other - Technology/Science"/>
 *     &lt;enumeration value="Other - Utility"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Other/Specialty Hospital"/>
 *     &lt;enumeration value="Outpatient Rehabilitation/Physical Therapy"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="Performing Arts"/>
 *     &lt;enumeration value="Personal Services (Health/Beauty, Dry Cleaning, etc)"/>
 *     &lt;enumeration value="Police Station"/>
 *     &lt;enumeration value="Pre-school/Daycare"/>
 *     &lt;enumeration value="Prison/Incarceration"/>
 *     &lt;enumeration value="Race Track"/>
 *     &lt;enumeration value="Refrigerated Warehouse"/>
 *     &lt;enumeration value="Repair Services (Vehicle, Shoe, Locksmith, etc)"/>
 *     &lt;enumeration value="Residence Hall/Dormitory"/>
 *     &lt;enumeration value="Residential Care Facility"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="Retail Store"/>
 *     &lt;enumeration value="Roller Rink"/>
 *     &lt;enumeration value="Self-Storage Facility"/>
 *     &lt;enumeration value="Senior Care Community"/>
 *     &lt;enumeration value="Single Family Home"/>
 *     &lt;enumeration value="Social/Meeting Hall"/>
 *     &lt;enumeration value="Stadium (Closed)"/>
 *     &lt;enumeration value="Stadium (Open)"/>
 *     &lt;enumeration value="Strip Mall"/>
 *     &lt;enumeration value="Supermarket/Grocery Store"/>
 *     &lt;enumeration value="Swimming Pool"/>
 *     &lt;enumeration value="Transportation Terminal/Station"/>
 *     &lt;enumeration value="Urgent Care/Clinic/Other Outpatient"/>
 *     &lt;enumeration value="Veterinary Office"/>
 *     &lt;enumeration value="Vocational School"/>
 *     &lt;enumeration value="Wastewater Treatment Plant"/>
 *     &lt;enumeration value="Wholesale Club/Supercenter"/>
 *     &lt;enumeration value="Worship Facility"/>
 *     &lt;enumeration value="Zoo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "primaryFunctionType")
@XmlEnum
public enum PrimaryFunctionType {

    @XmlEnumValue("Adult Education")
    ADULT_EDUCATION("Adult Education"),
    @XmlEnumValue("Ambulatory Surgical Center")
    AMBULATORY_SURGICAL_CENTER("Ambulatory Surgical Center"),
    @XmlEnumValue("Aquarium")
    AQUARIUM("Aquarium"),
    @XmlEnumValue("Automobile Dealership")
    AUTOMOBILE_DEALERSHIP("Automobile Dealership"),
    @XmlEnumValue("Bank Branch")
    BANK_BRANCH("Bank Branch"),
    @XmlEnumValue("Bar/Nightclub")
    BAR_NIGHTCLUB("Bar/Nightclub"),
    @XmlEnumValue("Barracks")
    BARRACKS("Barracks"),
    @XmlEnumValue("Bowling Alley")
    BOWLING_ALLEY("Bowling Alley"),
    @XmlEnumValue("Casino")
    CASINO("Casino"),
    @XmlEnumValue("College/University")
    COLLEGE_UNIVERSITY("College/University"),
    @XmlEnumValue("Convenience Store with Gas Station")
    CONVENIENCE_STORE_WITH_GAS_STATION("Convenience Store with Gas Station"),
    @XmlEnumValue("Convenience Store without Gas Station")
    CONVENIENCE_STORE_WITHOUT_GAS_STATION("Convenience Store without Gas Station"),
    @XmlEnumValue("Convention Center")
    CONVENTION_CENTER("Convention Center"),
    @XmlEnumValue("Courthouse")
    COURTHOUSE("Courthouse"),
    @XmlEnumValue("Data Center")
    DATA_CENTER("Data Center"),
    @XmlEnumValue("Distribution Center")
    DISTRIBUTION_CENTER("Distribution Center"),
    @XmlEnumValue("Drinking Water Treatment & Distribution")
    DRINKING_WATER_TREATMENT_DISTRIBUTION("Drinking Water Treatment & Distribution"),
    @XmlEnumValue("Enclosed Mall")
    ENCLOSED_MALL("Enclosed Mall"),
    @XmlEnumValue("Energy/Power Station")
    ENERGY_POWER_STATION("Energy/Power Station"),
    @XmlEnumValue("Fast Food Restaurant")
    FAST_FOOD_RESTAURANT("Fast Food Restaurant"),
    @XmlEnumValue("Financial Office")
    FINANCIAL_OFFICE("Financial Office"),
    @XmlEnumValue("Fire Station")
    FIRE_STATION("Fire Station"),
    @XmlEnumValue("Fitness Center/Health Club/Gym")
    FITNESS_CENTER_HEALTH_CLUB_GYM("Fitness Center/Health Club/Gym"),
    @XmlEnumValue("Food Sales")
    FOOD_SALES("Food Sales"),
    @XmlEnumValue("Food Service")
    FOOD_SERVICE("Food Service"),
    @XmlEnumValue("Hospital (General Medical & Surgical)")
    HOSPITAL_GENERAL_MEDICAL_SURGICAL("Hospital (General Medical & Surgical)"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Ice/Curling Rink")
    ICE_CURLING_RINK("Ice/Curling Rink"),
    @XmlEnumValue("Indoor Arena")
    INDOOR_ARENA("Indoor Arena"),
    @XmlEnumValue("K-12 School")
    K_12_SCHOOL("K-12 School"),
    @XmlEnumValue("Laboratory")
    LABORATORY("Laboratory"),
    @XmlEnumValue("Library")
    LIBRARY("Library"),
    @XmlEnumValue("Lifestyle Center")
    LIFESTYLE_CENTER("Lifestyle Center"),
    @XmlEnumValue("Mailing Center/Post Office")
    MAILING_CENTER_POST_OFFICE("Mailing Center/Post Office"),
    @XmlEnumValue("Manufacturing/Industrial Plant")
    MANUFACTURING_INDUSTRIAL_PLANT("Manufacturing/Industrial Plant"),
    @XmlEnumValue("Medical Office")
    MEDICAL_OFFICE("Medical Office"),
    @XmlEnumValue("Mixed Use Property")
    MIXED_USE_PROPERTY("Mixed Use Property"),
    @XmlEnumValue("Movie Theater")
    MOVIE_THEATER("Movie Theater"),
    @XmlEnumValue("Multifamily Housing")
    MULTIFAMILY_HOUSING("Multifamily Housing"),
    @XmlEnumValue("Museum")
    MUSEUM("Museum"),
    @XmlEnumValue("Non-Refrigerated Warehouse")
    NON_REFRIGERATED_WAREHOUSE("Non-Refrigerated Warehouse"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Other - Education")
    OTHER_EDUCATION("Other - Education"),
    @XmlEnumValue("Other - Entertainment/Public Assembly")
    OTHER_ENTERTAINMENT_PUBLIC_ASSEMBLY("Other - Entertainment/Public Assembly"),
    @XmlEnumValue("Other - Lodging/Residential")
    OTHER_LODGING_RESIDENTIAL("Other - Lodging/Residential"),
    @XmlEnumValue("Other - Mall")
    OTHER_MALL("Other - Mall"),
    @XmlEnumValue("Other - Public Services")
    OTHER_PUBLIC_SERVICES("Other - Public Services"),
    @XmlEnumValue("Other - Recreation")
    OTHER_RECREATION("Other - Recreation"),
    @XmlEnumValue("Other - Restaurant/Bar")
    OTHER_RESTAURANT_BAR("Other - Restaurant/Bar"),
    @XmlEnumValue("Other - Services")
    OTHER_SERVICES("Other - Services"),
    @XmlEnumValue("Other - Stadium")
    OTHER_STADIUM("Other - Stadium"),
    @XmlEnumValue("Other - Technology/Science")
    OTHER_TECHNOLOGY_SCIENCE("Other - Technology/Science"),
    @XmlEnumValue("Other - Utility")
    OTHER_UTILITY("Other - Utility"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Other/Specialty Hospital")
    OTHER_SPECIALTY_HOSPITAL("Other/Specialty Hospital"),
    @XmlEnumValue("Outpatient Rehabilitation/Physical Therapy")
    OUTPATIENT_REHABILITATION_PHYSICAL_THERAPY("Outpatient Rehabilitation/Physical Therapy"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("Performing Arts")
    PERFORMING_ARTS("Performing Arts"),
    @XmlEnumValue("Personal Services (Health/Beauty, Dry Cleaning, etc)")
    PERSONAL_SERVICES_HEALTH_BEAUTY_DRY_CLEANING_ETC("Personal Services (Health/Beauty, Dry Cleaning, etc)"),
    @XmlEnumValue("Police Station")
    POLICE_STATION("Police Station"),
    @XmlEnumValue("Pre-school/Daycare")
    PRE_SCHOOL_DAYCARE("Pre-school/Daycare"),
    @XmlEnumValue("Prison/Incarceration")
    PRISON_INCARCERATION("Prison/Incarceration"),
    @XmlEnumValue("Race Track")
    RACE_TRACK("Race Track"),
    @XmlEnumValue("Refrigerated Warehouse")
    REFRIGERATED_WAREHOUSE("Refrigerated Warehouse"),
    @XmlEnumValue("Repair Services (Vehicle, Shoe, Locksmith, etc)")
    REPAIR_SERVICES_VEHICLE_SHOE_LOCKSMITH_ETC("Repair Services (Vehicle, Shoe, Locksmith, etc)"),
    @XmlEnumValue("Residence Hall/Dormitory")
    RESIDENCE_HALL_DORMITORY("Residence Hall/Dormitory"),
    @XmlEnumValue("Residential Care Facility")
    RESIDENTIAL_CARE_FACILITY("Residential Care Facility"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Retail Store")
    RETAIL_STORE("Retail Store"),
    @XmlEnumValue("Roller Rink")
    ROLLER_RINK("Roller Rink"),
    @XmlEnumValue("Self-Storage Facility")
    SELF_STORAGE_FACILITY("Self-Storage Facility"),
    @XmlEnumValue("Senior Care Community")
    SENIOR_CARE_COMMUNITY("Senior Care Community"),
    @XmlEnumValue("Single Family Home")
    SINGLE_FAMILY_HOME("Single Family Home"),
    @XmlEnumValue("Social/Meeting Hall")
    SOCIAL_MEETING_HALL("Social/Meeting Hall"),
    @XmlEnumValue("Stadium (Closed)")
    STADIUM_CLOSED("Stadium (Closed)"),
    @XmlEnumValue("Stadium (Open)")
    STADIUM_OPEN("Stadium (Open)"),
    @XmlEnumValue("Strip Mall")
    STRIP_MALL("Strip Mall"),
    @XmlEnumValue("Supermarket/Grocery Store")
    SUPERMARKET_GROCERY_STORE("Supermarket/Grocery Store"),
    @XmlEnumValue("Swimming Pool")
    SWIMMING_POOL("Swimming Pool"),
    @XmlEnumValue("Transportation Terminal/Station")
    TRANSPORTATION_TERMINAL_STATION("Transportation Terminal/Station"),
    @XmlEnumValue("Urgent Care/Clinic/Other Outpatient")
    URGENT_CARE_CLINIC_OTHER_OUTPATIENT("Urgent Care/Clinic/Other Outpatient"),
    @XmlEnumValue("Veterinary Office")
    VETERINARY_OFFICE("Veterinary Office"),
    @XmlEnumValue("Vocational School")
    VOCATIONAL_SCHOOL("Vocational School"),
    @XmlEnumValue("Wastewater Treatment Plant")
    WASTEWATER_TREATMENT_PLANT("Wastewater Treatment Plant"),
    @XmlEnumValue("Wholesale Club/Supercenter")
    WHOLESALE_CLUB_SUPERCENTER("Wholesale Club/Supercenter"),
    @XmlEnumValue("Worship Facility")
    WORSHIP_FACILITY("Worship Facility"),
    @XmlEnumValue("Zoo")
    ZOO("Zoo");
    private final String value;

    PrimaryFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrimaryFunctionType fromValue(String v) {
        for (PrimaryFunctionType c: PrimaryFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
