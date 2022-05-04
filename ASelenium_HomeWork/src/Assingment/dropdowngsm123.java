package Assingment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowngsm123 {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement>list =driver.findElements(By.cssSelector("div.nav-pages a"));
		for(int i =0;i<list.size();i++) {
			list.get(i).click();
			Thread.sleep(20000);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
	}

}
