package webElementsMethods;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayedStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		// locator using xpath
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//		//locator using classname
//		driver.findElement(By.className("inputs displayed-class"));
//		//locator using id
//		driver.findElement(By.id("displayed-text"));
//		//locator using name
//		driver.findElement(By.name("show-hide"));
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		
		hideButton.click();
		
		if(textBox.isDisplayed())
		{
			System.out.println("text box is displayed");
			textBox.sendKeys("Welcome");
		}
		
		else 
		{
			System.out.println("text box is not displayed, clicking on show button");
			showButton.click();
			textBox.sendKeys("WelcomeAgain");
		}
		
		
		
	}

}
