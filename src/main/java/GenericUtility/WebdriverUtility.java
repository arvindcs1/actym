package GenericUtility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	/*
	 * to maximixe window
	 */
	public void max_window(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/*
	 * to wait Webdriver
	 */
	public void imp_wait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
}
