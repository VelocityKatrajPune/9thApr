package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com//");
		Thread.sleep(1000);
		
		WebElement seleniumPractice = driver.findElement(By.xpath("//a[contains(text(),'Click to')]"));

			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();",seleniumPractice);
		
	}

}
