package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions choose =  new Actions(driver);
		choose.moveToElement(brands).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='filter-name ' and text()='Hair']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='filter-name 'and text()='Hair Care']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title' and text()='Shampoo']")).click();
//		
		String filtervalue = driver.findElement(By.xpath("//span[@class='filter-value' and text()='Shampoo']")).getText();
		if (filtervalue.equals("Shampoo")) {
			System.out.println("Filter is applied with Shampoo");
		} else {
			System.out.println("Filter is not applied with Shampoo");
		}
		driver.findElement(By.xpath("//span[@class='title ' and text()= 'Concern']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='title' and text()='Color Protection']")).click();
//		driver.findElement(By.xpath("//div[text()='L'Oreal Paris Colour Protect Shampoo With UVA & UVB For Colo...']")).click();
		driver.findElement(By.xpath("//div[@class='css-43m2vm']/img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowslist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowslist.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String prize = driver.findElement(By.xpath("(//span[text()='MRP:']/following-sibling::span)[1]")).getText();
		System.out.println(prize);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		driver.switchTo().frame(0);
		String grandtotal = driver.findElement(By.xpath("((//span[text()='Grand Total'])/preceding::span)[14]")).getText();
		System.out.println("Grand Total: " + grandtotal);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//After this step, Continue as guest option was not shown to me in the website.
	}

}


//Assignment 1:Nykaa
//===================
//1) Go to https://www.nykaa.com/
//2) Mouseover on Brands and Search L'Oreal Paris
//3) Click L'Oreal Paris
//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
//5) Click sort By and select customer top rated
//6) Click Category and click Hair->Click haircare->Shampoo
//7) Click->Concern->Color Protection
//8)check whether the Filter is applied with Shampoo
//9) Click on L'Oreal Paris Colour Protect Shampoo
//10) GO to the new window and select size as 175ml
//11) Print the MRP of the product
//12) Click on ADD to BAG
//13) Go to Shopping Bag 
//14) Print the Grand Total amount
//15) Click Proceed
//16) Click on Continue as Guest
//17) Check if this grand total is the same in step 14
//18) Close all windows
//
