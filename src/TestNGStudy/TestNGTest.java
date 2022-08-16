package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGTest {
  @Test
  public void lauchKite()
  {
//	  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
	  
	  	System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
  }
  
}
