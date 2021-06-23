package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {
    private Attribute attributes;
    private String id;
    private String contactId;
    private String accountId;
    private String parentId;
    private String rootAssetId;
    private String product2Id;
    private String productCode;
    private boolean isCompetitorProduct;
    private String createdDate;
    private String createdById;
    private String lastModifiedDate;
    private String lastModifiedById;
    private String systemModstamp;
    private boolean isDeleted;
    private String name;
    private String serialNumber;
    private String installDate;
    private String purchaseDate;
    private String usageEndDate;
    private String lifecycleStartDate;
    private String lifecycleEndDate;
    private String status;
    private String price;
    private String quantity;
    private String description;
    private String ownerId;
    private String assetProvidedById;
    private String assetServicedById;
    private boolean isInternal;
    private int assetLevel;
    private String stockKeepingUnit;
    private boolean hasLifecycleManagement;
    private String currentMrr;
    private String currentLifecycleEndDate;
    private String currentQuantity;
    private String currentAmount;
    private String totalLifecycleAmount;
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

    @JsonProperty("ContactId")
    public String getContactId() {
        return contactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("ParentId")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("RootAssetId")
    public String getRootAssetId() {
        return rootAssetId;
    }

    @JsonProperty("RootAssetId")
    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String product2Id) {
        this.product2Id = product2Id;
    }

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return productCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @JsonProperty("IsCompetitorProduct")
    public boolean isCompetitorProduct() {
        return isCompetitorProduct;
    }

    @JsonProperty("IsCompetitorProduct")
    public void setCompetitorProduct(boolean competitorProduct) {
        isCompetitorProduct = competitorProduct;
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

    @JsonProperty("IsDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("IsDeleted")
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("SerialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("InstallDate")
    public String getInstallDate() {
        return installDate;
    }

    @JsonProperty("InstallDate")
    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    @JsonProperty("PurchaseDate")
    public String getPurchaseDate() {
        return purchaseDate;
    }

    @JsonProperty("PurchaseDate")
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @JsonProperty("UsageEndDate")
    public String getUsageEndDate() {
        return usageEndDate;
    }

    @JsonProperty("UsageEndDate")
    public void setUsageEndDate(String usageEndDate) {
        this.usageEndDate = usageEndDate;
    }

    @JsonProperty("LifecycleStartDate")
    public String getLifecycleStartDate() {
        return lifecycleStartDate;
    }

    @JsonProperty("LifecycleStartDate")
    public void setLifecycleStartDate(String lifecycleStartDate) {
        this.lifecycleStartDate = lifecycleStartDate;
    }

    @JsonProperty("LifecycleEndDate")
    public String getLifecycleEndDate() {
        return lifecycleEndDate;
    }

    @JsonProperty("LifecycleEndDate")
    public void setLifecycleEndDate(String lifecycleEndDate) {
        this.lifecycleEndDate = lifecycleEndDate;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("Price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("Quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("OwnerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("OwnerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("AssetProvidedById")
    public String getAssetProvidedById() {
        return assetProvidedById;
    }

    @JsonProperty("AssetProvidedById")
    public void setAssetProvidedById(String assetProvidedById) {
        this.assetProvidedById = assetProvidedById;
    }

    @JsonProperty("AssetServicedById")
    public String getAssetServicedById() {
        return assetServicedById;
    }

    @JsonProperty("AssetServicedById")
    public void setAssetServicedById(String assetServicedById) {
        this.assetServicedById = assetServicedById;
    }

    @JsonProperty("IsInternal")
    public boolean isInternal() {
        return isInternal;
    }

    @JsonProperty("IsInternal")
    public void setInternal(boolean internal) {
        isInternal = internal;
    }

    @JsonProperty("AssetLevel")
    public int getAssetLevel() {
        return assetLevel;
    }

    @JsonProperty("AssetLevel")
    public void setAssetLevel(int assetLevel) {
        this.assetLevel = assetLevel;
    }

    @JsonProperty("StockKeepingUnit")
    public String getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    @JsonProperty("StockKeepingUnit")
    public void setStockKeepingUnit(String stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }

    @JsonProperty("HasLifecycleManagement")
    public boolean isHasLifecycleManagement() {
        return hasLifecycleManagement;
    }

    @JsonProperty("HasLifecycleManagement")
    public void setHasLifecycleManagement(boolean hasLifecycleManagement) {
        this.hasLifecycleManagement = hasLifecycleManagement;
    }

    @JsonProperty("CurrentMrr")
    public String getCurrentMrr() {
        return currentMrr;
    }

    @JsonProperty("CurrentMrr")
    public void setCurrentMrr(String currentMrr) {
        this.currentMrr = currentMrr;
    }

    @JsonProperty("CurrentLifecycleEndDate")
    public String getCurrentLifecycleEndDate() {
        return currentLifecycleEndDate;
    }

    @JsonProperty("CurrentLifecycleEndDate")
    public void setCurrentLifecycleEndDate(String currentLifecycleEndDate) {
        this.currentLifecycleEndDate = currentLifecycleEndDate;
    }

    @JsonProperty("CurrentQuantity")
    public String getCurrentQuantity() {
        return currentQuantity;
    }

    @JsonProperty("CurrentQuantity")
    public void setCurrentQuantity(String currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @JsonProperty("CurrentAmount")
    public String getCurrentAmount() {
        return currentAmount;
    }

    @JsonProperty("CurrentAmount")
    public void setCurrentAmount(String currentAmount) {
        this.currentAmount = currentAmount;
    }

    @JsonProperty("TotalLifecycleAmount")
    public String getTotalLifecycleAmount() {
        return totalLifecycleAmount;
    }

    @JsonProperty("TotalLifecycleAmount")
    public void setTotalLifecycleAmount(String totalLifecycleAmount) {
        this.totalLifecycleAmount = totalLifecycleAmount;
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
