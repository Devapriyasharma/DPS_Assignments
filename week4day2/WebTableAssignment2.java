package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableAssignment2 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		WebElement mytable = driver.findElement(By.xpath("//table[@class='attributes-list']"));
		List<WebElement> rows = mytable.findElements(By.tagName("tr"));
		System.out.println("Number of rows: " + rows.size());
		List<WebElement> columns = mytable.findElements(By.tagName("th"));
		System.out.println("Number of columns: " + columns.size());
	}

}
//Assignment2:
//============
//1. Launch the URL https://html.com/tags/table/
//2. Get the count of number of rows
//3. Get the count of number of columns