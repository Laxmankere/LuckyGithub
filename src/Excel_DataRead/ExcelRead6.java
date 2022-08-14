package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Dynamic Coding for Reading complete Excel sheet
				 File myfile = new File("D:\\automation\\Apache POI\\Practice1.xlsx");
					
				Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
				int TotalRow = mysheet.getLastRowNum();
				System.out.println("Total No of Row = "+TotalRow);
				
				int TotalCell = mysheet.getRow(0).getLastCellNum()-1;
				System.out.println("Total No of Cell = "+TotalCell);
				System.out.println("==================================================");
				
				for (int i=0; i<=TotalRow; i++) // Outer Loop -- for Row
				{
					for(int j=0; j<=TotalCell-1; j++)  // inner Loop -- for cell
					{
						String value = mysheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+" | ");
					}
					System.out.println();
				}
				
				
				
	}

}
