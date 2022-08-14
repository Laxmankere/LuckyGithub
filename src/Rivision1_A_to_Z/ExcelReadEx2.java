package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File ("D:\\automation\\Apache POI\\Ex2.xlsx");
		
		String value = WorkbookFactory.create(f).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		double value1 = WorkbookFactory.create(f).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(value1);
		
		boolean value2 = WorkbookFactory.create(f).getSheet("Sheet2").getRow(0).getCell(2).getBooleanCellValue();
		System.out.println(value2);
		
	}

}
