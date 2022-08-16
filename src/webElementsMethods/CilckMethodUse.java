package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CilckMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		Thread.sleep(2000);
		//Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
	}

}
