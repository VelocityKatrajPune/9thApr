package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		//reading numeric value
		double value = mySheet.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);
		
		//reading boolean value
		Cell myCell = mySheet.getRow(1).getCell(1);
		System.out.println(myCell.getCellType());
		System.out.println(myCell.getBooleanCellValue());
	
		//reading string cell Value
		
		Cell myCell1 = mySheet.getRow(2).getCell(0);
		System.out.println(myCell1.getCellType());
		System.out.println(myCell1.getStringCellValue());
		
		
	}

}
