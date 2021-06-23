package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    private Attribute attributes;
    private String id;
    private String ownerId;
    private String contractId;
    private String accountId;
    private String priceBook2Id;
    private String originalOrderId;
    private String effectiveDate;
    private String endDate;
    private boolean isReductionOrder;
    private String status;
    private String description;
    private String customerAuthorizedById;
    private String customerAuthorizedDate;
    private String companyAuthorizedById;
    private String companyAuthorizedDate;
    private String type;
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
    private String name;
    private String poDate;
    private String poNumber;
    private String orderReferenceNumber;
    private String billToContactId;
    private String shipToContactId;
    private String activatedDate;
    private String activatedById;
    private String statusCode;
    private String orderNumber;
    private String totalAmount;
    private String createdDate;
    private String createdById;
    private String lastModifiedDate;
    private String lastModifiedById;
    private boolean isDeleted;
    private String systemModstamp;
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

    @JsonProperty("OwnerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("ContractId")
    public String getContractId() {
        return contractId;
    }

    @JsonProperty("ContractId")
    public void setContractId(String contractId) {
        this.contractId = contractId;
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

    @JsonProperty("OriginalOrderId")
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    @JsonProperty("OriginalOrderId")
    public void setOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("IsReductionOrder")
    public boolean isReductionOrder() {
        return isReductionOrder;
    }

    @JsonProperty("IsReductionOrder")
    public void setReductionOrder(boolean reductionOrder) {
        isReductionOrder = reductionOrder;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("CustomerAuthorizedById")
    public String getCustomerAuthorizedById() {
        return customerAuthorizedById;
    }

    @JsonProperty("CustomerAuthorizedById")
    public void setCustomerAuthorizedById(String customerAuthorizedById) {
        this.customerAuthorizedById = customerAuthorizedById;
    }

    @JsonProperty("CustomerAuthorizedDate")
    public String getCustomerAuthorizedDate() {
        return customerAuthorizedDate;
    }

    @JsonProperty("CustomerAuthorizedDate")
    public void setCustomerAuthorizedDate(String customerAuthorizedDate) {
        this.customerAuthorizedDate = customerAuthorizedDate;
    }

    @JsonProperty("CompanyAuthorizedById")
    public String getCompanyAuthorizedById() {
        return companyAuthorizedById;
    }

    @JsonProperty("CompanyAuthorizedById")
    public void setCompanyAuthorizedById(String companyAuthorizedById) {
        this.companyAuthorizedById = companyAuthorizedById;
    }

    @JsonProperty("CompanyAuthorizedDate")
    public String getCompanyAuthorizedDate() {
        return companyAuthorizedDate;
    }

    @JsonProperty("CompanyAuthorizedDate")
    public void setCompanyAuthorizedDate(String companyAuthorizedDate) {
        this.companyAuthorizedDate = companyAuthorizedDate;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
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

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("PoDate")
    public String getPoDate() {
        return poDate;
    }

    @JsonProperty("PoDate")
    public void setPoDate(String poDate) {
        this.poDate = poDate;
    }

    @JsonProperty("PoNumber")
    public String getPoNumber() {
        return poNumber;
    }

    @JsonProperty("PoNumber")
    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @JsonProperty("OrderReferenceNumber")
    public String getOrderReferenceNumber() {
        return orderReferenceNumber;
    }

    @JsonProperty("OrderReferenceNumber")
    public void setOrderReferenceNumber(String orderReferenceNumber) {
        this.orderReferenceNumber = orderReferenceNumber;
    }

    @JsonProperty("BillToContactId")
    public String getBillToContactId() {
        return billToContactId;
    }

    @JsonProperty("BillToContactId")
    public void setBillToContactId(String billToContactId) {
        this.billToContactId = billToContactId;
    }

    @JsonProperty("ShipToContactId")
    public String getShipToContactId() {
        return shipToContactId;
    }

    @JsonProperty("ShipToContactId")
    public void setShipToContactId(String shipToContactId) {
        this.shipToContactId = shipToContactId;
    }

    @JsonProperty("ActivatedDate")
    public String getActivatedDate() {
        return activatedDate;
    }

    @JsonProperty("ActivatedDate")
    public void setActivatedDate(String activatedDate) {
        this.activatedDate = activatedDate;
    }

    @JsonProperty("ActivatedById")
    public String getActivatedById() {
        return activatedById;
    }

    @JsonProperty("ActivatedById")
    public void setActivatedById(String activatedById) {
        this.activatedById = activatedById;
    }

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("OrderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("OrderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("TotalAmount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("TotalAmount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
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
