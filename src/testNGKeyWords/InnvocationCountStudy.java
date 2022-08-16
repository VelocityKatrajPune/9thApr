package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnvocationCountStudy {
  
	@Test(invocationCount = 5)
  public void myMethod() 
{
		Reporter.log("MyMethod is running",true);
 }
}
