
package org.portfoliomanager.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}useDetailsRevision" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="links" type="{}linksType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "useDetailsRevision",
    "links"
})
@XmlRootElement(name = "useDetails")
public class UseDetails {

    @XmlElementRefs({
        @XmlElementRef(name = "studentSeatingCapacity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfStaffedBeds", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "poolLocation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enrollment", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialLiftSystems", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfFTEWorkers", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasComputerLab", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fullServiceSpaFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasLaboratory", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfHotelRooms", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "monthsInUse", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfCommercialRefrigerationUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "singleStore", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gymCenterFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "percentOfGrossFloorAreaThatIsCommonSpaceOnly", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weeklyOperatingHours", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "itEnergyMeterConfiguration", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfPeople", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "seatingCapacity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licensedBedCapacity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfLaundryHookupsInCommonArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "percentCooled", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isTertiaryCare", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "openOnWeekends", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "surgeryCenterFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "coolingEquipmentRedundancy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "averageInfluentBiologicalOxygenDemand", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "governmentSubsidizedHousing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfSpecialOtherEventsPerYear", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hoursPerDayGuestsOnsite", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfMriMachines", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfGuestMealsServedPerYear", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ownedBy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "enclosedFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfCashRegisters", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfWorkers", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfBedrooms", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalGrossFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grantDollars", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "plantDesignFlowRate", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfConcertShowEventsPerYear", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "onSiteLaundryFacility", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "openFootage", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fixedFilmTrickleFiltrationProcess", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "completelyEnclosedFootage", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maximumNumberOfFloors", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfRooms", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasDiningHall", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "iceEvents", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfSurgicalOperatingBeds", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "upsSystemRedundancy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfComputers", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "schoolDistrict", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "residentPopulation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "amountOfLaundryProcessedAnnually", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfOpenClosedRefrigerationUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "poolSize", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "percentOfficeCooled", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "percentOfficeHeated", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfLaundryHookupsInAllUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialLivingUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialLivingUnitsMidRiseSetting", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gymnasiumFloorArea", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exteriorEntranceToThePublic", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isHighSchool", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "averageEffluentBiologicalOxygenDemand", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialLivingUnitsHighRiseSetting", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "supplementalHeating", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "averageNumberOfResidents", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialWashingMachines", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfWeekdaysOpen", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sizeOfElectronicScoreBoards", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfResidentialLivingUnitsLowRiseSetting", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maximumResidentCapacity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cookingFacilities", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "areaOfAllWalkInRefrigerationUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfCommercialWashingMachines", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfSportingEventsPerYear", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nutrientRemoval", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "partiallyEnclosedFootage", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "laundryFacility", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "percentHeated", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lengthOfAllOpenClosedRefrigerationUnits", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberOfWalkInRefrigerationUnits", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends UseAttributeBase>> useDetailsRevision;
    protected LinksType links;

    /**
     * Gets the value of the useDetailsRevision property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useDetailsRevision property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseDetailsRevision().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link PoolType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link MonthsInUseType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItEnergyConfigurationType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link PercentCooledType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoolingEquipmentRedundancyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link HoursPerDayGuestsOnsiteType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link OwnedByType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrossFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link PlantDesignFlowRateType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrossFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrossFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UpsSystemRedundancyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResidentPopulationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AmountOfLaundryProcessedAnnuallyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link PoolSizeType }{@code >}
     * {@link JAXBElement }{@code <}{@link PercentOfficeCooledType }{@code >}
     * {@link JAXBElement }{@code <}{@link PercentOfficeHeatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberOfWeekdaysType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionalFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseYesNoType }{@code >}
     * {@link JAXBElement }{@code <}{@link GrossFloorAreaType }{@code >}
     * {@link JAXBElement }{@code <}{@link OnsiteLaundryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PercentHeatedType }{@code >}
     * {@link JAXBElement }{@code <}{@link LengthOfAllOpenClosedRefrigerationUnitsType }{@code >}
     * {@link JAXBElement }{@code <}{@link UseDecimalType }{@code >}
     *
     *
     */
    public List<JAXBElement<? extends UseAttributeBase>> getUseDetailsRevision() {
        if (useDetailsRevision == null) {
            useDetailsRevision = new ArrayList<JAXBElement<? extends UseAttributeBase>>();
        }
        return this.useDetailsRevision;
    }

    /**
     * Gets the value of the links property.
     *
     * @return
     *     possible object is
     *     {@link LinksType }
     *
     */
    public LinksType getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     *
     * @param value
     *     allowed object is
     *     {@link LinksType }
     *     
     */
    public void setLinks(LinksType value) {
        this.links = value;
    }

}
