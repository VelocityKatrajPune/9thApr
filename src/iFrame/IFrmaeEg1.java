package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrmaeEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		// selenium focuses default on main page
		// we need to switch selenuim focus from main page to frame
		driver.switchTo().frame("iframeResult");// this point will change focus from main page to iframe
		
		Thread.sleep(2000);
		//this element is present in I frame
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time.')]")).click();

		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	}

}
