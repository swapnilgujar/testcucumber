package stepdefinition;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	public void setUpBrowser() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		setUpBrowser();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("Page title is----->"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "The Internet");
	}
	@When("User etners credentials")
	public void user_etners_credentials() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@class='radius']")).click();
	}
	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
//	   String welComeMessage = driver.findElement(By.xpath("//div//h4[@class='subheader']")).getText();
//	   System.err.println("Welcom message is----->"+welComeMessage);
	   boolean welComesMessageIsDisplayed = driver.findElement(By.xpath("//div//h4[@class='subheader']")).isDisplayed();
	   assertTrue(welComesMessageIsDisplayed);
//	   Assert.assertEquals(welComeMessage, "Welcome to the Secure Area. When you are done click logout below.");
	   tearDown();
	}

	public void tearDown() {
		driver.quit();
		
	}
}
