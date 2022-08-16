package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void myMethod()
  {
	  
	  String a="Pune";
	  String b="Pune";
	  String c="Mumbai";
	  
	  //1.If a and b are equal TC should be PASSED
	  //I want to verify a equals b, equals c we will be using Hard Assert to verify
	  
	 // Assert.assertEquals(a, c,"A is not equals to C TC is failed");
	  
	  Assert.assertNotEquals(a,b,"A and B are equal hence TC failed"); 
  }
}
