package Assingment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		List<WebElement> list =driver.findElements(By.cssSelector("div.InyRMC._3Il5oO>div>div"));
		System.out.println("size of list "+list.size());
		for(int a= 0;a<list.size();a++) {
			WebElement name = list.get(a);
			System.out.println(name.getText());
		}
		

	}

}
