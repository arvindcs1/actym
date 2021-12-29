package pageobjectResporitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomPage {  //Rule 1
        
	//Rule 4
	public HomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Rule 2
	@FindBy(xpath="//div[@class='productName']/div[2]")
	private WebElement swithtoactiplans;
	
	@FindBy(id="container_tasks")
	private WebElement taskBtn;
	
	@FindBy(id="container_reports")
	private WebElement reportBtn;
	
	@FindBy(id="container_users")
	private WebElement userBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logOutBtn;

	//Rule 3
	public WebElement getSwithtoactiplans() {
		return swithtoactiplans;
	}

	
	public WebElement getTaskBtn() {
		return taskBtn;
	}

	public WebElement getReportBtn() {
		return reportBtn;
	}

	public WebElement getUserBtn() {
		return userBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
	//Rule 5 
	
	public void swithtoactiplansclick() {
		swithtoactiplans.click();
	}
	
	public void taskBtnclick() {
		taskBtn.click();
	}
	
	public void reportBtnclick() {
		reportBtn.click();
	}
	
	public void userBtnclick() {
		userBtn.click();
	}
	
	public void logOutBtnclick() {
		logOutBtn.click();
	}
}
