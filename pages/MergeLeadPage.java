package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod {

	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public FindLeadPage clickFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FindLeadPage(driver);
	}
	
	public FindLeadPage clickToLead() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadPage(driver);		
	}
	public ViewLeadPage clickMerge() {
		Set<String> Windows = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(Windows);
		driver.switchTo().window(handles.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
	}
	


}

