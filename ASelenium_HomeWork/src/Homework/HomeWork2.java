package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://Amazon.in");
		System.out.println(driver.getCurrentUrl());
		System.out.print(driver.getTitle());
		//WebElement check = driver.findElement(By.id("email"));
		/*System.out.println("to vrify login page is disply   :"+check.isDisplayed());
		
		WebElement check2 = driver.findElement(By.id("pass"));
		System.out.println("to vrify pass block is disply   :"+check2.isDisplayed());
		
		WebElement check3 = driver.findElement(By.id("loginbutton"));
		System.out.println("to vrify login button is disply   :"+check3.isDisplayed());
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();*/
		
		
		

	}

}
