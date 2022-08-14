package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File ("D:\\automation\\Apache POI\\Ex2.xlsx");
		
		// reading multiple data from single row
		
		Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet3");
		for(int i =0; i<=4; i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		System.out.println("=======================================================");
		//ReadingMultiple data from single cell
		for(int i =0; i<=4; i++)
		{
			 String value1 = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value1);
		}
	}

}
