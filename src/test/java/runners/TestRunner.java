package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features/GooglePageSearch.feature",
		glue = {"stepdefinition"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
  
}
