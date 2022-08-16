package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://vctcpune.com/");
		
		Thread.sleep(5000);
		//navigate: this method is use to open an application, move forward, backward & refresh the webpage.
//		driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(5000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(5000);
//		
//		driver.navigate().forward();
//		driver.navigate().refresh();
		//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(title);
		
		
		//getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
