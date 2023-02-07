package actionsClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TogetNavAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		List<WebElement> alllnks = driver.findElements(By.xpath("//a[@class = 'nav-link']"));
	    Actions action = new Actions(driver);
	    action.keyDown(Keys.CONTROL).perform();
	    
	    for (WebElement link : alllnks) {
			link.click();
			System.out.println(link.getText());
			
			/*if(link.getText().equals("Downloads") ||link.getText().equals("Documentation"))
			{//to click only 2 links
				link.click();
			}*/
		}
	    action.keyUp(Keys.CONTROL).perform();
	    
		
	}

}
