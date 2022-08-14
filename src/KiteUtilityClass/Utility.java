package KiteUtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	public static String ReadDatafromExcel(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	
	{
		File myfile = new File("D:\\automation\\Apache POI\\ValidateKite.xlsx");
		Reporter.log("Reading data from excel",true);
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("D:\\automation\\Shreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taken SCreenshot",true);
	}
	public static void WaitProvider(WebDriver driver,int W)
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
}
