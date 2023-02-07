package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformOnEnabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernamefield = driver.findElement(By.id("username"));
		WebElement passwordfield = driver.findElement(By.name("pwd"));
		WebElement loginbutton = driver.findElement(By.xpath("//div[text() = 'Login ']"));
	JavascriptExecutor	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].value = 'admin'", usernamefield);
	js.executeScript("arguments[0].value = 'manager'", passwordfield);
	js.executeScript("arguments[0].click()", loginbutton);

		
		

	}

}
