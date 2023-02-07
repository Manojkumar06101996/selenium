package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifyTheDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension dim = new Dimension(500,200); //updated the dimension class as creating its constructor and giving new two parameter.
		driver.manage().window().setSize(dim);
	}

}
