package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
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
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
	}
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
	    // Write code here that turns the phrase above into concrete actions
		  srchBox = driver.findElement(By.name("q"));
		  srchBox.sendKeys("cypress tutorial");
		  srchBox.sendKeys(Keys.ENTER);
	}
	@Then("Should Display Java result page")
	public void should_display_java_result_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Page title is----->"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "cypress tutorial - Google Search");
	}

}
/*
 * driver.get("https://www.google.com");
	  srchBox = driver.findElement(By.name("q"));
	  srchBox.sendKeys("cypress tutorial");
	  srchBox.sendKeys(Keys.ENTER);
	  System.out.println("Page title is----->"+driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "cypress tutorial - Google Search");
 * */
 