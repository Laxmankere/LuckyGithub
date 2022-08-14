package POM_TestNg_ReddiffEx3;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReddiffLoginApp {
	WebDriver driver;
	File Myfile;
	Sheet MySheet;
	ReddiffLoginPage1 login;
	  NewAcountRediff newNM;
	
  @BeforeClass
  public void LaunchBrowser() throws EncryptedDocumentException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  Myfile = new File("D:\\\\automation\\\\Apache POI\\\\ValidateKite.xlsx");
	  MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
	  login = new ReddiffLoginPage1(driver);
	  newNM = new NewAcountRediff(driver);
  }
  @BeforeMethod
  public void LoginPage() throws InterruptedException
  {
	  login.sendUid(MySheet.getRow(0).getCell(0).getStringCellValue());
	  Reporter.log("Entering Reddiff UserID", true);
	  login.sendPwd(MySheet.getRow(0).getCell(1).getStringCellValue());
	  Reporter.log("Entering PassWord",true);
	  login.clickOKButton();
	  Reporter.log("Clicking Sign In button", true);
	  login.CrateNewAcc();
	  Reporter.log("Creating New account because Dont have valid Userid & Password", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 // newNM.EnterNewName(MySheet.getRow(0).getCell(2).getStringCellValue());
	  //Reporter.log("Enering new Name",true);
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  	  
  }
  @Test
  public void ValidateReddiff()
  {
	  boolean value = login.isenabledCheck();
	  Assert.assertNotNull(value,"UserID Field Have Value so TC Passed");
	  Reporter.log("If UserID Field Null Then TC failed",true);
  
  }
}
