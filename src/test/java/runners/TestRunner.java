package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepdefinition"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
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
  
}
