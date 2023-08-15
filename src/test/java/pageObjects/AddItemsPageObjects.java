package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import utils.DriverUtility;

public class AddItemsPageObjects extends BaseClass{
	
	public AddItemsPageObjects() {
		
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
	
	@FindBy(how = How.XPATH, using = "//a[text()='Cameras']")
	private WebElement Cameras;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[4]/a")
	private WebElement SonyItem;      
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopdata\"]/div[3]/div/div[2]/div[2]/button[1]/span")
	private WebElement AddToCart;
	

	@FindBy(how = How.XPATH, using = "(//a[text()='My Account'])[2]")
	private WebElement MyAccount2;
	
	
	@FindBy(how = How.XPATH, using = "//a[text()='logout']")
	private WebElement LogoutButton;
	
	public void clickMyAccount() {
		MyAccount.click();
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void enterEmail(String email, String password) {
		Email.sendKeys(email);
		Password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		//LoginButton.click();
		DriverUtility.clickonElement(LoginButton);
	}
	
	public void moveToCameras() throws InterruptedException {
		
		Actions a = new Actions(driver);
		a.moveToElement(Cameras).build().perform();
		Thread.sleep(3000);
	}
	
	public void moveToSonyItems() throws InterruptedException {
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(SonyItem).click().build().perform();
		//DriverUtility.moveToElementAction(SonyItem);
	//	DriverUtility.clickonElement(SonyItem);
		DriverUtility.screenShot();
		
	}
	
	public void addItemToCart() {
		AddToCart.click();
	}
	
	public void clickMyAccount2() {
		MyAccount2.click();
	}
	
	public void clickLogout() {
		DriverUtility.clickonElement(LogoutButton);
	}
}
