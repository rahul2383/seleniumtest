package Assingment;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String path ="C:\\Users\\Rahul Ashok Patil\\Downloads\\ASelenium\\Driver\\chromedriver.exe";
		System.setProperty(key, path);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> menu =driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li"));
		System.out.println(menu.size());
		for(int k =0; k<menu.size();k++) {
			WebElement  s1=menu.get(k);
			String s2 = s1.getText();
	
			System.out.println(s1.getText());
			if(s2.equals("OPPO")) {
				s1.click();
				driver.findElement(By.cssSelector("div.makers>ul>li:nth-child(4)")).click();
			
				break;
			}
			else {
				System.out.println("not match");
			}
			
			
		}
		

	}

}
