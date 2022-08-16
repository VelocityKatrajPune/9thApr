package serialOrParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	 @Test
	  public void paytmLaunch()
	  {
		  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://paytm.com/");
	  }
}
