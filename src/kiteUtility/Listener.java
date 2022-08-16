package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener 
{

	BaseNew b = new BaseNew();

	public void onTestStart(ITestResult result) 
	{
	
		Reporter.log("TC execution is started "+result.getName(),true);
	}
	
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC execution is skipped "+result.getName(),true);
	}
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC execution is failed "+result.getName(),true);
		try {
			b.captureScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC execution is successful "+result.getName(),true);
	}
	
}
