package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Account {
    private Attribute attributes;
    private String id;
    private boolean isDeleted;
    private String masterRecordId;
    private String name;
    private String type;
    private String parentId;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingPostalCode;
    private String billingCountry;
    private String billingLatitude;
    private String billingLongitude;
    private String billingGeocodeAccuracy;
    private String billingAddress;
    private String shippingStreet;
    private String shippingCity;
    private String shippingState;
    private String shippingPostalCode;
    private String shippingCountry;
    private String shippingLatitude;
    private String shippingLongitude;
    private String shippingGeocodeAccuracy;
    private String shippingAddress;
    private String phone;
    private String fax;
    private String accountNumber;
    private String website;
    private String photoUrl;
    private String sic;
    private String industry;
    private String annualRevenue;
    private String numberOfEmployees;
    private String ownership;
    private String tickerSymbol;
    private String description;
    private String rating;
    private String site;
    private String ownerId;
    private String createdDate;
    private String createdById;
    private String lastModifiedDate;
    private String lastModifiedById;
    private String systemModstamp;
    private String lastActivityDate;
    private String lastViewedDate;
    private String lastReferencedDate;
    private String jigsaw;
    private String jigsawCompanyId;
    private String cleanStatus;
    private String accountSource;
    private String dunsNumber;
    private String tradeStyle;
    private String naicsCode;
    private String naicsDesc;
    private String yearStarted;
    private String sicDesc;
    private String dandbCompanyId;
    private String operatingHoursId;
    private String customerPriorityC;
    private String slaC;
    private String activeC;
    private String numberOfLocationsC;
    private String upsellOpportunityC;
    private String slaSerialNumberC;
    private String slaExpirationDateC;

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("IsDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("IsDeleted")
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("MasterRecordId")
    public String getMasterRecordId() {
        return masterRecordId;
    }

    @JsonProperty("MasterRecordId")
    public void setMasterRecordId(String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("ParentId")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("BillingStreet")
    public String getBillingStreet() {
        return billingStreet;
    }

    @JsonProperty("BillingStreet")
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    @JsonProperty("BillingCity")
    public String getBillingCity() {
        return billingCity;
    }

    @JsonProperty("BillingCity")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @JsonProperty("BillingState")
    public String getBillingState() {
        return billingState;
    }

    @JsonProperty("BillingState")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @JsonProperty("BillingPostalCode")
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    @JsonProperty("BillingPostalCode")
    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    @JsonProperty("BillingCountry")
    public String getBillingCountry() {
        return billingCountry;
    }

    @JsonProperty("BillingCountry")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @JsonProperty("BillingLatitude")
    public String getBillingLatitude() {
        return billingLatitude;
    }

    @JsonProperty("BillingLatitude")
    public void setBillingLatitude(String billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    @JsonProperty("BillingLongitude")
    public String getBillingLongitude() {
        return billingLongitude;
    }

    @JsonProperty("BillingLongitude")
    public void setBillingLongitude(String billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    @JsonProperty("BillingGeocodeAccuracy")
    public String getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    @JsonProperty("BillingGeocodeAccuracy")
    public void setBillingGeocodeAccuracy(String billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    @JsonProperty("BillingAddress")
    public String getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("BillingAddress")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("ShippingStreet")
    public String getShippingStreet() {
        return shippingStreet;
    }

    @JsonProperty("ShippingStreet")
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    @JsonProperty("ShippingCity")
    public String getShippingCity() {
        return shippingCity;
    }

    @JsonProperty("ShippingCity")
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    @JsonProperty("ShippingState")
    public String getShippingState() {
        return shippingState;
    }

    @JsonProperty("ShippingState")
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    @JsonProperty("ShippingPostalCode")
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    @JsonProperty("ShippingPostalCode")
    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    @JsonProperty("ShippingCountry")
    public String getShippingCountry() {
        return shippingCountry;
    }

    @JsonProperty("ShippingCountry")
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    @JsonProperty("ShippingLatitude")
    public String getShippingLatitude() {
        return shippingLatitude;
    }

    @JsonProperty("ShippingLatitude")
    public void setShippingLatitude(String shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    @JsonProperty("ShippingLongitude")
    public String getShippingLongitude() {
        return shippingLongitude;
    }

    @JsonProperty("ShippingLongitude")
    public void setShippingLongitude(String shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    @JsonProperty("ShippingGeocodeAccuracy")
    public String getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    @JsonProperty("ShippingGeocodeAccuracy")
    public void setShippingGeocodeAccuracy(String shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    @JsonProperty("ShippingAddress")
    public String getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("ShippingAddress")
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("Fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("Fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("AccountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("Website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("Website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("PhotoUrl")
    public String getPhotoUrl() {
        return photoUrl;
    }

    @JsonProperty("PhotoUrl")
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @JsonProperty("Sic")
    public String getSic() {
        return sic;
    }

    @JsonProperty("Sic")
    public void setSic(String sic) {
        this.sic = sic;
    }

    @JsonProperty("Industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("Industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @JsonProperty("AnnualRevenue")
    public String getAnnualRevenue() {
        return annualRevenue;
    }

    @JsonProperty("AnnualRevenue")
    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @JsonProperty("NumberOfEmployees")
    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @JsonProperty("NumberOfEmployees")
    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @JsonProperty("Ownership")
    public String getOwnership() {
        return ownership;
    }

    @JsonProperty("Ownership")
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @JsonProperty("TickerSymbol")
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    @JsonProperty("TickerSymbol")
    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("Rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("Rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("Site")
    public String getSite() {
        return site;
    }

    @JsonProperty("Site")
    public void setSite(String site) {
        this.site = site;
    }

    @JsonProperty("OwnerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("CreatedDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("CreatedById")
    public String getCreatedById() {
        return createdById;
    }

    @JsonProperty("CreatedById")
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    @JsonProperty("LastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("LastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("LastModifiedById")
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    @JsonProperty("LastModifiedById")
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    @JsonProperty("SystemModstamp")
    public String getSystemModstamp() {
        return systemModstamp;
    }

    @JsonProperty("SystemModstamp")
    public void setSystemModstamp(String systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    @JsonProperty("LastActivityDate")
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    @JsonProperty("LastActivityDate")
    public void setLastActivityDate(String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    @JsonProperty("LastViewedDate")
    public String getLastViewedDate() {
        return lastViewedDate;
    }

    @JsonProperty("LastViewedDate")
    public void setLastViewedDate(String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    @JsonProperty("LastReferencedDate")
    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    @JsonProperty("LastReferencedDate")
    public void setLastReferencedDate(String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    @JsonProperty("Jigsaw")
    public String getJigsaw() {
        return jigsaw;
    }

    @JsonProperty("Jigsaw")
    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }

    @JsonProperty("JigsawCompanyId")
    public String getJigsawCompanyId() {
        return jigsawCompanyId;
    }

    @JsonProperty("JigsawCompanyId")
    public void setJigsawCompanyId(String jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }

    @JsonProperty("CleanStatus")
    public String getCleanStatus() {
        return cleanStatus;
    }

    @JsonProperty("CleanStatus")
    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    @JsonProperty("AccountSource")
    public String getAccountSource() {
        return accountSource;
    }

    @JsonProperty("AccountSource")
    public void setAccountSource(String accountSource) {
        this.accountSource = accountSource;
    }

    @JsonProperty("DunsNumber")
    public String getDunsNumber() {
        return dunsNumber;
    }

    @JsonProperty("DunsNumber")
    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    @JsonProperty("Tradestyle")
    public String getTradeStyle() {
        return tradeStyle;
    }

    @JsonProperty("Tradestyle")
    public void setTradeStyle(String tradeStyle) {
        this.tradeStyle = tradeStyle;
    }

    @JsonProperty("NaicsCode")
    public String getNaicsCode() {
        return naicsCode;
    }

    @JsonProperty("NaicsCode")
    public void setNaicsCode(String naicsCode) {
        this.naicsCode = naicsCode;
    }

    @JsonProperty("NaicsDesc")
    public String getNaicsDesc() {
        return naicsDesc;
    }

    @JsonProperty("NaicsDesc")
    public void setNaicsDesc(String naicsDesc) {
        this.naicsDesc = naicsDesc;
    }

    @JsonProperty("YearStarted")
    public String getYearStarted() {
        return yearStarted;
    }

    @JsonProperty("YearStarted")
    public void setYearStarted(String yearStarted) {
        this.yearStarted = yearStarted;
    }

    @JsonProperty("SicDesc")
    public String getSicDesc() {
        return sicDesc;
    }

    @JsonProperty("SicDesc")
    public void setSicDesc(String sicDesc) {
        this.sicDesc = sicDesc;
    }

    @JsonProperty("DandbCompanyId")
    public String getDandbCompanyId() {
        return dandbCompanyId;
    }

    @JsonProperty("DandbCompanyId")
    public void setDandbCompanyId(String dandbCompanyId) {
        this.dandbCompanyId = dandbCompanyId;
    }

    @JsonProperty("OperatingHoursId")
    public String getOperatingHoursId() {
        return operatingHoursId;
    }

    @JsonProperty("OperatingHoursId")
    public void setOperatingHoursId(String operatingHoursId) {
        this.operatingHoursId = operatingHoursId;
    }

    @JsonProperty("CustomerPriority__c")
    public String getCustomerPriorityC() {
        return customerPriorityC;
    }

    @JsonProperty("CustomerPriority__c")
    public void setCustomerPriorityC(String customerPriorityC) {
        this.customerPriorityC = customerPriorityC;
    }

    @JsonProperty("SLA__c")
    public String getSlaC() {
        return slaC;
    }

    @JsonProperty("SLA__c")
    public void setSlaC(String slaC) {
        this.slaC = slaC;
    }

    @JsonProperty("Active__c")
    public String getActiveC() {
        return activeC;
    }

    @JsonProperty("Active__c")
    public void setActiveC(String activeC) {
        this.activeC = activeC;
    }

    @JsonProperty("NumberofLocations__c")
    public String getNumberOfLocationsC() {
        return numberOfLocationsC;
    }

    @JsonProperty("NumberofLocations__c")
    public void setNumberOfLocationsC(String numberOfLocationsC) {
        this.numberOfLocationsC = numberOfLocationsC;
    }

    @JsonProperty("UpsellOpportunity__c")
    public String getUpsellOpportunityC() {
        return upsellOpportunityC;
    }

    @JsonProperty("UpsellOpportunity__c")
    public void setUpsellOpportunityC(String upsellOpportunityC) {
        this.upsellOpportunityC = upsellOpportunityC;
    }

    @JsonProperty("SLASerialNumber__c")
    public String getSlaSerialNumberC() {
        return slaSerialNumberC;
    }

    @JsonProperty("SLASerialNumber__c")
    public void setSlaSerialNumberC(String slaSerialNumberC) {
        this.slaSerialNumberC = slaSerialNumberC;
    }

    @JsonProperty("SLAExpirationDate__c")
    public String getSlaExpirationDateC() {
        return slaExpirationDateC;
    }

    @JsonProperty("SLAExpirationDate__c")
    public void setSlaExpirationDateC(String slaExpirationDateC) {
        this.slaExpirationDateC = slaExpirationDateC;
    }
}
