package serviceNow;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClassServiceNow{

@Test(dependsOnMethods = "serviceNow.CreateNewIncident.createNewIncident")
	public void deleteIncident() {
		
		
		WebElement existingincidents = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]"));
		String existingincident = existingincidents.getText();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(existingincident,Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]"));
		link.findElement(By.tagName("a")).click();
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();

		String result = driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
		System.out.println(result + " / Incident is deleted");
	
		
	}

}

//1. Launch ServiceNow application
//2. Login with valid credentials 
//3. Enter Incident in filter navigator and press enter
//4. Search for the existing incident and navigate into the incident
//5. Delete the incident
//6. Verify the deleted incident