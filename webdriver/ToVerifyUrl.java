package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedurl = "facebook";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		if(actualurl.contains(expectedurl))
		{
			System.out.println("Pass ; the url is verified");
		}
		else {
			System.out.println("fail ; the url is not verified");
		}
		
		driver.quit();


		

	}

}
