package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
	
		public static void main(String[] args) {
			//set the path and launch the browser
					ChromeDriver  driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.leafground.com/waits.xhtml");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
	                invisible.click();
	                
	                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	                wait.until(ExpectedConditions.visibilityOf(invisible));
	                
	              
		}
}
