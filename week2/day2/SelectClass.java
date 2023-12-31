package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		//setup the driver path 
		ChromeDriver driver=new ChromeDriver();
		//Load the url  
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//find the element   enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the element of password enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//find element click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the title of current open page

		//  String title = driver.getTitle();    //ctrl+2+l
		System.out.println(driver.getTitle());
		//Find the Element crm/sfa and click the element
		driver.findElement(By.partialLinkText("CRM")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		//clilck lead
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.partialLinkText("Create")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
		//Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");
		//Handle the drop down
		// Step:1  Locate the dropdown web element
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));  //ctrl+2
		// Step:2  Instantiate Select class pass WebElement
		Select drop1=new Select(source);
		// Step:3  Call select class method to pick the option from dropdown
		//M1--->drop1.selectByIndex(3);
		//M2--->drop1.selectByValue("LEAD_EMPLOYEE");
		drop1.selectByVisibleText("Partner");//M3

		//click createButton
		driver.findElement(By.name("submitButton")).click();


		//close the browser
		//driver.close();
		
	}
	
}
