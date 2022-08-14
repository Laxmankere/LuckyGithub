package KiteTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBaseClass.Base;
import KiteUtilityClass.Utility;
import POM_WithExcel.KiteTest_1stPage;
import POM_WithTestNG_KiteEx1.KiteTest_2ndPage;
import POM_WithTestNG_KiteEx1.KiteTest_3rdPage;

public class ValidateKiteUserID extends Base{
	
	KiteTest_1stPage k1;
	KiteTest_2ndPage k2;
	KiteTest_3rdPage k3;
  
  @BeforeClass
  public void launchBrowser()
  {
	  openApplication();
	  
	     k1 = new KiteTest_1stPage(driver);
		 k2 = new KiteTest_2ndPage(driver);
		 k3 = new KiteTest_3rdPage(driver);
	  
  }
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	  k1.senduserid(Utility.ReadDatafromExcel(0, 0));
	  k1.sendpassword(Utility.ReadDatafromExcel(0, 1));
	  k1.Clickonloginbutton();
	  
	  Utility.WaitProvider(driver, 5);
	  k2.SendPin(Utility.ReadDatafromExcel(0, 2));
	  k2.ClickOnContinuebutton();
	  Utility.WaitProvider(driver, 2);
  }
  @Test
  public void kiteUserValidation() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(k3.getActualUID(), Utility.ReadDatafromExcel(0, 0),"TC failed actual and Expected User ID Not matching");
  }
  @AfterMethod
  public void LogOutFromKiteApp()
  {
	  driver.close();
  }
  
  
}
