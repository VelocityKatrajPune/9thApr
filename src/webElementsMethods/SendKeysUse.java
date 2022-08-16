package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		//1. Sendkeys():  This method is use to enter value in the input/text field
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Welcome");
		Thread.sleep(2000);
		//2. Clear():This method is use to clear value in the text field.
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();

		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		textBox.sendKeys("abc");
		textBox.clear();
	}

}
