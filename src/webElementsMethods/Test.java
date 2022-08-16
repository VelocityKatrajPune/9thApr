package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		
		WebElement userName = driver.findElement(By.id("email"));
		
		System.out.println("Element is Displyaed status "+userName.isDisplayed());
		
		System.out.println("Element is enabled status " +userName.isEnabled());
		
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(1000);
		
		WebElement radioFemale = driver.findElement(By.xpath("//input[@value='1']"));
		
		System.out.println("Female radio button selection status is "+radioFemale.isSelected());

		radioFemale.click();
		
		System.out.println("Female radio button selection status is "+radioFemale.isSelected());
		
	}

}
