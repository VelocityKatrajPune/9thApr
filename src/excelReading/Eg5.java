package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read complete excel sheet
		File myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		
		for(int i=0;i<=1;i++)//outer for loop--> for rows
		{
			for(int j=0;j<=2;j++)//inner for loop--> for cells
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ||");
			}
			
			System.out.println();
		}
		
		
	}

}
