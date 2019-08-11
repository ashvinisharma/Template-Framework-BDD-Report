package com.rest.api.cucumberRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		monochrome = true,
		plugin = {
		                "pretty",
		                "json:target/cucumber.json",
		        },
		glue= {"com.rest.api.stepDefinition","com.rest.api.common"}
		)

// Make sure that runner class name should have 'Test' else Maven will not able to recognized Runner class 
public class RunnerClassTest {

}
