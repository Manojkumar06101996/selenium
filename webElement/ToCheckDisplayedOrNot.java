package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckDisplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(15000);
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		if(displayed)
		{
			System.out.println("Pass : the element is getting displayed ");
		}
		else
		{
			System.out.println("Fail : the element is not getting displayed");
		}

	}

}
