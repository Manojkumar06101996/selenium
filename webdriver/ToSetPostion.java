package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPostion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 Point getpost = driver.manage().window().getPosition();
		 Thread.sleep(2000);
		 System.out.println(getpost);
		// Point pos = new Point(200,50);
		 driver.manage().window().setPosition(new Point(-50,-50));
		 //System.out.println(pos);
		 

	}

}
