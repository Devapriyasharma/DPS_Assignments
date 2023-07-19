package serviceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClassServiceNow {
	
	public ChromeDriver driver;
@BeforeMethod	
public void precondition() {
//	ChromeOptions option = new ChromeOptions();
//	option.addArguments("--disable-notifications");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://dev122152.service-now.com");
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("Testing1!");
	driver.findElement(By.id("sysverb_login")).click();
	
	Shadow shadow = new Shadow(driver);
	shadow.setImplicitWait(10);
	shadow.findElementByXPath("//div[@aria-label='All' and text()='All']").click();
	shadow.findElementByXPath("//span[text()='Incidents']").click();
	WebElement searchframe = shadow.findElementByXPath("//iframe[@title='Main Content']");
	driver.switchTo().frame(searchframe);
}

@AfterMethod
public void postcondition() {
	
	driver.close();
}

}
