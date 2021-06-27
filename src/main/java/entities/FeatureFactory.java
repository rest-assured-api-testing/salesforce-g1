/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package entities;

/**
 * This class creates the corresponding feature
 */
public class FeatureFactory {
    /**
     * Creates a feature given a type
     * @param featureType a String with the required feature type
     * @return the corresponding feature
     */
    public Features getFeature(String featureType) {
        if (featureType.equalsIgnoreCase("Account")) {
            return new Account();
        } else if (featureType.equalsIgnoreCase("Asset")) {
            return new Asset();
        } else if (featureType.equalsIgnoreCase("Contact")) {
            return new Contact();
        } else if (featureType.equalsIgnoreCase("Contract")) {
            return new Contract();
        } else if (featureType.equalsIgnoreCase("Order")) {
            return new Order();
        }
        return null;
    }
}
