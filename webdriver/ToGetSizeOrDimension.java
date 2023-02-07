package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOrDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension dim = driver.manage().window().getSize();//to get the size of window
		System.out.println(dim);
		int width = dim.getWidth(); // to get the width of window it depend on the opening size of window
		int height = dim.getHeight();// to get the height of window it depend on the opening size of window.
		System.out.println("the width is "+width+"\n"+"the height is "+height);
	}

}
