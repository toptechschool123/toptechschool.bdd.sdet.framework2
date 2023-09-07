package pageObjects;



import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class LoginPageObjects extends BaseClass  {
	
	
	public LoginPageObjects() { 
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]" )
	private WebElement MyAccount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement Login;         
	
	@FindBy(how = How.XPATH,using = "//input[@id='input-email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using = "(//input[@class='form-control'])[2]")
	private WebElement Password;
	
	@FindBy(how=How.XPATH, using = "//input[@id='signinbtn']")
	private WebElement LoginButton;
	
	@FindBy(how = How.XPATH, using = "//a[text()='logout']")
	private WebElement LogoutButton;
	

	public void clickMyAccount() {
		
		MyAccount.click();
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void enterEmail( String email) { 
		Email.sendKeys(email);
	}
	
	public void enterPassword(String passw) {
		Password.sendKeys(passw);
	}
	
	public void clickLoginBttn() {
		LoginButton.click();
		
		
		String actualTitle =driver.getTitle();
		String expectedTitle = "Login";
		
		//Assertions.assertEquals(actualTitle, expectedTitle);
		
		//Assert.assertNotEquals(expectedTitle, actualTitle);
		Assertions.assertEquals(actualTitle, expectedTitle);
	}
	
	
	public void clickLogoutBttn() {
		LogoutButton.click();
		
		
		String actualTitle =driver.getTitle();
		String expectedTitle = "R";
		
	
	
		//Assert.assertEquals(expectedTitle, actualTitle);
		//Assert.assertEquals("actualTitle is Login", actualTitle, expectedTitle);
		
		//Assertions.assertEquals(actualTitle, expectedTitle);
		
		Assertions.assertNotEquals(actualTitle, expectedTitle);
		
	
	}
}


