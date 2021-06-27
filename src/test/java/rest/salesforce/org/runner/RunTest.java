/**
 * Copyright (c) 2021 Fundacion Jala.
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 */

package rest.salesforce.org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        glue = {"rest.salesforce.org"},
        features = {"src/test/resources/features"}
)
public class RunTest extends AbstractTestNGCucumberTests {
    @BeforeTest
    public void beforeExecution() {
        System.out.println("----------- Before Execution -----------");
    }
    @AfterTest
    public void afterExecution() {
        System.out.println("----------- After Execution -----------");
    }
}