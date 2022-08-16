package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsStudy {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		// WebDriver Methods
		//get- to enter url in browser or to open an application.
		
		driver.get("https://paytm.com/");
		
		//close: to close the current tab of the browser opened by Selenium tool.
		
	//	driver.close();
		
		//quit: to close the all the tabs present in browser opened by Selenium tool.
		
	//	driver.quit();
		
		//maximize/ minimize() - used to maximize/ minimize the browser
		
		driver.manage().window().maximize();// cascaded methods
		
		
		driver.manage().window().minimize();
	}

}
