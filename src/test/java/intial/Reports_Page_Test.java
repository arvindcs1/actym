package intial;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import pageobjectResporitry.HomPage;
import pageobjectResporitry.Reports_Page;

public class Reports_Page_Test extends BaseClass{

	@Test
	public void movingtoReports() {
		HomPage hp = new HomPage(driver);
		hp.reportBtnclick();
	
		
		Reports_Page rp = new Reports_Page(driver);
		if(rp.getNewReportBtn().isDisplayed()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
