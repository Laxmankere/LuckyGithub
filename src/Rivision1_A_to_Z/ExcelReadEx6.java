package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadEx6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File ("D:\\automation\\Apache POI\\Ex2.xlsx");
		// total row
		Sheet Mysheet = WorkbookFactory.create(f).getSheet("Sheet6");
		
		int TotalRows = Mysheet.getLastRowNum();
		System.out.println("Total Rows = "+TotalRows);
			// total column
		 int Totalcell = Mysheet.getRow(0).getLastCellNum()-1;
		 System.out.println("Total Cell = "+Totalcell);
		 System.out.println("------------------------------------------------------");
		 
		 for(int i=0; i<=TotalRows; i++)  //--> Outer loop for Rows
		 {
			 for(int j=0; j<=Totalcell; j++)  // ---> Inner Loop for columns
			 {
				Cell Mycell = Mysheet.getRow(i).getCell(j);
				CellType CellDatatype = Mycell.getCellType();
			
				 if(CellDatatype==CellType.STRING)
				 {
					 String stringvalue = Mycell.getStringCellValue();
					 System.out.print(stringvalue+" | ");
				 }
				 else if(CellDatatype==CellType.NUMERIC)
				 {
					 double numericvalue = Mycell.getNumericCellValue();
					 System.out.print(numericvalue+" | ");
				 }
				 else if(CellDatatype==CellType.BOOLEAN)
				 {
					 boolean booleanvalue = Mycell.getBooleanCellValue();
					 System.out.print(booleanvalue+" | ");
				 }
				 else if (CellDatatype==CellType.BLANK)
				 {
					 
				 }
			 }
			 System.out.println();
		 }
	}
}

		 


