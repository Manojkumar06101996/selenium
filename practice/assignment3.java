package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	WebDriver driver ;
	
	String url = "https://www.flipkart.com";
	
	public void invokebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
	}
	
	public void getalllink()
	{
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		System.out.println("all the link present in flipkar website "+alllink.size());
		}
	public void getlinkurl()
	{
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		for (WebElement link : alllink) {
			System.out.println("link text ;"+ link.getText());
			System.out.println("link url ; "+link.getAttribute("href"));
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		assignment3 assign = new assignment3();
		assign.invokebrowser();
		assign.getalllink();
		assign.getlinkurl();

	}

}
