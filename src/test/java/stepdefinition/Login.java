package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import common.utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login  extends BaseClass{


	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		setUpBrowser();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Page title is----->" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "The Internet");
	}

	@When("User enters credentials")
	public void user_etners_credentials() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
	}

	
	  @When("User enters {string} and {string}") public void user_enters_and(String
	  stringUserName, String stringPassword) {
	  driver.findElement(By.id("username")).sendKeys(stringUserName);
	  driver.findElement(By.id("password")).sendKeys(stringPassword);
	  driver.findElement(By.xpath("//button[@class='radius']")).click(); }
	  
	 
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
	   String welComeMessage = driver.findElement(By.xpath("//div//h4[@class='subheader']")).getText();
//	   System.err.println("Welcome message is----->"+welComeMessage);
//		boolean welComesMessageIsDisplayed = driver.findElement(By.xpath("//div//h4[@class='subheader']"))
//				.isDisplayed();
//		assertTrue(welComesMessageIsDisplayed);
	   Assert.assertEquals(welComeMessage, "Welcome to the Secure Area. When you are done click logout below.");
		//tearDown();
	}

	@After
	public void captureScreenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			byte[] screenShot = takeScreenShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "");
		}
	}
}
