package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLead extends ProjectSpecificMethod {
	public MyLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
}
	public FindLeadPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}
	
	public MergeLeadPage clickMergeLead() {
    	driver.findElement(By.linkText("Merge Leads")).click();
    	return new MergeLeadPage(driver);
    }

	
}

