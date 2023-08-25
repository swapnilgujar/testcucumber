package stepdefinition;

import common.utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMPage extends BaseClass{
	
	@Given("User is on CRM home page")
	public void user_is_on_crm_home_page() {
		System.out.println("User launches the CRM app");
	}
	@When("User logs in with valid creadintials")
	public void user_logs_in_with_valid_creadintials() {
		System.out.println("User logs in with valid credentials");
	    
	}
	
	@Then("User create a new Contact")
	public void user_create_a_new_contact() {
		System.out.println("User create a new Contact");
	    
	}
	
	@Then("User update a Contact")
	public void user_update_a_contact() {
		System.out.println("User update a Contact");
	}
	
	@Then("User deletes a Contact")
	public void user_delete_a_contact() {
		System.out.println("User deletes a Contact");
	}
	
	@Then("User create a new task")
	public void user_create_a_task() {
		System.out.println("User create a new task");
	}
	
	@Then("User update a task")
	public void user_update_a_task() {
		System.out.println("User update a task");
	    
	}
	
	@Then("User deletes a task")
	public void user_deletes_a_task() {
		System.out.println("User deletes a task");
	}
	
	@Then("User creates a deal")
	public void user_creates_a_deal() {
		System.out.println("User creates a deal");
	}
	
	@Then("User deletes a deal")
	public void user_deletes_a_deal() {
		System.out.println("User deletes a deal");
	}
	
	@Then("User update a deal")
	public void user_update_a_deal() {
		System.out.println("User update a deal");
	}


}
