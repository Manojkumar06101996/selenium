package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltTextOfImage {
	public static void main(String[] args) {
		String expectedAlTtext = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
	
	String actualAltText = driver.findElement(By.xpath("//img[@src = '//static-assets-web.flixcart.com/fk-p-linchpin-web/fk-cp-zion/img/flipkart-plus_8d85f4.png']")).getAttribute("alt");
	
	System.out.println(actualAltText);
	if(actualAltText.equals(expectedAlTtext))
	{
		System.out.println("Pass: the text is verified");
	}
	else
		System.out.println("Failed: the text is failed to show");
	}
	

}
