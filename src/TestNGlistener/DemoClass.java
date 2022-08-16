package TestNGlistener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGlistener.Listener.class)
public class DemoClass {
  @Test
  public void myMethod1() 
  {
	  
	  Reporter.log("myMethod1-->TC execution is started",true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("myMethod2-->TC execution is started",true);
  }
  
  @Test (dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  
	  Reporter.log("myMethod3-->TC execution is started",true);
  }
}
