package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Read Complete sheet
		
		File f = new File ("D:\\automation\\Apache POI\\Ex2.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet4");
			
		for(int i =0; i<=1; i++)	// --> outer loop for Rows
			for(int j=0; j<=2; j++)  // ---> inner loop for columns
		{
			String value = mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" || ");
		}
		System.out.println();
	}

}
