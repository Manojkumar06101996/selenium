package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 extends assignment1{

		// Creating an instance of Firefox Browser
		WebDriver driver;
		String qatechhubUrl = "http://qatechhub.com";
		String facebookUrl = "https://www.facebook.com";

		
		

		public static void main(String[] args) {
			Assignment2 assignment = new Assignment2();

			assignment.invokeBrowser();
			assignment.navigatecommands(); 
										
		}

	}
	
