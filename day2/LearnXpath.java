package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();
	    //wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("peppa pig");
	    driver.findElement(By.id("search-icon-legacy")).click();
	    
	}

}
