package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		int startx = pos.getX();
		int starty = pos.getY();
		System.out.println("the start x is : "+startx+"\n"+"the start y is : "+starty);
		
		
	}

}
