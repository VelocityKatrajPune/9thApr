package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		Thread.sleep(1000);
		
		//identify element and store in ref variable
		
		WebElement year = driver.findElement(By.id("year"));
		
		//create object of select class
		
		Select s1= new Select(year);
		
		//use any of Select class method
		
		//s1.selectByVisibleText("1989");
		
		System.out.println(s1.isMultiple());
		
		// using for loop for multiple times operations
		
		for(int i=0;i<=9;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(200);
		}
		
		for(int i=9;i>=0;i--)
		{
			s1.selectByIndex(i);
			Thread.sleep(300);
		}
			

	}

}
