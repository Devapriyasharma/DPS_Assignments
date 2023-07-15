package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailWebTable {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("((//div[@class='selected'])/div)[1]")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement traintable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> rows = traintable.findElements(By.tagName("tr"));
		List<String> trainlist = new ArrayList<String>();
		System.out.println(rows.size()-1);
		for (int i = 2; i <= rows.size(); i++) {
			String trainnamelist = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			System.out.println(trainnamelist);
			trainlist.add(trainnamelist);	
		}
		System.out.println(trainlist.size());
		Set<String> trainset = new LinkedHashSet<String>(trainlist);
		System.out.println(trainset.size());
		if (trainlist.size()==trainset.size()) {
			System.out.println("No duplicates in trainlist");
		} else {
			System.out.println("There are duplicates in trainlist");
		}
	}
}
//Step:1-Launch the url (https://erail.in/)
//	Step:2-Enter From as MAS
//	Step:3-Enter To as MDU
//	Step:4-Uncheck sort on Date  
//	Step:5-Get the Train Names
//	(DataTable TrainList TrainListHeader stickyTrainListHeader)-TableName
//	Ensure whether there are duplicate train names
//	Hint:use size() to check duplicate