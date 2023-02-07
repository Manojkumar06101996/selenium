package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "username")
	WebElement usernameTextField;
	
	@FindBy(name ="pwd")
	WebElement passwordfield;
	@FindBy(xpath = "//div[text() = 'Login ']")
	
	WebElement loginButton;
	
	public void loginAction(String username, String password)
	{
		usernameTextField.sendKeys(username);
		passwordfield.sendKeys(password);
		loginButton.click();
	}
	

}
