package crossBrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertestStudy {
  @Parameters("browserName")
	@Test
  public void myMethod(String Bname) 
  {
	  WebDriver driver = null;// declared driver here
	  if(Bname.equals("chrome"))
	  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	  }
	  
	  else if (Bname.equals("firefox"))
	  {
		 System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\geckodriver.exe");
		 driver= new FirefoxDriver();
	  }
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	  
  }
}
