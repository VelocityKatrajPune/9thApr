package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		KiteLoginPage login= new KiteLoginPage(driver);
		
		login.sendUserId();
		login.sendPassword();
		login.clickOnLoginButton();
		
		Thread.sleep(200);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(200);
		KiteHomePage home= new KiteHomePage(driver);
		
		home.valiteUserId();
		home.logOut();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
