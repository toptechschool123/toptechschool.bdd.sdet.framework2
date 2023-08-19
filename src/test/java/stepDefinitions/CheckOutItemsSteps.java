package stepDefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutItemsPageObject;

public class CheckOutItemsSteps extends BaseClass{
	
	CheckOutItemsPageObject obj = new CheckOutItemsPageObject();
	
	
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
	   
		BaseClass.initializeDriver();
	}

	@When("user clicks MyAccount")
	public void user_clicks_my_account() {
	  obj.clickMyAccount();
	}

	@When("user clicks Login")
	public void user_clicks_login() {
		obj.clickLogin();
	}

	@When("user enters email {string}")
	public void user_enters_email(String email) {
	   obj.enterEmail(email);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	   obj.enterPassword(password);
	}

	@When("user clicks loginButton")
	public void user_clicks_login_button() throws InterruptedException {
	    obj.clickLoginBttn();
	    Thread.sleep(3000);
	}

	@Then("user move to Cameras")
	public void user_move_to_cameras() throws InterruptedException {
	    obj.moveToCameras();
	    Thread.sleep(3000);
	}

	@Then("user user moves to SonyItem and clicks it")
	public void user_user_moves_to_sony_item_and_clicks_it() throws InterruptedException {
	    obj.moveToSonyItem();
	    Thread.sleep(3000);
	}

	@Then("user adds an item to cart")
	public void user_adds_an_item_to_cart() throws InterruptedException {
	   obj.addItemToCart();
	   Thread.sleep(3000);
	}

	@Then("user clicks items MyAccount at the bottom of the page")
	public void user_clicks_items_my_account_at_the_bottom_of_the_page() {
	   obj.clickMyAccount2();
	}

	@Then("user logs out")
	public void user_logs_out() {
	   obj.clickLogoutBttn();
	}
}