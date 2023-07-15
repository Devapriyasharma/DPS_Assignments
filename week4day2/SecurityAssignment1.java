package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecurityAssignment1 {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
		List<WebElement> rows = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		System.out.println(rows.size());
		List<String> securitynamelist = new ArrayList<String>();
		for (int i = 1; i <= rows.size(); i++) {
			 String securitynames = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr["+i+"]/td[1]")).getText();
			 System.out.println(securitynames);
			 securitynamelist.add(securitynames);
		}
		System.out.println(securitynamelist);
		Set<String> securitynameset = new LinkedHashSet<String>(securitynamelist);
		if (rows.size()==securitynameset.size()) {
			System.out.println("No Duplicates in the security names");
		} else {
			System.out.println("Duplicates in the security names");
		}
		
	}

}
//Assignment1:
//============
//1. Launch the URL https://www.chittorgarh.com/
//2. Click on stock market
//3. Click on NSE bulk Deals
//4. Get all the Security names
//5. Ensure whether there are duplicate Security names