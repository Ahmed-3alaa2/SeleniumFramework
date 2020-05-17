package steps;

import Pages.HomePage;
import Pages.PageRegisteration;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration extends TestBase {
	HomePage home;
	PageRegisteration register;
	@Given("the user in home page")
	public void the_user_in_home_page() {
	home =new HomePage(driver);
	home.OpenRegistrationPage();
	
	}

	@When("i click on register page")
	public void i_click_on_register_page() {
		
		
	    
	}

	/*
	 * @When("I entered the user data") public void i_entered_the_user_data() {
	 * register = new PageRegisteration(driver); register.userRegistration("ahmed",
	 * "alaa", "saaafg@gmail.com", "Qwer1234", "Qwer1234"); }
	 */
	@When("I entered {string},{string},{string},{string}")
	public void i_entered(String string, String string2, String string3, String string4) {
		 register = new PageRegisteration(driver); register.userRegistration(string,
				 string2, string3, string4, string4); 
		 }
	
	@Then("the registration page displayed properly")
	public void the_registration_page_displayed() {
	    home.userlogout();
	}
}
