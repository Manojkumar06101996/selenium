package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedresult = "Google";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualresult = driver.getTitle();
		
		if (actualresult.equals(expectedresult)) {
			System.out.println("Pass; the title is verified");
		}
		else {
			System.out.println("fail ");
		}
		
		
		
	}

}
