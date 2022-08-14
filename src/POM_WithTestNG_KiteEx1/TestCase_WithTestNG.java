package POM_WithTestNG_KiteEx1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase_WithTestNG {
	WebDriver driver;
	File myfile;
	Sheet mysheet;
	KiteTest_1stPage k1;
	KiteTest_2ndPage k2;
	KiteTest_3rdPage k3;
	
	
	
	@BeforeClass
  public void launchingBrowser() throws EncryptedDocumentException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	 File myfile = new File("D:\\automation\\Apache POI\\ValidateKite.xlsx");
	 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	 k1 = new KiteTest_1stPage(driver);
	 k2 = new KiteTest_2ndPage(driver);
	 k3 = new KiteTest_3rdPage(driver);
	 
	 	  
  }
  @BeforeMethod
  public void LogintoKite()
  {
	 k1.senduserid(mysheet.getRow(0).getCell(0).getStringCellValue());
	 Reporter.log("Entering user Id", true);
	 k1.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	 Reporter.log("Entering Password", true);
	 k1.Clickonloginbutton();
	 Reporter.log("clicking on logging button", true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 
	 k2.SendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("Entering pin", true);
	 k2.ClickOnContinuebutton();
	 Reporter.log("Clicking on continue button",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void ValidateUserID()
  {
	 String ExpectedUID = mysheet.getRow(0).getCell(0).getStringCellValue();
	 String actualUID = k3.getActualUID();
	 Reporter.log("validating actual and Expected User ID",true);
	 
	 Assert.assertEquals(actualUID, ExpectedUID, "TC failed actual and expected are not matching");
	 Reporter.log("Validated actual and Expeted USer ID TC is PASSED",true);
	  
  }
  @AfterMethod
  public void logouttoKite() throws InterruptedException
  {
	  k3.Clicklogout();
	  Reporter.log("clicking on logout button",true);
	  Thread.sleep(2000);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("closing browser",true);
	  driver.close();  
	  
  }
	  
  
}

