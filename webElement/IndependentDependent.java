package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+11&i=electronics&crid=SMBG7GKEQ9XP&sprefix=iphone+11%2Celectronics%2C314&ref=nb_sb_noss_1");
		//driver.findElement(By.xpath("//span[text() = 'Apple iPhone 12 (64GB) - (Product) RED']/../../../..//span[text() = '49,900']")).click();
		
	}

}
