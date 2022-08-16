package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  
  @Test(priority = -2)
  public void b() 
  {
	  Reporter.log("b method is running",true);
  }
  @Test(priority = 0)
  public void c() 
  {
	  Reporter.log("c method is running",true);
  }
  @Test(priority = 5)
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  @Test(priority = -2)
  public void e() 
  {
	  Reporter.log("e method is running",true);
  }
  
  @Test(priority = 1)
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
}
