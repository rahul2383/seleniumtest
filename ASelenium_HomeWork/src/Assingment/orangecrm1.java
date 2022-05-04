package Assingment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangecrm1 {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		WebElement select =driver.findElement(By.name("searchSystemUser[userType]"));
		Select s1 = new Select(select);
		List<WebElement>k1 =s1.getOptions();
		for(int i = 0;i<k1.size();i++) {
			WebElement s = k1.get(i);
		  
			System.out.println(s.getText());
		}
		driver.navigate().back();
	}

}
