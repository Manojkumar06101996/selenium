package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com"); // to() method is used to navigate to sub url
		Thread.sleep(2000);
		driver.navigate().back(); //back() is used to go backward to main url
		Thread.sleep(2000);
		driver.navigate().forward();//forward() is used to go the sub url again
		Thread.sleep(2000);
		driver.navigate().refresh();// refresh() is used to reload the page again.
		Thread.sleep(2000);
		URL url = new URL("https://www.instagram.com");
		driver.navigate().to(url);
		

	}

}
