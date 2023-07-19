package serviceNow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateExistingIncident extends BaseClassServiceNow {
	
@Test(dependsOnMethods = "serviceNow.CreateNewIncident.createNewIncident")

	public  void updateExistingIncident() {
				
		WebElement existingincidents = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]"));
		String existingincident = existingincidents.getText();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(existingincident,Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]"));
		link.findElement(By.tagName("a")).click();
		
		WebElement incidenturgency = driver.findElement(By.name("incident.urgency"));
		Select urgency = new Select(incidenturgency);
		urgency.selectByIndex(0);
		
		WebElement incidentstate = driver.findElement(By.name("incident.state"));
		Select state = new Select(incidentstate);
		state.selectByIndex(1);
		
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		WebElement link1 = driver.findElement(By.xpath("//table[@id='incident_table']/tbody/tr[1]/td[3]"));
		link1.findElement(By.tagName("a")).click();
		
		WebElement incidenturgencyselect = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select select = new Select(incidenturgencyselect);
		WebElement selected = select.getFirstSelectedOption();
		String Selectedurgency = selected.getText();
		
		System.out.println("Selected urgency: "+ Selectedurgency);
		
		WebElement incidentstateselect = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select select1 = new Select(incidentstateselect);
		WebElement selected1 = select1.getFirstSelectedOption();
		String Selectedstate = selected1.getText();
		
		System.out.println("Selected state:" + Selectedstate);

	}

}
//2.Update existing incident
//====================
//1. Launch ServiceNow application
//2. Login with valid credentials 
//3. Enter Incident in filter navigator and press enter "
//4. Search for the existing incident and click on the incident
//5. Update the incidents with Urgency as High and State as In Progress
//6. Verify the priority and state 