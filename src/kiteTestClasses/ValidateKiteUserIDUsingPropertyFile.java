package kiteTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kiteBase.Base;
import kiteBase.BaseNew;
import kitePOMClasses.KiteHomePage;
import kitePOMClasses.KiteLoginPage;
import kitePOMClasses.KitePinPage;
import kiteUtility.Utility;
import kiteUtility.UtilityNew;

@Listeners(kiteUtility.Listener.class)
public class ValidateKiteUserIDUsingPropertyFile extends BaseNew {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openApplication();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserID(UtilityNew.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityNew.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		pin.sendPin(UtilityNew.readDataFromPropertyFile("PIN"));
		pin.clickOnContineButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	}
	
	
	@Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException 
  {
		String TCID="123456";
		Assert.assertEquals(home.getActualUserID(), UtilityNew.readDataFromPropertyFile("UN1"),"TC faled actual and Expected User ID Not matching");
	
		//	Utility.captureScreenShot(driver, TCID);
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
