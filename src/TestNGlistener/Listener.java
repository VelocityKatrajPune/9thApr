package TestNGlistener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	
		Reporter.log("TC execution is started "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC execution is skipped "+result.getName(),true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC execution is failed "+result.getName(),true);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC execution is successful "+result.getName(),true);
	}
	
}
