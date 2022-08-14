package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile = new File("D:\\automation\\Apache POI\\Ex1.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
