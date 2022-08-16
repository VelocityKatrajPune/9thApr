package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	
	//1.
	@FindBy(xpath = "//span[@class='user-id']") private WebElement uid;

	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;

	//2.
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3.
	
	public void valiteUserId()
	{
		String expectedUserID="ELR321";
		String actualUserID = uid.getText();
		
		if(expectedUserID.equals(actualUserID))
		{
			System.out.println("Actual and Expected are matching TC is passed");
		}
		
		else {
			System.out.println("Actual and Expected are not matching TC is failed");
		}
		
	}
	
	public void logOut() throws InterruptedException
	{
		uid.click();
		Thread.sleep(200);
		logoutButton.click();
	}

}
