package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class ReRunFailedTC {
	
	@CucumberOptions(
			features = "@target/failedScenarios.txt",
			glue = {"stepdefinition"},
			monochrome = true,
			dryRun = false,
			plugin = {"pretty"}
			)

	public class TestRunner extends AbstractTestNGCucumberTests {
	  
	}


}
