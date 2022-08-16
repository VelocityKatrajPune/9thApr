package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsStudy
{
@Test(dependsOnMethods = {"c"})
public void b() 
{
	  
	  Reporter.log("b method is running",true);
}
@Test(timeOut = 100)
public void c() throws InterruptedException 
{
	Thread.sleep(190);
	Reporter.log("c method is running",true);
}
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
public void a() 
{
	  Reporter.log("a method is running",true);
}
}
