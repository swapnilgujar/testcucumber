package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageSearch extends BaseClass {
	
	WebElement srchBox;
	
	
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		setUpBrowser();
		driver.get("https://www.google.com");
	}
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
		  srchBox = driver.findElement(By.name("q"));
		  srchBox.sendKeys("cypress tutorial");
		  srchBox.sendKeys(Keys.ENTER);
	}
	@Then("Should Display Java result page")
	public void should_display_java_result_page() {
		System.out.println("Page title is----->"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "cypress tutorial - Google Search");
	}
	
	@When("I search Selenium Tutorial")
	public void i_search_selenium_tutorial() {
		srchBox = driver.findElement(By.name("q"));
		  srchBox.sendKeys("selenium tutorial");
		  srchBox.sendKeys(Keys.ENTER);
	}
	@Then("Should Display Selenium result page")
	public void should_display_selenium_result_page() {
		System.out.println("Page title is----->"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "selenium tutorial - Google Search");
		
	}
	
	@After
	public void captureScreenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			byte[] screenShot = takeScreenShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "Screenshot");
		}}
	}
	
	
	
 