package kiteTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.Base;
import kitePOMClasses.KiteHomePage;
import kitePOMClasses.KiteLoginPage;
import kitePOMClasses.KitePinPage;
import kiteUtility.Utility;


public class ValidateKiteUserID extends Base {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
	@BeforeClass
	public void launchBrowser()
	{
		openApplication();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserID(Utility.readDataFromExcel(0, 0));
		login.sendPassword(Utility.readDataFromExcel(0, 1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		pin.sendPin(Utility.readDataFromExcel(0, 2));
		pin.clickOnContineButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
	
	
	@Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
		String TCID="1234";
		Assert.assertEquals(home.getActualUserID(), Utility.readDataFromExcel(0, 0),"TC faled actual and Expected User ID Not matching");
		Utility.captureScreenShot(driver, TCID);
  }
	
	@AfterMethod
	public void LogOutFromKiteApp() throws InterruptedException
	{
		home.clickOnLogOutButton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
