package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiviosnPopUp {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(1000);
				driver.findElement(By.name("q")).sendKeys("i phone 12");
			
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
			}
}

