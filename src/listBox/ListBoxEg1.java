package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		//1.	Identify list box to be handled and store it in reference variable

		WebElement listBox = driver.findElement(By.id("dropdown-class-example"));
	
		//2.	Create an object of Select class which will accept WebElement as argument
		
		Select s= new Select(listBox);
		
		//3.	By using one of the select class methods we can select values form list box like 
//		1. selectByVisibleText: selectByVisibleText(String arg0) 
//		2. selectByIndex: selectByIndex(int arg0) 
//		3. selectByValue: selectByValue(String arg0)
		
		//selectByIndex: selectByIndex(int arg0) 
	//	s.selectByIndex(2);
		
		//selectByVisibleText: selectByVisibleText(String arg0) 

		//s.selectByVisibleText("Option2");
	
	//selectByValue: selectByValue(String arg0)
		
		s.selectByValue("option3");
	}

}
