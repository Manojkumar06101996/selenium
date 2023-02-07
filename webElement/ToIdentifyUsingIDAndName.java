package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingIDAndName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/LENOVO/Desktop/SeleniumClass.html");
	WebElement username = driver.findElement(By.id("123"));
	WebElement password = driver.findElement(By.name("xyz"));
	WebElement rememberme = driver.findElement(By.id("007"));
	
	username.sendKeys("Captain Jack Sparrow");
	password.sendKeys("black perl");
	rememberme.click();
	driver.findElement(By.className("selenium")).click();
	Thread.sleep(2000);
	//driver.findElement(By.linkText("gotoSelenium")).click();
	driver.findElement(By.partialLinkText("go to Selenium")).click();
	driver.quit();
	}

}
