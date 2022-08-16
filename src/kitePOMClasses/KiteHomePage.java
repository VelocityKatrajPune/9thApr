package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	
	//1.
	
	@FindBy(xpath = "//span[@class='user-id']")private WebElement uID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;

	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//3.
	
//	public void validateUserID(String expectedUID)
//	
//	{
//	     String actualUserID = uID.getText();
//	     
//	     if(actualUserID.equals(expectedUID))
//	     {
//	    	 System.out.println("Actual and Expected UserID's are matching TC is PASSED");
//	     }
//	     
//	     else
//	     {
//	    	 System.out.println("Actual and Expected UserID's are not matching TC is FAILED");
//
//	     }
//		
//	}
	
	public String getActualUserID()
	{
		String actualUserID = uID.getText();
		return actualUserID;
	}
	
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		uID.click();
		Thread.sleep(200);
		logOutButton.click();
		
	}


}
