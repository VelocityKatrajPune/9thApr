package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getSize());
		
		//to set size we need to create object of Dimension class and pass width and height as parameters 
		
		Dimension d= new Dimension(800, 80);
		
		//call setSize method which will ask you object of Dimension class
		driver.manage().window().setSize(d);
	
	

	}

}
