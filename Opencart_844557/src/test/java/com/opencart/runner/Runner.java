package com.opencart.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/opencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01,@tc02,@tc03,@tc04,@tc05"},
		glue = {"steps"},
		monochrome = true
		)
public class Runner {

}
