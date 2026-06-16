package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination 
{
	@Given("user is at login page")
	public void user_is_at_login_page() 
	{
	   System.out.println("User is at login page");
	}
	
	
	@When("user provide correct {string} and {string}")
	public void user_provide_correct_and(String string, String string2) 
	{
	   System.out.println("username ="+string );
	   System.out.println("password ="+string2);
	}
	
	
	@When("clicks on login button having id {int}")
	public void clicks_on_login_button_having_id(Integer int1) 
	{
		 System.out.println("button ID =" + int1);
	}
	
	
	@Then("I should get logged into my account")
	public void i_should_get_logged_into_my_account() 
	{
		 System.out.println("user should get logged into his account");
	}
	
	
	@Then("should land on home page")
	public void should_land_on_home_page()
	{
		 System.out.println("& he should land on Home page");
	}

	
	@When("user provide {string} and {string}")
	public void user_provide_username1_and_password1(String username, String password)
	{
		 System.out.println("username ="+username );
		   System.out.println("password ="+password);
	}
	
	@When("clicks on login button")
	public void clicks_on_login_button()
	{
		System.out.println("Clicks on login button");
	}
	
	
	@Then("user should stay on login page")
	public void user_should_stay_on_login_page() 
	{
	   
	}
	
	
	@Then("validation message should be shown to him\\/her")
	public void validation_message_should_be_shown_to_him_her() 
	{
		
	}
	
	
}
