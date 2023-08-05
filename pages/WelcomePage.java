package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyHome clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome(driver);
	}
	public void clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
}
}
