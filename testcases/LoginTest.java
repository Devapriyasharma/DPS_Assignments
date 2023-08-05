package testcases;


import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
		
		LoginPage lp =new LoginPage(driver);
		System.out.println(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLogin();
	}

}

