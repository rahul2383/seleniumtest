package Assingment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifmail {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		d.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement k =d.findElement(By.tagName("span"));
		System.out.println(k.getText());
		/*d.navigate().to("https:redbus.com/");
		//Thread.sleep(2000);
		d.findElement(By.cssSelector(".sc-dnqmqq.AZrDG>div>*:nth-child(3)")).click();
		*/
		
		
		
	}

}
