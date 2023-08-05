package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeadPage extends ProjectSpecificMethod {

	public FindLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public FindLeadPage enterFirstName() {
		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Devapriya");
		return this;
	}
	
	public FindLeadPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	
	public FindLeadPage clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public ViewLeadPage clickLeadList() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		return new ViewLeadPage(driver);			
	}
	
	
	public FindLeadPage enterFirstNameForMerge() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listwindowhandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listwindowhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Devapriya");
		return this;
	}
	
	
	public FindLeadPage clickFindLeadsMerge() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	
	
	public MergeLeadPage clickFirstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadPage(driver);
	}
	
	
	public FindLeadPage enterFirstName1ForMerge() {
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listwindowhandles1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(listwindowhandles1.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Princila");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
