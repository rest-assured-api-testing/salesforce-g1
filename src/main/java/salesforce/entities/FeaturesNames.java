/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities;

/**
 * This enum class is to get corresponding feature's name.
 */
public enum FeaturesNames {
    Account("Account"),
    Asset("Asset"),
    Contact("Contact"),
    Contract("Contract"),
    Order("Order");

    String name;

    FeaturesNames(String name) {
        this.name = name;
    }

    /**
     * Gets the enum's name.
     *
     * @return a String with the enum's name
     */
    public String getName() {
        return name;
    }
}
