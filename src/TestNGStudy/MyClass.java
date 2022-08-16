package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void mymethod() 
  {
	  System.out.println("HI this is written in printing statment");
	  
	  Reporter.log("HI this is written in reporter without boolean value");
	  
	  Reporter.log("HI this is written in reporter with boolean value", true);
	  
	  
  }
}
