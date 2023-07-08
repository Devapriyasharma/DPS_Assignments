package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		driver.findElement(By.id("com-hextom-smartpushmarketing-popup-close-popup-push")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='grid-image']")).click();
//		driver.findElement(By.id("com-hextom-smartpushmarketing-popup-close-popup-push")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("wk_zipcode")).sendKeys("626124");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']/span")).click();	
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();
		
	}

}
//Assignment 2
//--------------------
//1. Load https://buythevalue.in/
//2. Click on first product (eg: Hamdard Hing - 50GM)
////Handle Frame
//3. Close chat widget
//4. Enter the pincode 
//5. Click on Check
//6. Click on ADD TO CART
//7. Click on View
//8. Click on CHECK OUT
////Handle alert
//9. Accept the alert