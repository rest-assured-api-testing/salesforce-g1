/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:target/site/cucumber-pretty.html", "json:target/cucumber.json"},
        glue = {"rest.salesforce.org"}
)
public class RunTest extends AbstractTestNGCucumberTests {
    public Logger LOGGER = Logger.getLogger(getClass());
    @BeforeTest
    public void beforeExecution() {
        LOGGER.info("----------- Before Execution -----------");
    }
    @AfterTest
    public void afterExecution() {
        LOGGER.info("----------- After Execution -----------");
    }
}
