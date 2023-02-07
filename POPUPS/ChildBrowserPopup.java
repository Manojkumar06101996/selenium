package POPUPS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String parentdi = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text() ='actiTIME Inc.' ]")).click();
		Set<String> allids = driver.getWindowHandles();
		
		for (String id : allids) {
			
			driver.switchTo().window(id);
			if (!id.equals(parentdi)) {
				
				driver.findElement(By.xpath("//a[text() = 'Try Free']")).click();
				break;
			}
			
		}
		driver.switchTo().window(parentdi);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		
	}

}
