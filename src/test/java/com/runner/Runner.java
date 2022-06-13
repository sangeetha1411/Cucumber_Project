package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\featurefile\\Google.feature",glue = "Step_Definition",
		stepNotifications = false,
		dryRun = true,
		monochrome = true)
public class Runner {

}
