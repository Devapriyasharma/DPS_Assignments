package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Devapriya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Applause");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		driver.quit();
		
		
		
		//		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=12076'])[2]")).click();
		
//		driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-hd x-grid3-cell')]//div)[1]")).click();                                                                                                                                                                      
//		driver.findElement(By.linkText("12076")).click();
//		driver.findElement(By.xpath("(//a[text()='Devapriya'])[1]")).click();
//		
		
		
		//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a
		

	}

}
/*http://leaftaps.com/opentaps/control/main

* 1	Launch the browser
* 2	Enter the username
* 3	Enter the password
* 4	Click Login
* 5	Click crm/sfa link
* 6	Click Leads link
* 7	Click Find leads
* 8	Enter first name
* 9	Click Find leads button
* 10 Click on first resulting lead
* 11 Verify title of the page
* 12 Click Edit
* 13 Change the company name
* 14 Click Update
* 15 Confirm the changed name appears
* 16 Close the browser (Do not log out)
*/