package testNGXMLStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testXML2 {
	@Test
	  public void d()
	  {
		  Reporter.log("d method is running",true);
	  }
	  @Test
	  public void e()
	  {
		  Reporter.log("e method is running",true);
	  }
	  @Test
	  public void f()
	  {
		//  Assert.fail();
		  Reporter.log("f method is running",true);
	  }
}
