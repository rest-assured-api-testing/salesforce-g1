package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {
    private Attribute attributes;
    private String id;
    private boolean isDeleted;
    private String masterRecordId;
    private String accountId;
    private String lastName;
    private String firstName;
    private String salutation;
    private String name;
    private String otherStreet;
    private String otherCity;
    private String otherState;
    private String otherPostalCode;
    private String otherCountry;
    private String otherLatitude;
    private String otherLongitude;
    private String otherGeocodeAccuracy;
    private String otherAddress;
    private String mailingStreet;
    private String mailingCity;
    private String mailingState;
    private String mailingPostalCode;
    private String mailingCountry;
    private String mailingLatitude;
    private String mailingLongitude;
    private String mailingGeocodeAccuracy;
    private String mailingAddress;
    private String phone;
    private String fax;
    private String mobilePhone;
    private String homePhone;
    private String otherPhone;
    private String assistantPhone;
    private String reportsToId;
    private String email;
    private String title;
    private String department;
    private String assistantName;
    private String leadSource;
    private String birthdate;
    private String description;
    private String ownerId;
    private String createdDate;
    private String createdById;
    private String lastModifiedDate;
    private String lastModifiedById;
    private String systemModstamp;
    private String lastActivityDate;
    private String lastCURequestDate;
    private String lastCUUpdateDate;
    private String lastViewedDate;
    private String lastReferencedDate;
    private String emailBouncedReason;
    private String emailBouncedDate;
    private boolean isEmailBounced;
    private String photoUrl;
    private String jigsaw;
    private String jigsawContactId;
    private String cleanStatus;
    private String individualId;
    private String levelC;
    private String languagesC;

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

    @JsonProperty("AccountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("Salutation")
    public String getSalutation() {
        return salutation;
    }

    @JsonProperty("Salutation")
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("OtherStreet")
    public String getOtherStreet() {
        return otherStreet;
    }

    @JsonProperty("OtherStreet")
    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    @JsonProperty("OtherCity")
    public String getOtherCity() {
        return otherCity;
    }

    @JsonProperty("OtherCity")
    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    @JsonProperty("OtherState")
    public String getOtherState() {
        return otherState;
    }

    @JsonProperty("OtherState")
    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    @JsonProperty("OtherPostalCode")
    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    @JsonProperty("OtherPostalCode")
    public void setOtherPostalCode(String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }

    @JsonProperty("OtherCountry")
    public String getOtherCountry() {
        return otherCountry;
    }

    @JsonProperty("OtherCountry")
    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    @JsonProperty("OtherLatitude")
    public String getOtherLatitude() {
        return otherLatitude;
    }

    @JsonProperty("OtherLatitude")
    public void setOtherLatitude(String otherLatitude) {
        this.otherLatitude = otherLatitude;
    }

    @JsonProperty("OtherLongitude")
    public String getOtherLongitude() {
        return otherLongitude;
    }

    @JsonProperty("OtherLongitude")
    public void setOtherLongitude(String otherLongitude) {
        this.otherLongitude = otherLongitude;
    }

    @JsonProperty("OtherGeocodeAccuracy")
    public String getOtherGeocodeAccuracy() {
        return otherGeocodeAccuracy;
    }

    @JsonProperty("OtherGeocodeAccuracy")
    public void setOtherGeocodeAccuracy(String otherGeocodeAccuracy) {
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
    }

    @JsonProperty("OtherAddress")
    public String getOtherAddress() {
        return otherAddress;
    }

    @JsonProperty("OtherAddress")
    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    @JsonProperty("MailingStreet")
    public String getMailingStreet() {
        return mailingStreet;
    }

    @JsonProperty("MailingStreet")
    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    @JsonProperty("MailingCity")
    public String getMailingCity() {
        return mailingCity;
    }

    @JsonProperty("MailingCity")
    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    @JsonProperty("MailingState")
    public String getMailingState() {
        return mailingState;
    }

    @JsonProperty("MailingState")
    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    @JsonProperty("MailingPostalCode")
    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    @JsonProperty("MailingPostalCode")
    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    @JsonProperty("MailingCountry")
    public String getMailingCountry() {
        return mailingCountry;
    }

    @JsonProperty("MailingCountry")
    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    @JsonProperty("MailingLatitude")
    public String getMailingLatitude() {
        return mailingLatitude;
    }

    @JsonProperty("MailingLatitude")
    public void setMailingLatitude(String mailingLatitude) {
        this.mailingLatitude = mailingLatitude;
    }

    @JsonProperty("MailingLongitude")
    public String getMailingLongitude() {
        return mailingLongitude;
    }

    @JsonProperty("MailingLongitude")
    public void setMailingLongitude(String mailingLongitude) {
        this.mailingLongitude = mailingLongitude;
    }

    @JsonProperty("MailingGeocodeAccuracy")
    public String getMailingGeocodeAccuracy() {
        return mailingGeocodeAccuracy;
    }

    @JsonProperty("MailingGeocodeAccuracy")
    public void setMailingGeocodeAccuracy(String mailingGeocodeAccuracy) {
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
    }

    @JsonProperty("MailingAddress")
    public String getMailingAddress() {
        return mailingAddress;
    }

    @JsonProperty("MailingAddress")
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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

    @JsonProperty("MobilePhone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    @JsonProperty("MobilePhone")
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @JsonProperty("HomePhone")
    public String getHomePhone() {
        return homePhone;
    }

    @JsonProperty("HomePhone")
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @JsonProperty("OtherPhone")
    public String getOtherPhone() {
        return otherPhone;
    }

    @JsonProperty("OtherPhone")
    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    @JsonProperty("AssistantPhone")
    public String getAssistantPhone() {
        return assistantPhone;
    }

    @JsonProperty("AssistantPhone")
    public void setAssistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }

    @JsonProperty("ReportsToId")
    public String getReportsToId() {
        return reportsToId;
    }

    @JsonProperty("ReportsToId")
    public void setReportsToId(String reportsToId) {
        this.reportsToId = reportsToId;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Department")
    public String getDepartment() {
        return department;
    }

    @JsonProperty("Department")
    public void setDepartment(String department) {
        this.department = department;
    }

    @JsonProperty("AssistantName")
    public String getAssistantName() {
        return assistantName;
    }

    @JsonProperty("AssistantName")
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    @JsonProperty("LeadSource")
    public String getLeadSource() {
        return leadSource;
    }

    @JsonProperty("LeadSource")
    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    @JsonProperty("Birthdate")
    public String getBirthdate() {
        return birthdate;
    }

    @JsonProperty("Birthdate")
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    @JsonProperty("LastCURequestDate")
    public String getLastCURequestDate() {
        return lastCURequestDate;
    }

    @JsonProperty("LastCURequestDate")
    public void setLastCURequestDate(String lastCURequestDate) {
        this.lastCURequestDate = lastCURequestDate;
    }

    @JsonProperty("LastCUUpdateDate")
    public String getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }

    @JsonProperty("LastCUUpdateDate")
    public void setLastCUUpdateDate(String lastCUUpdateDate) {
        this.lastCUUpdateDate = lastCUUpdateDate;
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

    @JsonProperty("EmailBouncedReason")
    public String getEmailBouncedReason() {
        return emailBouncedReason;
    }

    @JsonProperty("EmailBouncedReason")
    public void setEmailBouncedReason(String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }

    @JsonProperty("EmailBouncedDate")
    public String getEmailBouncedDate() {
        return emailBouncedDate;
    }

    @JsonProperty("EmailBouncedDate")
    public void setEmailBouncedDate(String emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }

    @JsonProperty("IsEmailBounced")
    public boolean isEmailBounced() {
        return isEmailBounced;
    }

    @JsonProperty("IsEmailBounced")
    public void setEmailBounced(boolean emailBounced) {
        isEmailBounced = emailBounced;
    }

    @JsonProperty("PhotoUrl")
    public String getPhotoUrl() {
        return photoUrl;
    }

    @JsonProperty("PhotoUrl")
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @JsonProperty("Jigsaw")
    public String getJigsaw() {
        return jigsaw;
    }

    @JsonProperty("Jigsaw")
    public void setJigsaw(String jigsaw) {
        this.jigsaw = jigsaw;
    }

    @JsonProperty("JigsawContactId")
    public String getJigsawContactId() {
        return jigsawContactId;
    }

    @JsonProperty("JigsawContactId")
    public void setJigsawContactId(String jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }

    @JsonProperty("CleanStatus")
    public String getCleanStatus() {
        return cleanStatus;
    }

    @JsonProperty("CleanStatus")
    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    @JsonProperty("IndividualId")
    public String getIndividualId() {
        return individualId;
    }

    @JsonProperty("IndividualId")
    public void setIndividualId(String individualId) {
        this.individualId = individualId;
    }

    @JsonProperty("Level__c")
    public String getLevelC() {
        return levelC;
    }

    @JsonProperty("Level__c")
    public void setLevelC(String levelC) {
        this.levelC = levelC;
    }

    @JsonProperty("Languages__c")
    public String getLanguagesC() {
        return languagesC;
    }

    @JsonProperty("Languages__c")
    public void setLanguagesC(String languagesC) {
        this.languagesC = languagesC;
    }
}
