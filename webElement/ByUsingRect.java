package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/SeleniumClass.html");
		
		Rectangle usernameRect = driver.findElement(By.id("123")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("456")).getRect();
		
		int username = usernameRect.getHeight()+usernameRect.getY();
		System.out.println(username);
		int passwordstarty = passwordRect.getY();
		int space = passwordstarty - username;
		System.out.println("space ; "+space);
		
		
		

	}

}
