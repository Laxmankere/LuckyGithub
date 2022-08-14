package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File ("D:\\automation\\Apache POI\\Practice.xlsx");
		
		 String value = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(value);

		 String value1 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		 System.out.println(value1);
		 
		 String value2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		 System.out.println(value2);
		 
		 
		 
		 
	}

}
