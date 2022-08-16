package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Thread.sleep(2000);
		if(checkBox1.isSelected())//true-->false
		{
			System.out.println("Check Box is already selected");
		}
		
		else {
			checkBox1.click();
			System.out.println("CheckBox is selected now");
		}
	}

}
