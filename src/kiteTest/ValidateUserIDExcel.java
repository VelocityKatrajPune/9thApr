package kiteTest;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserIDExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	
				System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\chromedriver.exe");
				
				File myFile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
				
				Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
				
				String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
				String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
				String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				WebElement userID = driver.findElement(By.id("userid"));
				WebElement passWord = driver.findElement(By.id("password"));
				WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

				userID.sendKeys(UID);
				passWord.sendKeys(PWD);
				loginButton.click();
				
				Thread.sleep(200);
				WebElement pin = driver.findElement(By.id("pin"));
				WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
				pin.sendKeys(PIN);
				continueButton.click();
				Thread.sleep(200);
				WebElement UiD = driver.findElement(By.xpath("//span[@class='user-id']"));
				
				String expectedUserID="ELR321";
				String actualUserID = UiD.getText();
				
				if (expectedUserID.equals(actualUserID))
				{
					System.out.println("Actual and Expected UserID are matching TC is Passed");
				}
				
				else {
					System.out.println("Actual and Expected UserID are not matching TC is Failed");

				}

				UiD.click();
				
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				
				driver.close();
			}
			
			

		

	
	
}
