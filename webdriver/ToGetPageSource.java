package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		driver.quit();
		
	}

}
