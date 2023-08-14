package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class AddItemsPageObjects extends BaseClass{
	
	
	public AddItemsPageObjects() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="")
	private WebElement myAccount;

	@FindBy(id="")
	private WebElement login;
	
	public void clickMyAccount() {
		myAccount.click();
		
	}
		public void clickLogin() {
			
			login.click();
		}
		}
	
