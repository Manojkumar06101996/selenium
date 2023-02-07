package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetWindowID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		String parentwidow =  driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allids = driver.getWindowHandles();
		
		for(String id:allids) {
			driver.switchTo().window(id);
			if(!id.equals(parentwidow))
			{
				System.out.println(id+"\n"+"Child id window"+"\n"+driver.getTitle());
			}
		}
		
		driver.switchTo().window(parentwidow);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
