//to check whether the textfields are overlapping or not s
package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverlappingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/SeleniumClass.html");
		
		Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("456")).getRect();
		
		int usernameEndY = usernameRect.getHeight()+usernameRect.getY();
		int passwordstarty = passwordRect.getY();
		
		if(passwordstarty>=usernameEndY)
		{
			System.out.println("Pass: the textfields are not overlapping");
		}
		else
			System.out.println("failed: the textfields are overlapping");

	}

}
