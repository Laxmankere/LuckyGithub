package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelread5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Read complete Excel sheet
		 File myfile = new File("D:\\automation\\Apache POI\\Practice1.xlsx");
			
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		for (int i = 0; i<=3; i++) // --Outer Loop--for Rows
		{
			for (int j=0;j<=3;j++) // inner loop -- for column
			{
				double value = mysheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value+" | ");
			}
			System.out.println();
		}
	
			
			

	}

}
