/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account implements Features{
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    public Object masterRecordId;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("ParentId")
    public Object parentId;
    @JsonProperty("BillingStreet")
    public String billingStreet;
    @JsonProperty("BillingCity")
    public String billingCity;
    @JsonProperty("BillingState")
    public String billingState;
    @JsonProperty("BillingPostalCode")
    public String billingPostalCode;
    @JsonProperty("BillingCountry")
    public String billingCountry;
    @JsonProperty("BillingLatitude")
    public Object billingLatitude;
    @JsonProperty("BillingLongitude")
    public Object billingLongitude;
    @JsonProperty("BillingGeocodeAccuracy")
    public Object billingGeocodeAccuracy;
    @JsonProperty("BillingAddress")
    public BillingAddress billingAddress;
    @JsonProperty("ShippingStreet")
    public String shippingStreet;
    @JsonProperty("ShippingCity")
    public String shippingCity;
    @JsonProperty("ShippingState")
    public String shippingState;
    @JsonProperty("ShippingPostalCode")
    public String shippingPostalCode;
    @JsonProperty("ShippingCountry")
    public String shippingCountry;
    @JsonProperty("ShippingLatitude")
    public Object shippingLatitude;
    @JsonProperty("ShippingLongitude")
    public Object shippingLongitude;
    @JsonProperty("ShippingGeocodeAccuracy")
    public Object shippingGeocodeAccuracy;
    @JsonProperty("ShippingAddress")
    public ShippingAddress shippingAddress;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Fax")
    public String fax;
    @JsonProperty("AccountNumber")
    public String accountNumber;
    @JsonProperty("Website")
    public String website;
    @JsonProperty("PhotoUrl")
    public String photoUrl;
    @JsonProperty("Sic")
    public String sic;
    @JsonProperty("Industry")
    public String industry;
    @JsonProperty("AnnualRevenue")
    public double annualRevenue;
    @JsonProperty("NumberOfEmployees")
    public int numberOfEmployees;
    @JsonProperty("Ownership")
    public String ownership;
    @JsonProperty("TickerSymbol")
    public String tickerSymbol;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Rating")
    public String rating;
    @JsonProperty("Site")
    public String site;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("CreatedDate")
    public String createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public String lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public String systemModstamp;
    @JsonProperty("LastActivityDate")
    public Object lastActivityDate;
    @JsonProperty("LastViewedDate")
    public String lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public String lastReferencedDate;
    @JsonProperty("Jigsaw")
    public Object jigsaw;
    @JsonProperty("JigsawCompanyId")
    public Object jigsawCompanyId;
    @JsonProperty("CleanStatus")
    public String cleanStatus;
    @JsonProperty("AccountSource")
    public Object accountSource;
    @JsonProperty("DunsNumber")
    public Object dunsNumber;
    @JsonProperty("Tradestyle")
    public Object tradestyle;
    @JsonProperty("NaicsCode")
    public Object naicsCode;
    @JsonProperty("NaicsDesc")
    public Object naicsDesc;
    @JsonProperty("YearStarted")
    public Object yearStarted;
    @JsonProperty("SicDesc")
    public Object sicDesc;
    @JsonProperty("DandbCompanyId")
    public Object dandbCompanyId;
    @JsonProperty("OperatingHoursId")
    public Object operatingHoursId;
    @JsonProperty("CustomerPriority__c")
    public String customerPriority__c;
    @JsonProperty("SLA__c")
    public String sLA__c;
    @JsonProperty("Active__c")
    public String active__c;
    @JsonProperty("NumberofLocations__c")
    public double numberofLocations__c;
    @JsonProperty("UpsellOpportunity__c")
    public String upsellOpportunity__c;
    @JsonProperty("SLASerialNumber__c")
    public String sLASerialNumber__c;
    @JsonProperty("SLAExpirationDate__c")
    public String sLAExpirationDate__c;

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Object getMasterRecordId() {
        return masterRecordId;
    }

    public void setMasterRecordId(Object masterRecordId) {
        this.masterRecordId = masterRecordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public Object getBillingLatitude() {
        return billingLatitude;
    }

    public void setBillingLatitude(Object billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    public Object getBillingLongitude() {
        return billingLongitude;
    }

    public void setBillingLongitude(Object billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    public Object getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    public void setBillingGeocodeAccuracy(Object billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public Object getShippingLatitude() {
        return shippingLatitude;
    }

    public void setShippingLatitude(Object shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    public Object getShippingLongitude() {
        return shippingLongitude;
    }

    public void setShippingLongitude(Object shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    public Object getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    public void setShippingGeocodeAccuracy(Object shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getSic() {
        return sic;
    }

    public void setSic(String sic) {
        this.sic = sic;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public String getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(String systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public String getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    public Object getJigsaw() {
        return jigsaw;
    }

    public void setJigsaw(Object jigsaw) {
        this.jigsaw = jigsaw;
    }

    public Object getJigsawCompanyId() {
        return jigsawCompanyId;
    }

    public void setJigsawCompanyId(Object jigsawCompanyId) {
        this.jigsawCompanyId = jigsawCompanyId;
    }

    public String getCleanStatus() {
        return cleanStatus;
    }

    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    public Object getAccountSource() {
        return accountSource;
    }

    public void setAccountSource(Object accountSource) {
        this.accountSource = accountSource;
    }

    public Object getDunsNumber() {
        return dunsNumber;
    }

    public void setDunsNumber(Object dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    public Object getTradestyle() {
        return tradestyle;
    }

    public void setTradestyle(Object tradestyle) {
        this.tradestyle = tradestyle;
    }

    public Object getNaicsCode() {
        return naicsCode;
    }

    public void setNaicsCode(Object naicsCode) {
        this.naicsCode = naicsCode;
    }

    public Object getNaicsDesc() {
        return naicsDesc;
    }

    public void setNaicsDesc(Object naicsDesc) {
        this.naicsDesc = naicsDesc;
    }

    public Object getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(Object yearStarted) {
        this.yearStarted = yearStarted;
    }

    public Object getSicDesc() {
        return sicDesc;
    }

    public void setSicDesc(Object sicDesc) {
        this.sicDesc = sicDesc;
    }

    public Object getDandbCompanyId() {
        return dandbCompanyId;
    }

    public void setDandbCompanyId(Object dandbCompanyId) {
        this.dandbCompanyId = dandbCompanyId;
    }

    public Object getOperatingHoursId() {
        return operatingHoursId;
    }

    public void setOperatingHoursId(Object operatingHoursId) {
        this.operatingHoursId = operatingHoursId;
    }

    public String getCustomerPriority__c() {
        return customerPriority__c;
    }

    public void setCustomerPriority__c(String customerPriority__c) {
        this.customerPriority__c = customerPriority__c;
    }

    public String getsLA__c() {
        return sLA__c;
    }

    public void setsLA__c(String sLA__c) {
        this.sLA__c = sLA__c;
    }

    public String getActive__c() {
        return active__c;
    }

    public void setActive__c(String active__c) {
        this.active__c = active__c;
    }

    public double getNumberofLocations__c() {
        return numberofLocations__c;
    }

    public void setNumberofLocations__c(double numberofLocations__c) {
        this.numberofLocations__c = numberofLocations__c;
    }

    public String getUpsellOpportunity__c() {
        return upsellOpportunity__c;
    }

    public void setUpsellOpportunity__c(String upsellOpportunity__c) {
        this.upsellOpportunity__c = upsellOpportunity__c;
    }

    public String getsLASerialNumber__c() {
        return sLASerialNumber__c;
    }

    public void setsLASerialNumber__c(String sLASerialNumber__c) {
        this.sLASerialNumber__c = sLASerialNumber__c;
    }

    public String getsLAExpirationDate__c() {
        return sLAExpirationDate__c;
    }

    public void setsLAExpirationDate__c(String sLAExpirationDate__c) {
        this.sLAExpirationDate__c = sLAExpirationDate__c;
    }
}
