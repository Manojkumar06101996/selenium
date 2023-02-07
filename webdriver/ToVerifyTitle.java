package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {
	public static void main(String[] args) {
		
		String expectedtitle ="Selenium"; 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.selenium.dev/");
	 
	String actualtitle = driver.getTitle();
	if(actualtitle.equals(expectedtitle)) {
		System.out.println("pass ; the title is verified");
		
	}
	else {
		System.out.println("failed");
	}
	 
		
		
	}

}
