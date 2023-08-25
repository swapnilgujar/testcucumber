package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//taggedfeature//",
		glue = {"stepdefinition"},
		monochrome = true,
		dryRun = true,
//		tags = "@SmokeTest or @RegressionTest",
//		tags = "@SmokeTest and @RegressionTest",
//		tags = "@SmokeTest",
//		tags = "@RegressionTest",
//		tags = "not @RegressionTest",
		tags= "@PhaseTwo and @SmokeTest",
		plugin = { /* "pretty", */
				"html:target/reports/html/HtmlReport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedScenarios.txt"
		/*
		 * "usage:target/reports/usage/UsageReport",
		 * "json:target/reports/json/JsonReport.report",
		 * "usage:target/reports/junit/UnitReport.xml"
		 */}
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	//for paraller execution
	/*
	 * @DataProvider(parallel= true) public Object[][]scenarios(){ return
	 * super.scenarios(); }
	 */
  
}
