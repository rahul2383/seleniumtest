package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver d1 = new ChromeDriver();
		d1.get("https://www.saucedemo.com/");
		WebElement k1 = d1.findElement(By.cssSelector(".login_credentials"));
		
		String k = k1.getText();
		
		k.replace("Accepted usernames are:", "");
	//	k.replace("Accepted usernames are:", "");
		
		
		
		
		/*d1.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d1.get("http://demo.automationtesting.in/Register.html");
		d1.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
	
	/*	WebElement k1 =d1.findElement(By.id("username"));
		k1.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		k1.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		d1.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"));*/
		
		
		

	}

}
