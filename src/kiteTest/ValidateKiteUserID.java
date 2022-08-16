package kiteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateKiteUserID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		userID.sendKeys("ELR321");
		passWord.sendKeys("Dhana1111");
		loginButton.click();
		
		Thread.sleep(200);
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
		pin.sendKeys("982278");
		continueButton.click();
		Thread.sleep(200);
		WebElement UiD = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String expectedUserID="ELR321";
		String actualUserID = UiD.getText();
		
		if (expectedUserID.equals(actualUserID))
		{
			System.out.println("Actual and Expected UserID are matching TC is Passed");
		}
		
		else {
			System.out.println("Actual and Expected UserID are not matching TC is Failed");

		}

		UiD.click();
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		driver.close();
	}
	
	

}
