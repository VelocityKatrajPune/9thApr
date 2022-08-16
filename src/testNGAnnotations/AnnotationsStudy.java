package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("User ID is validated",true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Login done",true);
  }
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("Log out done",true);
  }
  
  @Test
  public void testme() 
  {
	  Reporter.log("HI",true);
  }
}
