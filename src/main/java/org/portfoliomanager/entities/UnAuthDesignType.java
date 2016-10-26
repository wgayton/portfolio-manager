
package org.portfoliomanager.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for unAuthDesignType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unAuthDesignType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="propertyInfo" type="{}propertyDesignType"/>
 *         &lt;element name="propertyUses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}uses" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drinkingWaterInfluentFlow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="wasteWaterInfluentFlow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itSiteEnergy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estimatedEnergyList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entries" type="{}estimatedEnergyListType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="target">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="targetTypeScore" type="{}targetTypeScoreType"/>
 *                   &lt;element name="targetTypePercentage" type="{}targetTypePercentageType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unAuthDesignType", propOrder = {

})
public class UnAuthDesignType {

    @XmlElement(required = true)
    protected PropertyDesignType propertyInfo;
    @XmlElement(required = true)
    protected UnAuthDesignType.PropertyUses propertyUses;
    protected BigDecimal drinkingWaterInfluentFlow;
    protected BigDecimal wasteWaterInfluentFlow;
    protected BigDecimal itSiteEnergy;
    protected UnAuthDesignType.EstimatedEnergyList estimatedEnergyList;
    @XmlElement(required = true)
    protected UnAuthDesignType.Target target;

    /**
     * Gets the value of the propertyInfo property.
     *
     * @return
     *     possible object is
     *     {@link PropertyDesignType }
     *
     */
    public PropertyDesignType getPropertyInfo() {
        return propertyInfo;
    }

    /**
     * Sets the value of the propertyInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link PropertyDesignType }
     *
     */
    public void setPropertyInfo(PropertyDesignType value) {
        this.propertyInfo = value;
    }

    /**
     * Gets the value of the propertyUses property.
     *
     * @return
     *     possible object is
     *     {@link UnAuthDesignType.PropertyUses }
     *
     */
    public UnAuthDesignType.PropertyUses getPropertyUses() {
        return propertyUses;
    }

    /**
     * Sets the value of the propertyUses property.
     *
     * @param value
     *     allowed object is
     *     {@link UnAuthDesignType.PropertyUses }
     *
     */
    public void setPropertyUses(UnAuthDesignType.PropertyUses value) {
        this.propertyUses = value;
    }

    /**
     * Gets the value of the drinkingWaterInfluentFlow property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDrinkingWaterInfluentFlow() {
        return drinkingWaterInfluentFlow;
    }

    /**
     * Sets the value of the drinkingWaterInfluentFlow property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDrinkingWaterInfluentFlow(BigDecimal value) {
        this.drinkingWaterInfluentFlow = value;
    }

    /**
     * Gets the value of the wasteWaterInfluentFlow property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getWasteWaterInfluentFlow() {
        return wasteWaterInfluentFlow;
    }

    /**
     * Sets the value of the wasteWaterInfluentFlow property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setWasteWaterInfluentFlow(BigDecimal value) {
        this.wasteWaterInfluentFlow = value;
    }

    /**
     * Gets the value of the itSiteEnergy property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getItSiteEnergy() {
        return itSiteEnergy;
    }

    /**
     * Sets the value of the itSiteEnergy property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setItSiteEnergy(BigDecimal value) {
        this.itSiteEnergy = value;
    }

    /**
     * Gets the value of the estimatedEnergyList property.
     *
     * @return
     *     possible object is
     *     {@link UnAuthDesignType.EstimatedEnergyList }
     *
     */
    public UnAuthDesignType.EstimatedEnergyList getEstimatedEnergyList() {
        return estimatedEnergyList;
    }

    /**
     * Sets the value of the estimatedEnergyList property.
     *
     * @param value
     *     allowed object is
     *     {@link UnAuthDesignType.EstimatedEnergyList }
     *
     */
    public void setEstimatedEnergyList(UnAuthDesignType.EstimatedEnergyList value) {
        this.estimatedEnergyList = value;
    }

    /**
     * Gets the value of the target property.
     *
     * @return
     *     possible object is
     *     {@link UnAuthDesignType.Target }
     *
     */
    public UnAuthDesignType.Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     *
     * @param value
     *     allowed object is
     *     {@link UnAuthDesignType.Target }
     *
     */
    public void setTarget(UnAuthDesignType.Target value) {
        this.target = value;
    }


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
     *         &lt;element name="entries" type="{}estimatedEnergyListType"/>
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
        "entries"
    })
    public static class EstimatedEnergyList {

        @XmlElement(required = true)
        protected EstimatedEnergyListType entries;

        /**
         * Gets the value of the entries property.
         *
         * @return
         *     possible object is
         *     {@link EstimatedEnergyListType }
         *
         */
        public EstimatedEnergyListType getEntries() {
            return entries;
        }

        /**
         * Sets the value of the entries property.
         *
         * @param value
         *     allowed object is
         *     {@link EstimatedEnergyListType }
         *
         */
        public void setEntries(EstimatedEnergyListType value) {
            this.entries = value;
        }

    }


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
     *         &lt;group ref="{}uses" maxOccurs="unbounded"/>
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
        "uses"
    })
    public static class PropertyUses {

        @XmlElementRefs({
            @XmlElementRef(name = "conventionCenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "fireStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "policeStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "residenceHallDormitory", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "hospital", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "barracks", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "distributionCenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "aquarium", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "hotel", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "energyPowerStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "multifamilyHousing", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dataCenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "manufacturingIndustrialPlant", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "convenienceStoreWithoutGasStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "performingArts", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "medicalOffice", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "preschoolDaycare", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "laboratory", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "retail", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherRecreation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "fastFoodRestaurant", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "drinkingWaterTreatmentAndDistribution", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "indoorArena", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherSpecialityHospital", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "stripMall", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherLodgingResidential", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherRestaurantBar", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "nonRefrigeratedWarehouse", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "restaurant", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "k12School", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherStadium", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "automobileDealership", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "worshipFacility", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "convenienceStoreWithGasStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "collegeUniversity", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "personalServices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "zoo", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "wastewaterTreatmentPlant", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherEducation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "prison", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "barNightclub", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "enclosedMall", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "movieTheater", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "stadiumClosed", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "bowlingAlley", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "mailingCenterPostOffice", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherServices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "foodSales", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "museum", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "repairServices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "fitnessCenterHealthClubGym", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherEntertainmentPublicAssembly", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "singleFamilyHome", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherTechnologyScience", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "transportationTerminalStation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "urgentCareClinicOtherOutpatient", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "foodService", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "socialMeetingHall", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "other", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherPublicServices", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "supermarket", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "swimmingPool", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "courthouse", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "office", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "stadiumOpen", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "refrigeratedWarehouse", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "raceTrack", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "lifestyleCenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "wholesaleClubSupercenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "residentialCareFacility", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "casino", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherUtility", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "adultEducation", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "outpatientRehabilitationPhysicalTherapy", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "seniorCareCommunity", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "financialOffice", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "library", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ambulatorySurgicalCenter", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "rollerRink", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "bankBranch", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "selfStorageFacility", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "veterinaryOffice", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherMall", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "vocationalSchool", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "parking", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "iceCurlingRink", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> uses;

        /**
         * Gets the value of the uses property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uses property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUses().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link ResidenceHallDormitoryType }{@code >}
         * {@link JAXBElement }{@code <}{@link HospitalType }{@code >}
         * {@link JAXBElement }{@code <}{@link BarracksType }{@code >}
         * {@link JAXBElement }{@code <}{@link DistributionCenterType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link HotelType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link MultifamilyHousingType }{@code >}
         * {@link JAXBElement }{@code <}{@link DataCenterType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link ConvenienceStoreWithoutGasStationType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link MedicalOfficeType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link RetailType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link DrinkingWaterTreatmentAndDistributionType }{@code >}
         * {@link JAXBElement }{@code <}{@link IndoorArenaType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link NonRefrigeratedWarehouseType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link K12SchoolType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherStadiumType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link WorshipFacilityType }{@code >}
         * {@link JAXBElement }{@code <}{@link ConvenienceStoreWithGasStationType }{@code >}
         * {@link JAXBElement }{@code <}{@link CollegeUniversityType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link WastewaterTreatmentPlantType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link StadiumClosedType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link FoodSalesType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link SingleFamilyHomeType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link SupermarketType }{@code >}
         * {@link JAXBElement }{@code <}{@link SwimmingPoolType }{@code >}
         * {@link JAXBElement }{@code <}{@link CourthouseType }{@code >}
         * {@link JAXBElement }{@code <}{@link OfficeType }{@code >}
         * {@link JAXBElement }{@code <}{@link StadiumOpenType }{@code >}
         * {@link JAXBElement }{@code <}{@link RefrigeratedWarehouseType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link WholesaleClubSupercenterType }{@code >}
         * {@link JAXBElement }{@code <}{@link ResidentialCareFacilityType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link SeniorCareCommunityType }{@code >}
         * {@link JAXBElement }{@code <}{@link FinancialOfficeType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link BankBranchType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * {@link JAXBElement }{@code <}{@link ParkingType }{@code >}
         * {@link JAXBElement }{@code <}{@link OtherType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getUses() {
            if (uses == null) {
                uses = new ArrayList<JAXBElement<?>>();
            }
            return this.uses;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="targetTypeScore" type="{}targetTypeScoreType"/>
     *         &lt;element name="targetTypePercentage" type="{}targetTypePercentageType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "targetTypeScore",
        "targetTypePercentage"
    })
    public static class Target {

        protected TargetTypeScoreType targetTypeScore;
        protected TargetTypePercentageType targetTypePercentage;

        /**
         * Gets the value of the targetTypeScore property.
         * 
         * @return
         *     possible object is
         *     {@link TargetTypeScoreType }
         *     
         */
        public TargetTypeScoreType getTargetTypeScore() {
            return targetTypeScore;
        }

        /**
         * Sets the value of the targetTypeScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link TargetTypeScoreType }
         *     
         */
        public void setTargetTypeScore(TargetTypeScoreType value) {
            this.targetTypeScore = value;
        }

        /**
         * Gets the value of the targetTypePercentage property.
         * 
         * @return
         *     possible object is
         *     {@link TargetTypePercentageType }
         *     
         */
        public TargetTypePercentageType getTargetTypePercentage() {
            return targetTypePercentage;
        }

        /**
         * Sets the value of the targetTypePercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link TargetTypePercentageType }
         *     
         */
        public void setTargetTypePercentage(TargetTypePercentageType value) {
            this.targetTypePercentage = value;
        }

    }

}
