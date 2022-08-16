package popUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUP {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		// to get single id(main page)-->
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		
		//to get multiple ids-->
		Set<String> idOfAllPages = driver.getWindowHandles();
		
		System.out.println(idOfAllPages);
		
		// convert set into ArrayList
		
		ArrayList <String>al= new ArrayList<String>(idOfAllPages);
		
		String newidOfMainPage = al.get(0);
		String idOfChildPage = al.get(1);
		
		//switch focus from main page to child page
		driver.switchTo().window(idOfChildPage);// selenium focus changed from main page to child page
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("Selenium");
		
		//driver.close();
		//driver.findElement(By.xpath("(//input[@class='field searchform-s'])[4]")).sendKeys("Selenium");
		//driver.quit();
		//to work on main page, switch selenium focus from child page to main page
		driver.switchTo().window(newidOfMainPage);
		String myText = driver.findElement(By.xpath("//p[contains(text(),' link in new tab')]")).getText();
		System.out.println(myText);
	}

}
