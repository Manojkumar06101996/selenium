package BasicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import POMRepo.TaskPage;

public class ToVerifyHomepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expectedtitle = "Enter";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	LoginPage login = new LoginPage(driver);
	login.loginAction("admin", "manager");
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.titleContains("Enter"));

	HomePage home = new HomePage(driver);
	
	String actualtitle = home.verifyTitle();
	if (actualtitle.contains(expectedtitle)) {
		System.out.println("Pass ; the title is verified");
	}
	
	TaskPage task = new TaskPage(driver);
	String expectedcustomername  = "abcde795";
	task.Createcustomer(expectedcustomername);
	
	
	
	
	
	home.logout();
	
	
	
	driver.quit();
	
	}

}
