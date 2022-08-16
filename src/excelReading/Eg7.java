package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// all kind of data reading, dynamic
		
		File myfile= new File("D:\\Velocity\\Java Class\\9thApr Even\\Selenium\\9thAprEvenTest.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		int totalNumOfRows = mySheet.getLastRowNum();
		int totalNumOfCells = mySheet.getRow(0).getLastCellNum()-1;
		
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				
				CellType cellDataType = myCell.getCellType();
				
				if(cellDataType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (cellDataType==CellType.NUMERIC)
				{
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
					
				}
				else if (cellDataType==CellType.BOOLEAN) 
				{
				
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value+" ");
				}
				
				else if (cellDataType==CellType.BLANK) 
				{
					
				}
				
			}
			System.out.println();
		}

	}

}
