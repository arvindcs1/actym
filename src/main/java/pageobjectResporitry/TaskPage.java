package pageobjectResporitry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {    //rule 1
	
	//rule 4
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Rule 2
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewBtn;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement NewCustomerBtn;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement NewProjectBtn;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement NewTasksBtn;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importTasksBtn;

	//Rule 3
	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return NewCustomerBtn;
	}

	public WebElement getNewProjectBtn() {
		return NewProjectBtn;
	}

	public WebElement getNewTasksBtn() {
		return NewTasksBtn;
	}

	public WebElement getImportTasksBtn() {
		return importTasksBtn;
	}
	
	//rule 5
	public void addnewBtnclick() {
		addnewBtn.click();
	}
	
	
	public void NewCustomerBtnclick() {
		NewCustomerBtn.click();
	}
	
	public void NewProjectBtnclick() {
		NewProjectBtn.click();
	}
	
	public void NewTasksBtnclick() {
		NewTasksBtn.click();
	}
	
	public void importTasksBtnclick() {
		importTasksBtn.click();
	}
	

}
