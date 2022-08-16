package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExolicitWaitStudy {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com//");
		// find the element to for which we are waiting and store in ref variable
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		 // create object of WebDriverWait class and pass driver object and time in units as parameters
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(800));
		
		// using WebDriverWait object call the method until and select the condition
		
		w.until(ExpectedConditions.elementToBeClickable(checkBox1));
		
		

	}

}
