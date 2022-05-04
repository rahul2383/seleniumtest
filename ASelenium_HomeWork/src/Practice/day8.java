package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8 {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		d1.get("https:www.amazon.in");
		//System.out.println(d1.getTitle());
		String acepted = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(d1.getTitle().equals(acepted)) {
			System.out.println("test pass");
		}	
		else {
			System.out.println("test fail");
		}
		WebElement searchbox =d1.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("123456789");
		Thread.sleep(2000);
		searchbox.clear();
		searchbox.sendKeys("abcd");
		Thread.sleep(2000);
		searchbox.clear();
		searchbox.sendKeys("asdfg12345");
		Thread.sleep(2000);
		searchbox.clear();
		
	//	d1.close();

	}

}
