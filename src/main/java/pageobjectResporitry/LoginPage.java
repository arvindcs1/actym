package pageobjectResporitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule 1: creating a class
public class LoginPage {
	//Rule 4 :Creating Constructor with Webdriver refrence and PageFactory class into it
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	//Rule 2 : Find WebElement and making then private 
	@FindBy(xpath="//input[@id='username']")
	private WebElement userNameEdit;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordEdit;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;

	
	
	//Rule 3 Generating getters and setters for accessing the private WebElement
	
	public WebElement getUserNameEdit() {
		return userNameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//rule 5: Buisness logic 
	
	public void loginactym(String username, String Password) {
		userNameEdit.sendKeys(username);
		passwordEdit.sendKeys(Password);
	//	checkBox.click(); //optional
		loginBtn.click();
	}
	
	
	
	
}
