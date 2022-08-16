package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew 
{
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop= new Properties();// created object of properties class
		
		FileInputStream myFile= new FileInputStream("C:\\Users\\yogendra\\eclipse-workspace\\9th_APR_EVEN_Selenium\\myProperty.properties");

		prop.load(myFile);// loaded the file
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\screenshot\\TC"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taken SCreenshot",true);
	}

}
