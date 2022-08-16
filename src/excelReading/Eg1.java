package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		File myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value1);
		
		String value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(value2);

	}

}
