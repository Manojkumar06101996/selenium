package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginIntoActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder ='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder ='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text() = 'Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'container_tasks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class ='logout']")).click();
		driver.quit();
		

	}

}
