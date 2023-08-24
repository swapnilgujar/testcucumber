package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageSearch {
	
	WebDriver driver;
	WebElement srchBox;
	
	public void setUpBrowser() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
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
		tearDown();
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
		Assert.assertEquals(driver.getTitle(), "selenium tutorial - Google");
		tearDown();
	}
	
	public void tearDown() {
		driver.quit();
		
	}
	
	@After
	public void captureScreenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			byte[] screenShot = takeScreenShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "Screenshot");
		}
		
	}
}
 