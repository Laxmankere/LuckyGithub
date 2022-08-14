package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File ("D:\\automation\\Apache POI\\Practice.xlsx");
		Workbook myworkbook = WorkbookFactory.create(f);
		
		Sheet mysheet = myworkbook.getSheet("Sheet2");
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType cellinfotype = mycell.getCellType();
		System.out.println(cellinfotype);
		
		System.out.println(mysheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println("==================================================");
		
		Row myrow1 = mysheet.getRow(0);
		Cell mycell1 = myrow1.getCell(1);
		CellType cellinfotype1 = mycell1.getCellType();
		System.out.println(cellinfotype1);
		System.out.println(mysheet.getRow(0).getCell(1).getNumericCellValue());
		System.out.println("==================================================");
		
		Row myrow2 = mysheet.getRow(0);
		Cell mycell2 = myrow2.getCell(2);
		CellType cellinfotype2 = mycell2.getCellType();
		System.out.println(cellinfotype2);
		System.out.println(mysheet.getRow(0).getCell(2).getBooleanCellValue());
		System.out.println("==================================================");
		
		Row myrow3 = mysheet.getRow(1);
		Cell mycell3 = myrow3.getCell(0);
		CellType cellinfotype3 = mycell3.getCellType();
		System.out.println(cellinfotype3);
		System.out.println(mysheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println("==================================================");
		
        Row myrow4 = mysheet.getRow(1);
		Cell mycell4 = myrow4.getCell(0);
		CellType cellinfotype4 = mycell4.getCellType();
		System.out.println(cellinfotype4);
		System.out.println(mysheet.getRow(1).getCell(1).getStringCellValue());
		
	}

}
