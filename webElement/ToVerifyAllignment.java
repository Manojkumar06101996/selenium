package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAllignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/SeleniumClass.html");
		
		Point usernamepos = driver.findElement(By.id("123")).getLocation();
		Point passwordpos = driver.findElement(By.id("456")).getLocation();
		
		int usernamestartx = usernamepos.getX();
		int passwordstartx = passwordpos.getX();
		System.out.println(usernamestartx);
		System.out.println(passwordstartx);

		
		int z = 0;
		z= usernamestartx-passwordstartx;
		System.out.println(z);
		/*if (usernamestartx == passwordstartx) {
			System.out.println("pass the textfields are alligned");
		}
		else
			System.out.println("failed "); 
*/
	}

}