package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
         File myfile = new File("D:\\automation\\Apache POI\\Practice1.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		// Reading Multiple data from single Row
		
		for (int i = 0; i<=3; i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		System.out.println("===============================================");
		// Reading Multiple data from single column
		
		for (int i = 0; i<=2; i++)
		{
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}

}
