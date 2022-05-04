package Homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tShirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//System.out.println(m.getText());
		//m.click();
		//List a =driver.findElements(By.className("GridPresets-module__gridPresetImageSection_2p68sRHExZZwCJorBe2_N3"));
		//for(int b=0 ; b<a.size();b++) {
			//System.out.println(a.get(b));
	//	}
		
		//driver.findElement(By.partialLinkText("Customer")).click();
		
		
	}

}