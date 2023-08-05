package testcases;



import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateTest extends ProjectSpecificMethod {

	@Test
	public void runCreateLead() {
		LoginPage lp =new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.ClickCreateLeadButton()
		.verifyFirstName();
	}
	
	
	
}
