package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void myMethod()
  {
	  boolean a=true;
	  boolean b=false;
	
	  
	  
	 //I want verify a value is true or not
	  
	//  Assert.assertTrue(b, "TC is failed");
	  
	  Assert.assertFalse(b, "TC is failed  Value is true");
	  
  }
}
