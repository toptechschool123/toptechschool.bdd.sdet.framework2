package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddItemsPageObjects;

public class AddItemsSteps extends BaseClass {
	
	AddItemsPageObjects object = new AddItemsPageObjects();
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	  BaseClass.initializeDriver();
	}

	@When("user clicks myAccount")
	public void user_clicks_my_account() {
		object.clickMyAccount();
	}

	@When("user clicks loginBttn")
	public void user_clicks_login_bttn() {
		object.clickLogin();
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String email, String pass) {
	    object.enterEmail(email, pass);
	}

	@When("user clicks login")
	public void user_clicks_login() {
		object.clickLoginButton();
	}

	@Then("user moves to Cameras")
	public void user_moves_to_cameras() throws InterruptedException {
		object.moveToCameras();
		Thread.sleep(3000);
	}

	@Then("user moves to SonyItem and clicks it")
	public void user_moves_to_sony_item_and_clicks_it() throws InterruptedException {
		Thread.sleep(3000);
		object.moveToSonyItems();
	}

	@Then("user adds an item to shopping cart")
	public void user_adds_an_item_to_shopping_cart() {
		object.addItemToCart();
	}

	@Then("user clicks My Account at the bottom of the page")
	public void user_clicks_my_account_at_the_bottom_of_the_page() {
		object.clickMyAccount2(); 
	}

	@Then("user logs out")
	public void user_logs_out() {
		object.clickLogout();
	}




}
