package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NetflixLoginpracticePageDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.netflix.com/browse");
		driver.findElement(By.id("id_userLoginId")).sendKeys("manoj.mk.kumar123@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("M@n0j1693");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign In')]")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'manoj')]/ancestor::a")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.xpath("//a[@aria-label ='Central Intelligence' ]")).click();
		driver.findElement(By.xpath("//a[@aria-label = 'Resume' ]")).click();
		
		

	}

}
