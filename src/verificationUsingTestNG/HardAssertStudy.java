package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void myMethod()
  {
	String a="test";
	String b=null;
	
	Assert.assertNotNull(b, "TC is failed value is Null");
	Assert.assertNull(a, "TC is failed value is not Null");
	  
  }
}
