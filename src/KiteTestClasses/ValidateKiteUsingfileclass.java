package KiteTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBaseClass.BaseNew;
import KiteUtilityClass.UtilityNew;
import POM_WithExcel.KiteTest_1stPage;
import POM_WithTestNG_KiteEx1.KiteTest_2ndPage;
import POM_WithTestNG_KiteEx1.KiteTest_3rdPage;

public class ValidateKiteUsingfileclass extends BaseNew{
	
	KiteTest_1stPage k1;
	KiteTest_2ndPage k2;
	KiteTest_3rdPage k3; 
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	  openApplication();
	  
	     k1 = new KiteTest_1stPage(driver);
		 k2 = new KiteTest_2ndPage(driver);
		 k3 = new KiteTest_3rdPage(driver);  
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  k1.senduserid(UtilityNew.ReadDatafromPropertyFile("UID"));
	  k1.sendpassword(UtilityNew.ReadDatafromPropertyFile("PWD"));
	  k1.Clickonloginbutton();
	  
	  UtilityNew.WaitProvider(driver, 5);
	  k2.SendPin(UtilityNew.ReadDatafromPropertyFile("PIN"));
	  k2.ClickOnContinuebutton();
	  UtilityNew.WaitProvider(driver, 2);
  }
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException
  {
	  String TCID = "12345";
	  Assert.assertEquals(k3.getActualUID(), UtilityNew.ReadDatafromPropertyFile("UID"),"TC failed actual and Expected User ID Not matching");
	  UtilityNew.captureScreenShot(driver, TCID);
  }
  @AfterMethod
  public void LogOutFromKiteApp()
  {
	  driver.close();
  }
}
