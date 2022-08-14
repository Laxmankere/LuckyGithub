package POM_WithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUidwithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  File myfile = new File("D:\\automation\\Apache POI\\ValidateKite.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		 String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		 	
		 
		 KiteTest_1stPage login = new KiteTest_1stPage(driver);
		 login.senduserid(UN);
		 login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		 login.Clickonloginbutton();
		 Thread.sleep(1000);
		 
		 KiteTest_2ndPage pin = new KiteTest_2ndPage(driver);
		 pin.SendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		 pin.ClickOnContinuebutton();
		 Thread.sleep(1000);
		 
		 KiteTest_3rdPage home = new KiteTest_3rdPage(driver);
		 home.ValidateUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		 home.Clicklogout();
		 Thread.sleep(500);
		 driver.close();
		 
		 
		 
		 
		 
		 
		  

	}

}
