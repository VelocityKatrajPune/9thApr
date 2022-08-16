package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitStudy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com//");
		
		//we want to use, implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//1
		//2

	}

}
