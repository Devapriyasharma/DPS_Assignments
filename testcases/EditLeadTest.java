package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethod {

	@Test
	public void runEditLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		
		.clickFindLeads()
		.enterFirstName()
//		.enterPhoneNumber()
		.clickLeadList()
		.clickEdit()
		.clearCompanyName()
		.enterCompanyName()
		.clickUpdateButton()
		.verifyCompanyName();				
	}

}