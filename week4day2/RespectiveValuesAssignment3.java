package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RespectiveValuesAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		Thread.sleep(2000);
		WebElement librarytable = driver.findElement(By.xpath("//div[@class='render']/table"));
		List<WebElement> librariesrow = librarytable.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		List<WebElement> librariescolumn = librarytable.findElements(By.xpath("//div[@class='render']/table//th"));
//		System.out.println(librariesrow.size());
//		System.out.println(librariescolumn.size());
		for (int i = 1; i <= librariesrow.size(); i++) {
			 String libraryname = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[1]")).getText();
//			 System.out.println(libraryname);
			 if (libraryname.equalsIgnoreCase("Absolute usage")) {
				 for (int j = 1; j <= librariescolumn.size(); j++) {
					 String Absolute = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[2]/td["+j+"]")).getText();
						System.out.println(Absolute);
				}
				
			}
			
			 
		}

	}

}
//Assignment3:
//============
//1. Launch the URL https://html.com/tags/table/
//2. You have to print the respective values based on given Library
//(hint: if the library was absolute usage, then print all its value)