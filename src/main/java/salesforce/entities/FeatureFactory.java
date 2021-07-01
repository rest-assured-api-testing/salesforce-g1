/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities;

/**
 * This class creates the corresponding feature.
 */
public class FeatureFactory {
    /**
     * Creates a feature given a type.
     *
     * @param featureType a String with the required feature type
     * @return the corresponding feature
     */
    public Features getFeature(String featureType) {
        if (featureType.equalsIgnoreCase(FeaturesNames.Account.getName())) {
            return new Account();
        } else if (featureType.equalsIgnoreCase(FeaturesNames.Asset.getName())) {
            return new Asset();
        } else if (featureType.equalsIgnoreCase(FeaturesNames.Contact.getName())) {
            return new Contact();
        } else if (featureType.equalsIgnoreCase(FeaturesNames.Contract.getName())) {
            return new Contract();
        } else if (featureType.equalsIgnoreCase(FeaturesNames.Order.getName())) {
            return new Order();
        }
        return null;
    }
}
