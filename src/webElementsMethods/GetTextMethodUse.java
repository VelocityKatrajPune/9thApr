package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
//getText:  This method is use to get text present in a webpage. Return type of getText function is String.
		String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		
		System.out.println(text);
		
		
		 WebElement myElement = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	
		 System.out.println(myElement.getText());
	
	
	}

}
