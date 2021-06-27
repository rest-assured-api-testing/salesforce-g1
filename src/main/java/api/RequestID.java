/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package api;

import org.apache.commons.beanutils.PropertyUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class RequestID {
    public String accountId;
    public String assetId;
    public String contactId;
    public String contractId;
    public String orderId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Sets a specified field of the request
     * @param fieldName a String with the field's name
     * @param fieldValue a String with the field's value
     * @throws InvocationTargetException when target not found
     * @throws IllegalAccessException when illegal access found
     * @throws NoSuchMethodException when method not found
     */
    public void setField(String fieldName, String fieldValue) throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException {
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (attribute.getName().equals(fieldName)) {
                PropertyUtils.setSimpleProperty(this, attribute.getName(), fieldValue);
            }
        }
    }

    /**
     * Gets a specified field of the request
     * @param fieldName a String with the field's name
     * @throws InvocationTargetException when target not found
     * @throws IllegalAccessException when illegal access found
     * @throws NoSuchMethodException when method not found
     */
    public String getField(String fieldName) throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException {
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (attribute.getName().equals(fieldName)) {
                String field = PropertyUtils.getSimpleProperty(this, fieldName).toString();
                return field;
            }
        }
        return null;
    }

    /**
     * Changes a name to match field's name
     * @param name a String with the name of the endpoint or the param
     * @return a String with the field's name
     */
    public String nameConverter(String name) {
        char firstChar = name.charAt(0);
        char myChar = "/".charAt(0);
        if (firstChar == myChar) {
            name = name.substring(1) + "Id";
        }
        char c[] = name.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        String newName = new String(c);
        return newName;
    }

    public Map createMapFields() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Map mapFields = new HashMap();
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (PropertyUtils.getSimpleProperty(this, attribute.getName()) != null) {
                mapFields.put(attribute.getName(), PropertyUtils.getSimpleProperty(this, attribute.getName()).toString());
            }
        }
        return mapFields;
    }
}
