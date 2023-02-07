package runTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		ClassA.test(new ChromeDriver(), "https://www.selenium.dev/", "Selenium");
		ClassA.test(new EdgeDriver(), "https://www.selenium.dev/", "Selenium");

	}

}
