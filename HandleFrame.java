package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//div[@class='card'])[3]/iframe")));
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		System.out.println(driver.findElement(By.tagName("button")).getText());
	}

}
//Handling Frame:
//===========
//"https://www.leafground.com/frame.xhtml"