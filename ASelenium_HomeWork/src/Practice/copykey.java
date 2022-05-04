package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copykey {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement m1 =driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		m1.sendKeys("Rahul",Keys.chord(Keys.CONTROL,"a"));
		m1.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		WebElement a =driver.findElement(By.tagName("body"));
		WebElement m2 =driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		m2.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
	}

}
