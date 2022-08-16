package verificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PaytmRecharge {
  @Test
  public void paytmTest() 
  {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		//using implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
			
		driver.findElement(By.xpath("//div[text()='Prepaid']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	WebElement	prepaidButton=driver.findElement(By.xpath("(//i[@class='_3DxO'])[1]"));
	
	if(prepaidButton.isDisplayed())
	{
		Reporter.log("TC is passed",true);
	}
	else 
	{

		Reporter.log("TC is failed",true);
	}
	
	
  }
}
