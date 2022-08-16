package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base
{
	protected WebDriver driver;
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching Kite APP",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
