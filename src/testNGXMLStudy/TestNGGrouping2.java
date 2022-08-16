package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping2 {
	@Test(groups = {"sanity","regression"} )
	  public void f()
	  {
		  Reporter.log("f method is running",true);
	  }
	  @Test
	  public void g()
	  {
		  Reporter.log("g method is running",true);
	  }
	  @Test(groups = {"regression"})
	  public void h()
	  {
		  Reporter.log("h method is running",true);
	  }
	  @Test
	  public void i()
	  {
		  Reporter.log("i method is running",true);
	  }
}
