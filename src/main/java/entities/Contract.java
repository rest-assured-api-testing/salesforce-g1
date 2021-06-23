package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contract {
    private Attribute attributes;
    private String id;
    private String accountId;
    private String priceBook2Id;
    private String OwnerExpirationNotice;
    private String startDate;
    private String endDate;
    private String billingStreet;
    private String billingCity;
    private String billingState;
    private String billingPostalCode;
    private String billingCountry;
    private String billingLatitude;
    private String billingLongitude;
    private String billingGeocodeAccuracy;
    private String billingAddress;
    private String contractTerm;
    private String ownerId;
    private String status;
    private String companySignedId;
    private String companySignedDate;
    private String customerSignedId;
    private String customerSignedTitle;
    private String customerSignedDate;
    private String specialTerms;
    private String activatedById;
    private String activatedDate;
    private String statusCode;
    private String description;
    private boolean isDeleted;
    private String contractNumber;
    private String lastApprovedDate;
    private String createdDate;
    private String createdById;
    private String lastModifiedDate;
    private String lastModifiedById;
    private String systemModstamp;
    private String lastActivityDate;
    private String lastViewedDate;
    private String lastReferencedDate;

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

    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("Pricebook2Id")
    public String getPriceBook2Id() {
        return priceBook2Id;
    }

    @JsonProperty("Pricebook2Id")
    public void setPriceBook2Id(String priceBook2Id) {
        this.priceBook2Id = priceBook2Id;
    }

    @JsonProperty("OwnerExpirationNotice")
    public String getOwnerExpirationNotice() {
        return OwnerExpirationNotice;
    }

    @JsonProperty("OwnerExpirationNotice")
    public void setOwnerExpirationNotice(String ownerExpirationNotice) {
        OwnerExpirationNotice = ownerExpirationNotice;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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

    @JsonProperty("ContractTerm")
    public String getContractTerm() {
        return contractTerm;
    }

    @JsonProperty("ContractTerm")
    public void setContractTerm(String contractTerm) {
        this.contractTerm = contractTerm;
    }

    @JsonProperty("OwnerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("CompanySignedId")
    public String getCompanySignedId() {
        return companySignedId;
    }

    @JsonProperty("CompanySignedId")
    public void setCompanySignedId(String companySignedId) {
        this.companySignedId = companySignedId;
    }

    @JsonProperty("CompanySignedDate")
    public String getCompanySignedDate() {
        return companySignedDate;
    }

    @JsonProperty("CompanySignedDate")
    public void setCompanySignedDate(String companySignedDate) {
        this.companySignedDate = companySignedDate;
    }

    @JsonProperty("CustomerSignedId")
    public String getCustomerSignedId() {
        return customerSignedId;
    }

    @JsonProperty("CustomerSignedId")
    public void setCustomerSignedId(String customerSignedId) {
        this.customerSignedId = customerSignedId;
    }

    @JsonProperty("CustomerSignedTitle")
    public String getCustomerSignedTitle() {
        return customerSignedTitle;
    }

    @JsonProperty("CustomerSignedTitle")
    public void setCustomerSignedTitle(String customerSignedTitle) {
        this.customerSignedTitle = customerSignedTitle;
    }

    @JsonProperty("CustomerSignedDate")
    public String getCustomerSignedDate() {
        return customerSignedDate;
    }

    @JsonProperty("CustomerSignedDate")
    public void setCustomerSignedDate(String customerSignedDate) {
        this.customerSignedDate = customerSignedDate;
    }

    @JsonProperty("SpecialTerms")
    public String getSpecialTerms() {
        return specialTerms;
    }

    @JsonProperty("SpecialTerms")
    public void setSpecialTerms(String specialTerms) {
        this.specialTerms = specialTerms;
    }

    @JsonProperty("ActivatedById")
    public String getActivatedById() {
        return activatedById;
    }

    @JsonProperty("ActivatedById")
    public void setActivatedById(String activatedById) {
        this.activatedById = activatedById;
    }

    @JsonProperty("ActivatedDate")
    public String getActivatedDate() {
        return activatedDate;
    }

    @JsonProperty("ActivatedDate")
    public void setActivatedDate(String activatedDate) {
        this.activatedDate = activatedDate;
    }

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("IsDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("IsDeleted")
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("ContractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    @JsonProperty("ContractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    @JsonProperty("LastApprovedDate")
    public String getLastApprovedDate() {
        return lastApprovedDate;
    }

    @JsonProperty("LastApprovedDate")
    public void setLastApprovedDate(String lastApprovedDate) {
        this.lastApprovedDate = lastApprovedDate;
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
}
