package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNull {
  @Test
  public void myMethod() 
  {
	  
	  String a=null;
	  String b="Pune";
	  
	  
	  //Assert.assertNotNull(a, "Given value is null hence TC FAILED");
	  Assert.assertNull(b, "Given value is Not null hence TC is failed");
	  Assert.fail();
  }
}
