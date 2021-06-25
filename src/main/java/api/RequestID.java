/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

public class RequestID {
    public static String idAccount;
    public static String idAsset;
    public static String idContact;
    public static String idContract;
    public static String idOrder;
    static String idFeature;

    public static String getIdAccount() {
        return idAccount;
    }

    public static void setIdAccount(String idAccount) {
        RequestID.idAccount = idAccount;
    }

    public static String getIdAsset() {
        return idAsset;
    }

    public static void setIdAsset(String idAsset) {
        RequestID.idAsset = idAsset;
    }

    public static String getIdContact() {
        return idContact;
    }

    public static void setIdContact(String idContact) {
        RequestID.idContact = idContact;
    }

    public static String getIdContract() {
        return idContract;
    }

    public static void setIdContract(String idContract) {
        RequestID.idContract = idContract;
    }

    public static String getIdOrder() {
        return idOrder;
    }

    public static void setIdOrder(String idOrder) {
        RequestID.idOrder = idOrder;
    }

    /**
     * Gets id of any feature
     * @param param
     * @return
     */
    public static String getIdFeature(String param) {
        if ("AccountId" == param){
            idFeature = getIdAccount();
        }
        if ("AssetId" == param){
            idFeature = getIdAsset();
        }
        if ("ContactId" == param){
            idFeature = getIdContact();
        }
        if ("ContractId" == param){
            idFeature = getIdContract();
        }
        if ("OrderId" == param){
            idFeature = getIdOrder();
        }
        return idFeature;
    }
}
