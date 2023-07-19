package serviceNow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncident extends BaseClassServiceNow{

@Test

	public void createNewIncident() {
		
		

		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.id("incident.short_description")).sendKeys("My second incident");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement incidenttable = driver.findElement(By.xpath("//table[@id='incident_table']"));
		List<WebElement> rows = incidenttable.findElements(By.xpath("//table[@id='incident_table']//tr"));
		List<WebElement> columns = incidenttable.findElements(By.xpath("//table[@id='incident_table']//th"));
		System.out.println(rows.size());
		System.out.println(columns.size());

		String myincident = driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]")).getText();
		System.out.println("Created Incident: " + myincident);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(myincident,Keys.ENTER);
		String Verifiedincident = driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]")).getText();
		if (myincident.equals(Verifiedincident)) {
			System.out.println("Incident created successfully");
		} else {
			System.out.println("Incident not created");
		}
	}
}

//	1. Launch ServiceNow application
//	2. Login with valid credentials 
//	3. Click -All and  Enter Incident in filter navigator and press enter
//	4. Click on Create new button and fill the manadatory fields and Click Submit
//	5. Verify the newly created incident ( copy the incident number and paste it in search field and enter then verify the instance number created or not)
