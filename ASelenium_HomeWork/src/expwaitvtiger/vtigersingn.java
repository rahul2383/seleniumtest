package expwaitvtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vtigersingn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d1.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println(d1.getTitle());
		d1.findElement(By.id("username")).clear();
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.id("password")).clear();
		d1.findElement(By.id("password")).sendKeys("Test@123"); 
		d1.findElement(By.cssSelector("button.button.buttonBlue")).click();
		System.out.println(d1.getTitle());
		
		
	}

}
