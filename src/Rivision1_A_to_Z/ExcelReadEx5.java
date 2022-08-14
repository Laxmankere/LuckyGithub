package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Dynamic Coding for complete excel reading
		
		File f = new File ("D:\\automation\\Apache POI\\Ex2.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet5");
		
		int TotalRow = mysheet.getLastRowNum();
		System.out.println("Total row is = "+TotalRow);
		
		 int TotalCell = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total no of Column = "+TotalCell);
		
		for(int i=0;i<=TotalRow;i++)  // --> Outer loop for Rows
		{
			for(int j=0; j<=TotalCell; j++)  // --> inner loop for Columns
		{
			String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" | ");
		}
		System.out.println();
		
		}

      }
 }
