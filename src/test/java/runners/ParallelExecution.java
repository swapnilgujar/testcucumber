package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//",
		glue = {"stepdefinition"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)

public class ParallelExecution extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel= true)
	public Object[][]scenarios(){
		return super.scenarios();
	}
	
	
}
