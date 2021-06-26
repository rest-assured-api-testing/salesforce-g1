/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

public class RequestID {
    public String idAccount;
    public String idAsset;
    public String idContact;
    public String idContract;
    public String idOrder;
    static String idFeature;

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public String getIdAsset() {
        return idAsset;
    }

    public void setIdAsset(String idAsset) {
        this.idAsset = idAsset;
    }

    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String idContact) {
        this.idContact = idContact;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public static String getIdFeature() {
        return idFeature;
    }

    public static void setIdFeature(String idFeature) {
        RequestID.idFeature = idFeature;
    }

    /**
     * Gets id of any feature
     * @param param
     * @return id of any Feature
     */
    public String getIdFeature(String param) {
        if (param.equals("AccountId")){
            idFeature = idAccount;
        }
        if (param.equals("AssetId")){
            idFeature = getIdAsset();
        }
        if (param.equals("ContactId")){
            idFeature = getIdContact();
        }
        if (param.equals("ContractId")){
            idFeature = getIdContract();
        }
        if (param.equals("OrderId")){
            idFeature = getIdOrder();
        }
        return idFeature;
    }
}
