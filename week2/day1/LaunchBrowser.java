package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// setup the driver path
		ChromeDriver driver = new ChromeDriver ();
//		Load the url
		driver.get("https://dev31913.service-now.com/");
//maximize the browser
		driver.manage().window().maximize();
		
		  //find the element   enter the username
		driver.findElement(By.id("user_name")).sendKeys("admin");
		   //find the element of password enter password
		driver.findElement(By.id("user_password")).sendKeys("q+NozS5Qe8!E");
		  //find element click login button
		driver.findElement(By.id("sysverb_login")).click();
		
		
		
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
        
		
		
//get the title of current open page
        
        //  String title = driver.getTitle();    //ctrl+2+l
        System.out.println(driver.getTitle());
	}

}
