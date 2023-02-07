//to find space between textfields
package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSpaceBetweentextfields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/SeleniumClass.html");
		
		Point usernamepos = driver.findElement(By.id("123")).getLocation();
		Point passwordpos = driver.findElement(By.id("456")).getLocation();
		int usernameheight = driver.findElement(By.id("123")).getSize().getHeight();
		int totalusernamex = usernamepos.getY()+usernameheight;
		//System.out.println(totalusernamex);

		int pwdstarty = passwordpos.getY();
		int space = pwdstarty - totalusernamex;
		System.out.println("Space :"+space);
		
		
	}

}
