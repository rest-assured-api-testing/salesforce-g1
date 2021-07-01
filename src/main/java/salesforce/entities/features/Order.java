/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities.features;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import salesforce.entities.Attribute;
import salesforce.entities.BillingAddress;
import salesforce.entities.ShippingAddress;

import java.util.Date;

/**
 * This class creates an Order object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order implements Features {
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
    public String effectiveDate;
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
     * Gets the contract Id.
     *
     * @return a String with the contract Id
     */
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
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
    public Object getPricebook2Id() {
        return pricebook2Id;
    }

    /**
     * Sets the pricebook2Id.
     *
     * @param pricebook2Id an Object with the pricebook2Id to set
     */
    public void setPricebook2Id(Object pricebook2Id) {
        this.pricebook2Id = pricebook2Id;
    }

    /**
     * Gets the original Order Id.
     *
     * @return an Object with the original Order Id
     */
    public Object getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * Sets the original Order Id.
     *
     * @param originalOrderId an Object with the original Order Id to set
     */
    public void setOriginalOrderId(Object originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    /**
     * Gets the effective Date.
     *
     * @return a String with the effective Date
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the effective Date.
     *
     * @param effectiveDate a String with the effective Date to set
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * Gets the end Date.
     *
     * @return an Object with the end Date
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets the end Date.
     *
     * @param endDate an Object with the end Date to set
     */
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the Reduction Order status.
     *
     * @return a Boolean with Reduction Order status
     */
    public Boolean getIsReductionOrder() {
        return isReductionOrder;
    }

    /**
     * Sets the reduction Order status.
     *
     * @param reductionOrder a Boolean with the reduction Order status to set
     */
    public void setIsReductionOrder(Boolean reductionOrder) {
        isReductionOrder = reductionOrder;
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
     * Gets the customer Authorized By Id.
     *
     * @return a String with the customer Authorized By Id
     */
    public String getCustomerAuthorizedById() {
        return customerAuthorizedById;
    }

    /**
     * Sets the customer Authorized By Id.
     *
     * @param customerAuthorizedById a String with the customer Authorized By Id to set
     */
    public void setCustomerAuthorizedById(String customerAuthorizedById) {
        this.customerAuthorizedById = customerAuthorizedById;
    }

    /**
     * Gets the customer Authorized Date.
     *
     * @return an Object with the customer Authorized Date
     */
    public Object getCustomerAuthorizedDate() {
        return customerAuthorizedDate;
    }

    /**
     * Sets the customer Authorized Date.
     *
     * @param customerAuthorizedDate an Object with the customer Authorized Date to set
     */
    public void setCustomerAuthorizedDate(Object customerAuthorizedDate) {
        this.customerAuthorizedDate = customerAuthorizedDate;
    }

    /**
     * Gets the company Authorized By Id.
     *
     * @return a String with the company Authorized By Id
     */
    public String getCompanyAuthorizedById() {
        return companyAuthorizedById;
    }

    /**
     * Sets the company Authorized By Id.
     *
     * @param companyAuthorizedById String with the company Authorized By Id to set
     */
    public void setCompanyAuthorizedById(String companyAuthorizedById) {
        this.companyAuthorizedById = companyAuthorizedById;
    }

    /**
     * Gets the company Authorized Date.
     *
     * @return an Object with the company Authorized Date
     */
    public Object getCompanyAuthorizedDate() {
        return companyAuthorizedDate;
    }

    /**
     * Sets the company Authorized Date.
     *
     * @param companyAuthorizedDate an Object with the company Authorized Date to set
     */
    public void setCompanyAuthorizedDate(Object companyAuthorizedDate) {
        this.companyAuthorizedDate = companyAuthorizedDate;
    }

    /**
     * Gets the type.
     *
     * @return an Object with the type
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type an Object with the type to set
     */
    public void setType(Object type) {
        this.type = type;
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
     * Gets the shipping Street.
     *
     * @return a String with the shipping Street
     */
    public String getShippingStreet() {
        return shippingStreet;
    }

    /**
     * Sets the shipping Street.
     *
     * @param shippingStreet a String with the shipping Street to set
     */
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    /**
     * Gets the shipping City.
     *
     * @return a String with the shipping City
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the shipping City.
     *
     * @param shippingCity a String with the shipping City to set
     */
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    /**
     * Gets the shipping State.
     *
     * @return a String with the shipping State
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the shipping State.
     *
     * @param shippingState a String with the shipping State to set
     */
    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    /**
     * Gets the shipping Postal Code.
     *
     * @return a String with the shipping Postal Code
     */
    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    /**
     * Sets the shipping Postal Code.
     *
     * @param shippingPostalCode a String with the shipping Postal Code to set
     */
    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    /**
     * Gets the shipping Country.
     *
     * @return a String with the shipping Country
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the shipping Country.
     *
     * @param shippingCountry a String with the shipping Country to set
     */
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    /**
     * Gets the shippingLatitude.
     *
     * @return an Object with the shippingLatitude
     */
    public Object getShippingLatitude() {
        return shippingLatitude;
    }

    /**
     * Sets the shipping Latitude.
     *
     * @param shippingLatitude an Object with the shipping Latitude to set
     */
    public void setShippingLatitude(Object shippingLatitude) {
        this.shippingLatitude = shippingLatitude;
    }

    /**
     * Gets the shipping Longitude.
     *
     * @return an Object with the shipping Longitude
     */
    public Object getShippingLongitude() {
        return shippingLongitude;
    }

    /**
     * Sets the shipping Longitude.
     *
     * @param shippingLongitude an Object with the shipping Longitude to set
     */
    public void setShippingLongitude(Object shippingLongitude) {
        this.shippingLongitude = shippingLongitude;
    }

    /**
     * Gets the shipping Geocode Accuracy.
     *
     * @return an Object with the shipping Geocode Accuracy
     */
    public Object getShippingGeocodeAccuracy() {
        return shippingGeocodeAccuracy;
    }

    /**
     * Sets the shipping Geocode Accuracy.
     *
     * @param shippingGeocodeAccuracy an Object with the shipping Geocode Accuracy to set
     */
    public void setShippingGeocodeAccuracy(Object shippingGeocodeAccuracy) {
        this.shippingGeocodeAccuracy = shippingGeocodeAccuracy;
    }

    /**
     * Gets the shipping Address.
     *
     * @return a String with the shipping Address
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the shipping Address.
     *
     * @param shippingAddress an Object with the shipping Address to set
     */
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Gets the name.
     *
     * @return an Object with the name
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name an Object with the name to set
     */
    public void setName(Object name) {
        this.name = name;
    }

    /**
     * Gets the po Date.
     *
     * @return an Object with the po Date
     */
    public Object getPoDate() {
        return poDate;
    }

    /**
     * Sets the po Date.
     *
     * @param poDate an Object with the po Date to set
     */
    public void setPoDate(Object poDate) {
        this.poDate = poDate;
    }

    /**
     * Gets the po Number.
     *
     * @return an Object with the po Number
     */
    public Object getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the po Number.
     *
     * @param poNumber an Object with the po Number to set
     */
    public void setPoNumber(Object poNumber) {
        this.poNumber = poNumber;
    }

    /**
     * Gets the order Reference Number.
     *
     * @return an Object with the order Reference Number
     */
    public Object getOrderReferenceNumber() {
        return orderReferenceNumber;
    }

    /**
     * Sets the order Reference Number.
     *
     * @param orderReferenceNumber an Object with the order Reference Number to set
     */
    public void setOrderReferenceNumber(Object orderReferenceNumber) {
        this.orderReferenceNumber = orderReferenceNumber;
    }

    /**
     * Gets the bill To Contact Id.
     *
     * @return an Object with the bill To Contact Id
     */
    public Object getBillToContactId() {
        return billToContactId;
    }

    /**
     * Sets the bill To Contact Id.
     *
     * @param billToContactId an Object with the bill To Contact Id to set
     */
    public void setBillToContactId(Object billToContactId) {
        this.billToContactId = billToContactId;
    }

    /**
     * Gets the ship To Contact Id.
     *
     * @return an Object with the ship To Contact Id
     */
    public Object getShipToContactId() {
        return shipToContactId;
    }

    /**
     * Sets the ship To Contact Id.
     *
     * @param shipToContactId an Object with the ship To Contact Id to set
     */
    public void setShipToContactId(Object shipToContactId) {
        this.shipToContactId = shipToContactId;
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
     * Gets the order Number.
     *
     * @return a String with the order Number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the order Number.
     *
     * @param orderNumber a String with the order Number to set
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * Gets the total Amount.
     *
     * @return a Double with the total Amount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total Amount.
     *
     * @param totalAmount a Double with the total Amount to set
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
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
