package pageobjectResporitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports_Page {
	
	public Reports_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='New Report']")
	private WebElement newReportBtn;
	
	@FindBy(xpath="//span[text()='Create Chart']")
	private WebElement createRepoertBtn;

	public WebElement getNewReportBtn() {
		return newReportBtn;
	}

	public WebElement getCreateRepoertBtn() {
		return createRepoertBtn;
	}
	
	public void newReportBtnclick() {
		newReportBtn.click();
	}
	public void createRepoertBtnclick() {
		createRepoertBtn.click();
	}
}
