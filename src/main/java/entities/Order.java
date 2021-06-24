package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("ContractId")
    public String contractId;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("Pricebook2Id")
    public Object pricebook2Id;
    @JsonProperty("OriginalOrderId")
    public Object originalOrderId;
    @JsonProperty("EffectiveDate")
    public Date effectiveDate;
    @JsonProperty("EndDate")
    public Object endDate;
    @JsonProperty("IsReductionOrder")
    public Boolean isReductionOrder;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("CustomerAuthorizedById")
    public String customerAuthorizedById;
    @JsonProperty("CustomerAuthorizedDate")
    public Object customerAuthorizedDate;
    @JsonProperty("CompanyAuthorizedById")
    public String companyAuthorizedById;
    @JsonProperty("CompanyAuthorizedDate")
    public Object companyAuthorizedDate;
    @JsonProperty("Type")
    public Object type;
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
    @JsonProperty("Name")
    public Object name;
    @JsonProperty("PoDate")
    public Object poDate;
    @JsonProperty("PoNumber")
    public Object poNumber;
    @JsonProperty("OrderReferenceNumber")
    public Object orderReferenceNumber;
    @JsonProperty("BillToContactId")
    public Object billToContactId;
    @JsonProperty("ShipToContactId")
    public Object shipToContactId;
    @JsonProperty("ActivatedDate")
    public Object activatedDate;
    @JsonProperty("ActivatedById")
    public Object activatedById;
    @JsonProperty("StatusCode")
    public String statusCode;
    @JsonProperty("OrderNumber")
    public String orderNumber;
    @JsonProperty("TotalAmount")
    public Double totalAmount;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("SystemModstamp")
    public Date systemModstamp;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;

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

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Object getPricebook2Id() {
        return pricebook2Id;
    }

    public void setPricebook2Id(Object pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }

    public Object getOriginalOrderId() {
        return originalOrderId;
    }

    public void setOriginalOrderId(Object originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Boolean isReductionOrder() {
        return isReductionOrder;
    }

    public void setReductionOrder(Boolean reductionOrder) {
        isReductionOrder = reductionOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerAuthorizedById() {
        return customerAuthorizedById;
    }

    public void setCustomerAuthorizedById(String customerAuthorizedById) {
        this.customerAuthorizedById = customerAuthorizedById;
    }

    public Object getCustomerAuthorizedDate() {
        return customerAuthorizedDate;
    }

    public void setCustomerAuthorizedDate(Object customerAuthorizedDate) {
        this.customerAuthorizedDate = customerAuthorizedDate;
    }

    public String getCompanyAuthorizedById() {
        return companyAuthorizedById;
    }

    public void setCompanyAuthorizedById(String companyAuthorizedById) {
        this.companyAuthorizedById = companyAuthorizedById;
    }

    public Object getCompanyAuthorizedDate() {
        return companyAuthorizedDate;
    }

    public void setCompanyAuthorizedDate(Object companyAuthorizedDate) {
        this.companyAuthorizedDate = companyAuthorizedDate;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
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

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getPoDate() {
        return poDate;
    }

    public void setPoDate(Object poDate) {
        this.poDate = poDate;
    }

    public Object getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(Object poNumber) {
        this.poNumber = poNumber;
    }

    public Object getOrderReferenceNumber() {
        return orderReferenceNumber;
    }

    public void setOrderReferenceNumber(Object orderReferenceNumber) {
        this.orderReferenceNumber = orderReferenceNumber;
    }

    public Object getBillToContactId() {
        return billToContactId;
    }

    public void setBillToContactId(Object billToContactId) {
        this.billToContactId = billToContactId;
    }

    public Object getShipToContactId() {
        return shipToContactId;
    }

    public void setShipToContactId(Object shipToContactId) {
        this.shipToContactId = shipToContactId;
    }

    public Object getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Object activatedDate) {
        this.activatedDate = activatedDate;
    }

    public Object getActivatedById() {
        return activatedById;
    }

    public void setActivatedById(Object activatedById) {
        this.activatedById = activatedById;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public Boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }
}
