package Excel_DataRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead_7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		// Dynamic Coding for Reading complete Excel sheet
		 File myfile = new File("D:\\automation\\Apache POI\\Practice1.xlsx");
			
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		int TotalRow = mysheet.getLastRowNum();
		System.out.println("Total No of Row = "+TotalRow);
		int TotalCell = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total No of Cell = "+TotalCell);
		System.out.println("==================================================");
		
		for(int i=0;i<=TotalRow;i++)
		{
		for(int j=0;j<=TotalCell;j++)
		{
		Cell mycell = mysheet.getRow(i).getCell(j);
		CellType celldatatyoe = mycell.getCellType();
		if(celldatatyoe==CellType.STRING)
		{
			String value = mycell.getStringCellValue();
			System.out.print(value+" | ");
		}
		else if (celldatatyoe==CellType.NUMERIC)
		{
			double value = mycell.getNumericCellValue();
			System.out.print(value+" | ");
		}
		else if(celldatatyoe==CellType.BOOLEAN)
		{
			boolean value = mycell.getBooleanCellValue();
			System.out.print(value+" | ");
		}
		else if(celldatatyoe==CellType.BLANK)
		{
			
		}
		
		}
		System.out.println();
		
		}
	}

}
	
