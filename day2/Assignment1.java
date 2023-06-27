package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Devapriya");
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
		driver.findElement(By.name("reg_email__")).sendKeys("9999912345");
		driver.findElement(By.id("password_step_input")).sendKeys("Test1234");
		WebElement date = driver.findElement(By.id("day"));
		Select drop1 = new Select(date);
		drop1.selectByIndex(1);
		WebElement month = driver.findElement(By.id("month"));
		Select drop2 = new Select(month);
		drop2.selectByIndex(3);
		WebElement year = driver.findElement(By.id("year"));
		Select drop3 = new Select(year);
		drop3.selectByValue("2001");
		driver.findElement(By.className("_58mt")).click();
		
		
	}

}

//Assignment:1
//
//FaceBook:
//================================
//// Step 1: Launch the chromebrowser
//// Step 2: Load the URL https://en-gb.facebook.com/
//// Step 3: Maximize the window
//// Step 4: Add implicit wait
//// Step 5: Click on Create New Account button
//// Step 6: Enter the first name
//// Step 7: Enter the last name
//// Step 8: Enter the mobile number
//// Step 9: Enter the password
//// Step 10: Handle all the three drop downs
//// Step 11: Select the radio button "Female" 
//            ( A normal click will do for this step) 