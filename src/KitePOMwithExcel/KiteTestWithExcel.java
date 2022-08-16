package KitePOMwithExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String UN = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		
		
		KiteLoginPage login= new KiteLoginPage(driver);
		
		login.sendUserID(UN);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLoginButton();
		
		
		Thread.sleep(1000);
		
		KitePinPage pin= new KitePinPage(driver);
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		pin.clickOnContineButton();
		
		Thread.sleep(1000);
		
		KiteHomePage home= new KiteHomePage(driver);
		
		home.validateUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnLogOutButton();
		
		Thread.sleep(500);
		
		driver.close();
		
		
	}

}
