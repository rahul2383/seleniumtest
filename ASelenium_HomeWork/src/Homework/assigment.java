package Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assigment {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		
		String key1= "webdriver.gecko.driver";
		String path1 ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\geckodriver.exe";
		System.setProperty(key1, path1);
		
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver d1 = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		d1.get("https://www.zomato.com");
		WebElement k =driver.findElement(By.id("so"));
		String a= k.getText();
	}

}
