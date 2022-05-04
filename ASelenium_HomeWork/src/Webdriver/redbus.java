package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#src")).sendKeys("jalgaon");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("	ul.autoFill.homeSearch>li:nth-of-type(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#dest")).sendKeys("pune");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul.autoFill.homeSearch>li:nth-of-type(1)")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#onward_cal")).click();  
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".rb-monthTable.first.last tr>td.next")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-of-type(5)>td:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#search_btn")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("div.close-primo")).click();
		Thread.sleep(3000);  
		List<WebElement> d =driver.findElements(By.cssSelector(".clearfix.bus-item-details:nth-of-type(1)>div div"));
		for(int i = 0;i<d.size();i++) {
			System.out.println(d.get(i).getText()); 
		}
		
		Thread.sleep(3000);
		WebElement travleName =driver.findElement(By.cssSelector(" .clearfix.bus-item-details>div>div:nth-child(1)>div:nth-child(1)"));
		System.out.println(travleName.getText());
	}

}
