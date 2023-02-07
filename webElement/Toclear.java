package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toclear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement username = driver.findElement(By.name("email"));
		
		username.sendKeys("rajesh");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("suraj");
		driver.quit();
	}

}
