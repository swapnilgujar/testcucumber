package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendEmail {
	
	WebDriver driver;
	WebElement srchBox;
	
	public void setUpBrowser() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Given("User must launch application")
	public void launchApplication() {
		setUpBrowser();
		driver.get("https://www.globalsqa.com/samplepagetest/");
	}
	
	  @When("User should send email to register") public void sendEmail(String
	  sampleEmailText) { srchBox = driver.findElement(By.name("g2599-comment"));
	  srchBox.sendKeys(sampleEmailText);
	  tearDown();
	  }
	 
	  public void tearDown() {
			driver.quit();
			
		}
}
 