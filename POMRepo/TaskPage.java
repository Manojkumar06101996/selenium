package POMRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	WebDriver driver;
	
	public TaskPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "container_tasks")
	WebElement taskpage;
	
	@FindBy(xpath = "//div[text() = 'Add New']")
	WebElement addnewbutton;
	
	@FindBy(xpath = "//div[text() = '+ New Customer']")
	WebElement newCustomerbutton;
	@FindBy(xpath = "(//input[@placeholder = 'Enter Customer Name'])[2]")
	WebElement customernametxt;
	@FindBy(xpath = "//div[text() = 'Create Customer']")
	WebElement createcustomer;
	
	
	
	public void Createcustomer(String customername)
	
	{
		
		taskpage.click();
		addnewbutton.click();
		newCustomerbutton.click();
		customernametxt.sendKeys(customername);
		
		createcustomer.click();
		}
	
	
	
	
}
