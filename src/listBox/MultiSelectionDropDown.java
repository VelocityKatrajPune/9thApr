package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		//1.
		WebElement multiSelect = driver.findElement(By.id("cars"));
		
		//I want to check if this is multiple selectable or not
		
		Select s= new Select(multiSelect);
		
		System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		Thread.sleep(200);
		s.selectByVisibleText("Opel");
		Thread.sleep(200);
		s.selectByValue("audi");

		Thread.sleep(200);
		// deselect particular value
		
		//s.deselectByIndex(0);
		
		s.deselectAll();
		
	}

}
