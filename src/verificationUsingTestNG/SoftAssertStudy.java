package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertStudy {
	@Test
	public void myMethod()
	  {
		String a="test";
		String b=null;
		
		SoftAssert soft= new SoftAssert();// created object of soft Assert
		
		soft.assertNotNull(b,"TC is failed value is Null");
		soft.assertNull(a, "TC is failed value is Not Null");
		
		soft.assertAll();
		
//		Assert.assertNotNull(b, "TC is failed value is Null");
//		Assert.assertNull(a, "TC is failed value is not Null");
		  
	  }
}
