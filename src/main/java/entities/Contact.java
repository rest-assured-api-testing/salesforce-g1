package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("MasterRecordId")
    public Object masterRecordId;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("LastName")
    public String lastName;
    @JsonProperty("FirstName")
    public String firstName;
    @JsonProperty("Salutation")
    public String salutation;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("OtherStreet")
    public String otherStreet;
    @JsonProperty("OtherCity")
    public String otherCity;
    @JsonProperty("OtherState")
    public String otherState;
    @JsonProperty("OtherPostalCode")
    public String otherPostalCode;
    @JsonProperty("OtherCountry")
    public String otherCountry;
    @JsonProperty("OtherLatitude")
    public Object otherLatitude;
    @JsonProperty("OtherLongitude")
    public Object otherLongitude;
    @JsonProperty("OtherGeocodeAccuracy")
    public Object otherGeocodeAccuracy;
    @JsonProperty("OtherAddress")
    public OtherAddress otherAddress;
    @JsonProperty("MailingStreet")
    public String mailingStreet;
    @JsonProperty("MailingCity")
    public String mailingCity;
    @JsonProperty("MailingState")
    public String mailingState;
    @JsonProperty("MailingPostalCode")
    public String mailingPostalCode;
    @JsonProperty("MailingCountry")
    public String mailingCountry;
    @JsonProperty("MailingLatitude")
    public Object mailingLatitude;
    @JsonProperty("MailingLongitude")
    public Object mailingLongitude;
    @JsonProperty("MailingGeocodeAccuracy")
    public Object mailingGeocodeAccuracy;
    @JsonProperty("MailingAddress")
    public MailingAddress mailingAddress;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("Fax")
    public String fax;
    @JsonProperty("MobilePhone")
    public String mobilePhone;
    @JsonProperty("HomePhone")
    public String homePhone;
    @JsonProperty("OtherPhone")
    public String otherPhone;
    @JsonProperty("AssistantPhone")
    public String assistantPhone;
    @JsonProperty("ReportsToId")
    public String reportsToId;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Title")
    public String title;
    @JsonProperty("Department")
    public String department;
    @JsonProperty("AssistantName")
    public String assistantName;
    @JsonProperty("LeadSource")
    public String leadSource;
    @JsonProperty("Birthdate")
    public String birthdate;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OwnerId")
    public String ownerId;
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
    @JsonProperty("LastCURequestDate")
    public Object lastCURequestDate;
    @JsonProperty("LastCUUpdateDate")
    public Object lastCUUpdateDate;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;
    @JsonProperty("EmailBouncedReason")
    public Object emailBouncedReason;
    @JsonProperty("EmailBouncedDate")
    public Object emailBouncedDate;
    @JsonProperty("IsEmailBounced")
    public Boolean isEmailBounced;
    @JsonProperty("PhotoUrl")
    public String photoUrl;
    @JsonProperty("Jigsaw")
    public Object jigsaw;
    @JsonProperty("JigsawContactId")
    public Object jigsawContactId;
    @JsonProperty("CleanStatus")
    public String cleanStatus;
    @JsonProperty("IndividualId")
    public Object individualId;
    @JsonProperty("Level__c")
    public String level__c;
    @JsonProperty("Languages__c")
    public String languages__c;

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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherPostalCode() {
        return otherPostalCode;
    }

    public void setOtherPostalCode(String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public Object getOtherLatitude() {
        return otherLatitude;
    }

    public void setOtherLatitude(Object otherLatitude) {
        this.otherLatitude = otherLatitude;
    }

    public Object getOtherLongitude() {
        return otherLongitude;
    }

    public void setOtherLongitude(Object otherLongitude) {
        this.otherLongitude = otherLongitude;
    }

    public Object getOtherGeocodeAccuracy() {
        return otherGeocodeAccuracy;
    }

    public void setOtherGeocodeAccuracy(Object otherGeocodeAccuracy) {
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
    }

    public OtherAddress getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(OtherAddress otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getMailingPostalCode() {
        return mailingPostalCode;
    }

    public void setMailingPostalCode(String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public Object getMailingLatitude() {
        return mailingLatitude;
    }

    public void setMailingLatitude(Object mailingLatitude) {
        this.mailingLatitude = mailingLatitude;
    }

    public Object getMailingLongitude() {
        return mailingLongitude;
    }

    public void setMailingLongitude(Object mailingLongitude) {
        this.mailingLongitude = mailingLongitude;
    }

    public Object getMailingGeocodeAccuracy() {
        return mailingGeocodeAccuracy;
    }

    public void setMailingGeocodeAccuracy(Object mailingGeocodeAccuracy) {
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAssistantPhone() {
        return assistantPhone;
    }

    public void setAssistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }

    public String getReportsToId() {
        return reportsToId;
    }

    public void setReportsToId(String reportsToId) {
        this.reportsToId = reportsToId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAssistantName() {
        return assistantName;
    }

    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
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

    public Date getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(Date systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public Object getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Object lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Object getLastCURequestDate() {
        return lastCURequestDate;
    }

    public void setLastCURequestDate(Object lastCURequestDate) {
        this.lastCURequestDate = lastCURequestDate;
    }

    public Object getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }

    public void setLastCUUpdateDate(Object lastCUUpdateDate) {
        this.lastCUUpdateDate = lastCUUpdateDate;
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

    public Object getEmailBouncedReason() {
        return emailBouncedReason;
    }

    public void setEmailBouncedReason(Object emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }

    public Object getEmailBouncedDate() {
        return emailBouncedDate;
    }

    public void setEmailBouncedDate(Object emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }

    public Boolean isEmailBounced() {
        return isEmailBounced;
    }

    public void setEmailBounced(Boolean emailBounced) {
        isEmailBounced = emailBounced;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Object getJigsaw() {
        return jigsaw;
    }

    public void setJigsaw(Object jigsaw) {
        this.jigsaw = jigsaw;
    }

    public Object getJigsawContactId() {
        return jigsawContactId;
    }

    public void setJigsawContactId(Object jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }

    public String getCleanStatus() {
        return cleanStatus;
    }

    public void setCleanStatus(String cleanStatus) {
        this.cleanStatus = cleanStatus;
    }

    public Object getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Object individualId) {
        this.individualId = individualId;
    }

    public String getLevel__c() {
        return level__c;
    }

    public void setLevel__c(String level__c) {
        this.level__c = level__c;
    }

    public String getLanguages__c() {
        return languages__c;
    }

    public void setLanguages__c(String languages__c) {
        this.languages__c = languages__c;
    }
}
