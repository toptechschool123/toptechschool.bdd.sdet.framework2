package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegistrationFormPageObjects;

public class RegistrationFormSteps {	RegistrationFormPageObjects RegObject = new RegistrationFormPageObjects();
	
	
	
	@Given("User is on TEST Environment page")
	public void user_is_on_test_environment_page() {
	   BaseClass.initializeDriver();
	}

	@When("User click on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		RegObject.clickOnMyAccount();
	}

	@When("User click on Register")
	public void user_click_on_register() throws InterruptedException {
		RegObject.clickRegister();
	}


	@When("user fills out the following information")
	public void user_fills_out_the_following_information(io.cucumber.datatable.DataTable personalInoformation) {
		List<Map<String, String>> data = personalInoformation.asMaps(String.class, String.class);
		
		RegObject.enterFirstName(data.get(0).get("FirstName"));
		RegObject.enteLastName(data.get(0).get("LastName"));
		RegObject.enterEmail(data.get(0).get("Email"));
		RegObject.enterTelephone(data.get(0).get("Telephone"));
		RegObject.selectCountry();
		RegObject.enterPassword(data.get(0).get("Password"));
		RegObject.enterConfPassword(data.get(0).get("ConfirmPassword"));
	}

	@When("User select {string} for Subscribe")
	public void user_select_for_subscribe(String subscribe) {
		RegObject.clickSubscribe();
	}

	@When("User click privacy and policy button")
	public void user_click_privacy_and_policy_button() {
		RegObject.clickPrivacyPolicy();
	}

	@When("User click Continue button")
	public void user_click_continue_button() {
		RegObject.clickContinueBttn();
	}

	@Then("user account is created with a message as follows: {string}")
	public void user_account_is_created_with_a_message_as_follows(String messge) throws InterruptedException {
	   

		Assert.assertEquals(RegObject.accountCreated(), messge);
		
	}

}







