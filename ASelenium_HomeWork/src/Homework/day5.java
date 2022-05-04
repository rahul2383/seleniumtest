package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5 {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	    WebElement a = driver.findElement(By.cssSelector("#adminCredentialsHeader"));
	    System.out.println(a);
	}

}
