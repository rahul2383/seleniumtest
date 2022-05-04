package Assingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	
	

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.3bsemi.com/15-16-d20/n-w151216-3b/3b-wsi/");
		List<WebElement> li = driver.findElements(By.cssSelector(".mbr-table-cell:nth-child(2)>ul>li"));
		System.out.println(li.size());
		for(int i = 0;i<li.size();i++) {
			WebElement s1 = li.get(i);
			System.out.println(s1.getText());
		}

	}

}
