package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

		WebDriver driver;
		String FacebookUrl = "https://www.facebook.com";
		String  gatechhub = "http://qatechhub.com";
		
		public void invokeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(gatechhub);
			String expectedtitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
			String actualtitle = driver.getTitle();
			
			if(actualtitle.equals(expectedtitle))
			{
				System.out.println("PASS");
			}
			else
				System.out.println("Fail");
		}
		
		public void navigatecommands()
		{
			driver.navigate().to(FacebookUrl);
			driver.navigate().back();
			String Currenturl = driver.getCurrentUrl();
			driver.navigate().forward();
			driver.navigate().refresh();
			driver.quit();
		}
	
	
	
	


}
