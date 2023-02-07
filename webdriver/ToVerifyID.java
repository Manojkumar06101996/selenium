package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String windowIdForGoogle = driver.getWindowHandle();
		driver.navigate().to("https://www.facebook.com");
		String windowIdForFacebook = driver.getWindowHandle();
		System.out.println("window id for google"+windowIdForGoogle+"\n"+"windowId for facebook"+windowIdForFacebook);;
	}

}
