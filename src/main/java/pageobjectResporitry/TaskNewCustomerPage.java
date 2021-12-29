package pageobjectResporitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule 1
public class TaskNewCustomerPage {
	//rule 4
		public TaskNewCustomerPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	//rule 2
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'and@autocomplete='off']")
	private WebElement custnrNameEdit;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descrytionEdit;
	
	@FindBy(xpath="//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[1]/div[3]")
	private WebElement selectcustmrBtn;
	
	@FindBy(xpath="//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[2]/div/div[1]/div/div[2]")
	private WebElement BigBangOption;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement CreatecustmrBtn;
	
	@FindBy(xpath="//div[@id='customerLightBoxCloseButton']")
	private WebElement customerLightBoxCloseButton;

	

	//rule 3
	public WebElement getCustnrNameEdit() {
		return custnrNameEdit;
	}

	public WebElement getDescrytionEdit() {
		return descrytionEdit;
	}

	public WebElement getSelectcustmrBtn() {
		return selectcustmrBtn;
	}

	public WebElement getBigBangOption() {
		return BigBangOption;
	}
	
	
	public WebElement getCreatecustmrBtn() {
		return CreatecustmrBtn;
	}
	
	public WebElement getCustomerLightBoxCloseButton() {
		return customerLightBoxCloseButton;
	}

	//rule 5
	public void custnrNameEdit1(String name) {
		custnrNameEdit.sendKeys(name);
	}
	
	public void descrytionEdit1(String discrypt) {
		descrytionEdit.sendKeys(discrypt);
	}
	
	public void selectcustmrBtnclick() {
		selectcustmrBtn.click();
	}
	
	public void BigBangOptionSelect() {
		BigBangOption.click();
	}
	
	public void CreatecustmrBtnclick() {
		CreatecustmrBtn.click();
	}
	
	public void customerLightBoxCloseButtonclick() {
		customerLightBoxCloseButton.click();
	}
}
