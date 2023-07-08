package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		String result = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(result);

	}

}


//Handling Alert:
//==========
//https://www.leafground.com/alert.xhtml
//

