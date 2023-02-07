package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEnabledOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(10000);
		driver.findElement(By.id("email")).sendKeys("m.kummar.06.10.1996@gmail.com");
		Thread.sleep(3000);
		boolean enabled = driver.findElement(By.xpath("(//button[contains(text(),continue)])[1]")).isEnabled();
		if(enabled)
		{
			System.out.println("Pass : the Button enabled");
		}
		else 
			System.out.println("fail : the button is no enabled");
	}

}
