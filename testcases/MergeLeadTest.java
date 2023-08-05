package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificMethod {	
	@Test		
	public void runMergeLead() throws InterruptedException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUserName()
        .enterPassword()
        .clickLogin()
        .clickCRMSFA()
        .clickLeads() 
        .clickMergeLead()
        .clickFromLead()
        .enterFirstNameForMerge()
        .clickFindLeadsMerge()
        .clickFirstLead()
        .clickToLead()
        .enterFirstName1ForMerge()
        .clickFindLeadsMerge()
        .clickFirstLead()
        .clickMerge()
        .verifyCompanyNameAfterMerge();
        
        
        
		
	}

}
