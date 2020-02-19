package com.cognifide.qa.bb.aem.core.acceptanceTest;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class AllTest {


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/resources/features", glue = { "com.cognifide.qa.bb.aem.core" }, plugin = { "pretty",
            "json:target/cucumber-reports/cucumber.json" }, tags = { "@Regression" })
    
    public class AllTests {
    }


}
