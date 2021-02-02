package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * Test Runner class with Cucumber Options
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources/features/PetStore_Test.feature" }, glue = { "stepDefinitions" }, plugin = {
		"pretty", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" }, monochrome = true, stepNotifications = true, strict = true)
public class TestRunner {
}