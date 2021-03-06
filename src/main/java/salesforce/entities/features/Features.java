/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package salesforce.entities.features;

import static utils.DataType.convertStringToObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * This interface implements all features.
 */
public interface Features {
    /**
     * Sets all the attributes on the class.
     *
     * @param map a Map with the attributes to set
     */
    default void setAllFields(final Map map)
            throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Object key : map.keySet()) {
            for (Field attribute : attributes) {
                if (key.equals(attribute.getName())) {
                    if (map.get(key) == null) {
                        PropertyUtils.setSimpleProperty(this, attribute.getName(), map.get(key));
                    } else if (attribute.getType().equals(map.get(key).getClass())) {
                        PropertyUtils.setSimpleProperty(this, attribute.getName(), map.get(key));
                    } else {
                        PropertyUtils.setSimpleProperty(this,
                                attribute.getName(), convertStringToObject((String) map.get(key),
                                        attribute.getType().getSimpleName()));
                    }
                }
            }
        }
    }
}
