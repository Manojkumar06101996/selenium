package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	@FindBy(linkText = "Logout")
	WebElement logoutlink;
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void logout() {
		logoutlink.click();
	}
	
}
