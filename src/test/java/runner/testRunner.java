package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Feature/"}, glue={"stepDefinitions"}, tags = "@loginTest")
//@CucumberOptions(features={"C:\\Users\\Raghavendra\\eclipse-workspace\\DigiboxxWebCucumber\\Feature"}, glue={"StepDefinition"}, tags = "@loginTest")

public class testRunner {

}
