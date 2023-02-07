package runTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class ClassA {

	public static void test(WebDriver driver,String url ,String expectedtitle) {
		driver.manage().window().maximize();
		driver.get(url);
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			System.out.println("Pass: the test is verified");
		}
		else {
			System.out.println("Fail: the test is Failed.");
		}
		
		driver.quit();
	}

}
