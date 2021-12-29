package intial;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericUtility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectResporitry.HomPage;
import pageobjectResporitry.LoginPage;

@Listeners(GenericUtility.Listeners_code.class)
@Test(groups="HomePage-Verification")
public class Login extends BaseClass{


@Test(priority=2,groups="bvt") 
 public void HomePagetitle() {
	
	
	String title_actual= driver.getTitle();
	String title_expected ="actiTIME -  Enter Time-Track";
	
	//verifying titile 
	
	SoftAssert sfa = new SoftAssert();
	sfa.assertEquals(title_actual, title_expected);

 }

//TestCase 2
@Test(priority=1,groups="regression")
public void  Task_pageVerifying() {
	HomPage hp = new HomPage(driver);
	if (hp.getTaskBtn().isDisplayed()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}


//TestCase 3
@Test(priority=2,groups="bvt")
public void Report_PageVerfying() {
	HomPage hp = new HomPage(driver);
	if(hp.getReportBtn().isDisplayed()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
//TestCase 4
@Test(priority=5,groups="regression")
public void userPage_verfying() {
	HomPage hp = new HomPage(driver);
	if(hp.getUserBtn().isDisplayed()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}

//TestCase5
@Test(priority=0,groups={"bvt","regression"})
public void logoutbtn_verfying() {
	HomPage hp = new HomPage(driver);
	if(hp.getLogOutBtn().isDisplayed()) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}

@Test(enabled=false)//enabled false meanis skippking the test Case
public void SkipTestCase() {
	System.out.println("Skkipd TC");
}

public void SkipTestCaseForcefully() {  
	System.out.println("Skkipd TC");
	throw new SkipException("Skkipping the TestCase");   //forcefully skipping the TestCase
}

boolean datasetup = false;  //condition
public void SkipTestCaseonCondition() {  
	System.out.println("Skkipd TC on condition");
	if(datasetup==true) {
		System.out.println("Excecute the TC");
	}
	else {
		throw new SkipException("Skkipping the TestCase");   //skipping the TestCase on condition
	}
}
	
}