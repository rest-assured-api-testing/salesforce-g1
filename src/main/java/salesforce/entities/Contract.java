/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 * This class creates a Contract object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contract implements Features {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("Pricebook2Id")
    public String pricebook2Id;
    @JsonProperty("OwnerExpirationNotice")
    public String ownerExpirationNotice;
    @JsonProperty("StartDate")
    public String startDate;
    @JsonProperty("EndDate")
    public String endDate;
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
    @JsonProperty("ContractTerm")
    public Integer contractTerm;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("CompanySignedId")
    public String companySignedId;
    @JsonProperty("CompanySignedDate")
    public String companySignedDate;
    @JsonProperty("CustomerSignedId")
    public String customerSignedId;
    @JsonProperty("CustomerSignedTitle")
    public String customerSignedTitle;
    @JsonProperty("CustomerSignedDate")
    public String customerSignedDate;
    @JsonProperty("SpecialTerms")
    public String specialTerms;
    @JsonProperty("ActivatedById")
    public Object activatedById;
    @JsonProperty("ActivatedDate")
    public Object activatedDate;
    @JsonProperty("StatusCode")
    public String statusCode;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("ContractNumber")
    public String contractNumber;
    @JsonProperty("LastApprovedDate")
    public Object lastApprovedDate;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public Date systemModstamp;
    @JsonProperty("LastActivityDate")
    public Object lastActivityDate;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;

    /**
     * Gets the attributes.
     *
     * @return an object with the attributes
     */
    public Attribute getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes.
     *
     * @param attributes an object with the attributes to set
     */
    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets the id.
     *
     * @return a String with the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id a String with the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the account Id.
     *
     * @return a String with the account Id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the account Id.
     *
     * @param accountId a String with the account Id to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the pricebook2Id.
     *
     * @return an Object with the pricebook2Id
     */
    public String getPricebook2Id() {
        return pricebook2Id;
    }

    /**
     * Sets the pricebook2Id.
     *
     * @param pricebook2Id an Object with the pricebook2Id to set
     */
    public void setPricebook2Id(String pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }

    /**
     * Gets the owner Expiration Notice.
     *
     * @return a String with the owner Expiration Notice
     */
    public String getOwnerExpirationNotice() {
        return ownerExpirationNotice;
    }

    /**
     * Sets the owner Expiration Notice.
     *
     * @param ownerExpirationNotice a String with the owner Expiration Notice to set
     */
    public void setOwnerExpirationNotice(String ownerExpirationNotice) {
        this.ownerExpirationNotice = ownerExpirationNotice;
    }

    /**
     * Gets the start Date.
     *
     * @return an Object with the start Date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start Date.
     *
     * @param startDate an Object with the start Date to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the end Date.
     *
     * @return an Object with the end Date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the end Date.
     *
     * @param endDate an Object with the end Date to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the billing Street.
     *
     * @return a String with the billing Street
     */
    public String getBillingStreet() {
        return billingStreet;
    }

    /**
     * Sets the billing Street.
     *
     * @param billingStreet a String with the billing Street to set
     */
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    /**
     * Gets the billing City.
     *
     * @return a String with the billing City
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the billing City.
     *
     * @param billingCity a String with the billing City to set
     */
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Gets the billing State.
     *
     * @return a String with the billing State
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets the billing State.
     *
     * @param billingState a String with the billing State to set
     */
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Gets the billing Postal Code.
     *
     * @return a String with the billing Postal Code
     */
    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    /**
     * Sets the billing Postal Code.
     *
     * @param billingPostalCode a String with the billing Postal Code to set
     */
    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    /**
     * Gets the billing Country.
     *
     * @return a String with the billing Country
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the billing Country.
     *
     * @param billingCountry a String with the billing Country to set
     */
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Gets the billing Latitude.
     *
     * @return an Object with the billing Latitude
     */
    public Object getBillingLatitude() {
        return billingLatitude;
    }

    /**
     * Sets the billing Latitude.
     *
     * @param billingLatitude an Object with the billing Latitude to set
     */
    public void setBillingLatitude(Object billingLatitude) {
        this.billingLatitude = billingLatitude;
    }

    /**
     * Gets the billing Longitude.
     *
     * @return an Object with the billing Longitude
     */
    public Object getBillingLongitude() {
        return billingLongitude;
    }

    /**
     * Sets the billing Longitude.
     *
     * @param billingLongitude an Object with the billing Longitude to set
     */
    public void setBillingLongitude(Object billingLongitude) {
        this.billingLongitude = billingLongitude;
    }

    /**
     * Gets the billing Geocode Accuracy.
     *
     * @return an Object with the billing Geocode Accuracy
     */
    public Object getBillingGeocodeAccuracy() {
        return billingGeocodeAccuracy;
    }

    /**
     * Sets the billing Geocode Accuracy.
     *
     * @param billingGeocodeAccuracy an Object with the billing Geocode Accuracy to set
     */
    public void setBillingGeocodeAccuracy(Object billingGeocodeAccuracy) {
        this.billingGeocodeAccuracy = billingGeocodeAccuracy;
    }

    /**
     * Gets the billing Address.
     *
     * @return an Object with the billing Address
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the billing Address.
     *
     * @param billingAddress an Object with the billing Address to set
     */
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Gets the contract Term.
     *
     * @return an Integer with the contract Term
     */
    public Integer getContractTerm() {
        return contractTerm;
    }

    /**
     * Sets the contract Term.
     *
     * @param contractTerm an Integer with the contract Term to set
     */
    public void setContractTerm(Integer contractTerm) {
        this.contractTerm = contractTerm;
    }

    /**
     * Gets the owner Id.
     *
     * @return a String with the owner Id
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the owner Id.
     *
     * @param ownerId a String with the owner Id to set
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets the status.
     *
     * @return a String with the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status a String with the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the company Signed Id.
     *
     * @return a String with the company Signed Id
     */
    public String getCompanySignedId() {
        return companySignedId;
    }

    /**
     * Sets the company Signed Id.
     *
     * @param companySignedId a String with the company Signed Id to set
     */
    public void setCompanySignedId(String companySignedId) {
        this.companySignedId = companySignedId;
    }

    /**
     * Gets the company Signed Date.
     *
     * @return a String with the company Signed Date
     */
    public String getCompanySignedDate() {
        return companySignedDate;
    }

    /**
     * Sets the company Signed Date.
     *
     * @param companySignedDate a String with the company Signed Date to set
     */
    public void setCompanySignedDate(String companySignedDate) {
        this.companySignedDate = companySignedDate;
    }

    /**
     * Gets the customer Signed Id.
     *
     * @return a String with the customer Signed Id
     */
    public String getCustomerSignedId() {
        return customerSignedId;
    }

    /**
     * Sets the customr Signed Id.
     *
     * @param customerSignedId a String with the customer Signed Id to set
     */
    public void setCustomerSignedId(String customerSignedId) {
        this.customerSignedId = customerSignedId;
    }

    /**
     * Gets the customer Signed Title.
     *
     * @return a String with the customer Signed Title
     */
    public String getCustomerSignedTitle() {
        return customerSignedTitle;
    }

    /**
     * Sets the customer Signed Title.
     *
     * @param customerSignedTitle a String with the customer Signed Title to set
     */
    public void setCustomerSignedTitle(String customerSignedTitle) {
        this.customerSignedTitle = customerSignedTitle;
    }

    /**
     * Gets the customer SignedDate.
     *
     * @return a String with the customer Signed Date
     */
    public String getCustomerSignedDate() {
        return customerSignedDate;
    }

    /**
     * Sets the customer Signed Date.
     *
     * @param customerSignedDate a String with the customer Signed Date to set
     */
    public void setCustomerSignedDate(String customerSignedDate) {
        this.customerSignedDate = customerSignedDate;
    }

    /**
     * Gets the special Terms.
     *
     * @return a String with the special Terms
     */
    public String getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Sets the special Terms.
     *
     * @param specialTerms a String with the special Terms to set
     */
    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    /**
     * Gets the activated By Id.
     *
     * @return an Object with the activated By Id
     */
    public Object getActivatedById() {
        return activatedById;
    }

    /**
     * Sets the activated By Id.
     *
     * @param activatedById an Object with the activated By Id to set
     */
    public void setActivatedById(Object activatedById) {
        this.activatedById = activatedById;
    }

    /**
     * Gets the activated Date.
     *
     * @return an Object with the activated Date
     */
    public Object getActivatedDate() {
        return activatedDate;
    }

    /**
     * Sets the activated Date.
     *
     * @param activatedDate an Object with the activated Date to set
     */
    public void setActivatedDate(Object activatedDate) {
        this.activatedDate = activatedDate;
    }

    /**
     * Gets the status Code.
     *
     * @return a String with the status Code
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the status Code.
     *
     * @param statusCode a String with the status Code to set
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets the description.
     *
     * @return a String with the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description a String with the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the deleted status.
     *
     * @return a Boolean with the deleted status
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the is deleted status.
     *
     * @param deleted a Boolean with the deleted status to set
     */
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * Gets the contract Number.
     *
     * @return a String with the contract Number
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the is contract Number.
     *
     * @param contractNumber a String with the contract Number to set
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * Gets the last Approved Date.
     *
     * @return an Object with the last Approved Date
     */
    public Object getLastApprovedDate() {
        return lastApprovedDate;
    }

    /**
     * Sets the is lastApprovedDate.
     *
     * @param lastApprovedDate an Object with the last Approved Date to set
     */
    public void setLastApprovedDate(Object lastApprovedDate) {
        this.lastApprovedDate = lastApprovedDate;
    }

    /**
     * Gets the created Date.
     *
     * @return a Date with the created Date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the created Date.
     *
     * @param createdDate a Date with the created Date to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets the created By Id.
     *
     * @return a String with the created By Id
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the created By Id.
     *
     * @param createdById a String with the created By Id to set
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets the last Modified Date.
     *
     * @return a Date with the last Modified Date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the last Modified Date.
     *
     * @param lastModifiedDate a Date with the last Modified Date to set
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the last Modified By Id.
     *
     * @return a String with the last Modified By Id
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the last Modified By Id.
     *
     * @param lastModifiedById a String with the last Modified By Id to set
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets the system Mod stamp.
     *
     * @return a Date with the system Mod stamp
     */
    public Date getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the system Mod stamp.
     *
     * @param systemModstamp a Date with the system Mod stamp to set
     */
    public void setSystemModstamp(Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    /**
     * Gets the last Activity Date.
     *
     * @return a Object with the last Activity Date
     */
    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the last Activity Date.
     *
     * @param lastActivityDate an Object with the last Activity Date to set
     */
    public void setLastActivityDate(Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * Gets the last Viewed Date.
     *
     * @return a Date with the last Viewed Date
     */
    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the last Viewed Date.
     *
     * @param lastViewedDate a Dat with the last Viewed Date to set
     */
    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets the last Referenced Date.
     *
     * @return a Date with the last Referenced Date
     */
    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the last Referenced Date.
     *
     * @param lastReferencedDate a Date with the last Referenced Date to set
     */
    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }
}
