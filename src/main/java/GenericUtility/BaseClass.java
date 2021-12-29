package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjectResporitry.HomPage;
import pageobjectResporitry.LoginPage;

public class BaseClass {
	// create object of other class(available in Generic Library)in Base class so that after extending only Base class to Test Script we can access all other class 
          public Java_Utility ju = new Java_Utility();
	      public ExcelFileReader efr = new ExcelFileReader();
	      public Properfile_Reader prf = new Properfile_Reader();
	      public WebdriverUtility wdu = new WebdriverUtility();
	      
	      public static Logger logger = LogManager.getLogger(BaseClass.class);
	     public WebDriver driver;
	      
	     public static WebDriver staticdriver;
	     
	      @BeforeClass(alwaysRun=true)
	      public void launchBrowser() throws Throwable {
	    	   
		    	System.out.println("....Browser Launching.......");
		    	
		    	String BROWSER=prf.getPropertydata("browser");
		    	String URL=prf.getPropertydata("url");
		    	
		    	if(BROWSER.equalsIgnoreCase("chrome")) {
		    		
		    		 driver=new ChromeDriver();
		    	}
		    	else if(BROWSER.equalsIgnoreCase("firefox")) {
		    		 
		    		 driver=new FirefoxDriver();
		    	}
		    	else {
		    		System.out.println("....Invalid browser.....");
		    	}
		    	wdu.imp_wait(driver);
		    	wdu.max_window(driver);
		    	logger.info("Opening URL");
		    	driver.get(URL);
		    	staticdriver = driver;
		    }
	      
	      @BeforeMethod(alwaysRun=true)
	      public void loginToApp() throws Throwable {
	    	  System.out.println("......Logging To Actitime app......");
	    	  logger.info("logging in");
	    	  String USERNAME = prf.getPropertydata("username");
	    	  String Password = prf.getPropertydata("password");
	    	  LoginPage lp = new LoginPage(driver);
	    	  lp.loginactym(USERNAME, Password);
	      }
	      
	      @AfterMethod(alwaysRun=true)
		    public void logOutApp() {
		    	System.out.println("...Log out from the application");
		    	logger.info("Logging out");
		    	HomPage hp=new HomPage(driver);
		    	hp.logOutBtnclick();
		    }
	      
	      @AfterClass(alwaysRun=true)
		    public void closeBrowser() {
		    	System.out.println("...closing Browser.....");
		    	logger.info("Logging out");
		    	driver.close();
		    }
	      //to take screenshot 
	      public void getScreenshot() throws IOException {
	 		 Date current_date = new Date();
	 		 String screenshotfile = current_date.toString().replace(" ", "_").replace(":", "_");
	 		 File srcfile=((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
	 		 FileUtils.copyFile(srcfile, new File(".//screenshot//"+screenshotfile+".png"));
	 		  
	 	 }
}
