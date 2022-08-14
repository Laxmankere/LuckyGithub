package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyClass {
 @BeforeClass
 public void LoginBankSite()
 {
		 Reporter.log("Login Successful ", true);
 }
	
  @BeforeMethod
  public void AccOpen() 
  {
	  Reporter.log("Bank Acc Open", true);
  }
  
  @BeforeMethod
  public void MoneyDeposit()
  {
	  Reporter.log("First salary deposited", true);
  }
  
  @Test(groups = {"smoke"})
  public void Withdraw()
  {
	  Reporter.log("1 Lac withdraw", true);
  }
  
  @AfterMethod
  public void LogoutBankSite()
  {
	  Reporter.log("Transction Done now logout", true);
  }
  
  @AfterClass
  public void CloseBankSite()
  {
	  Reporter.log("Closed Bank Site", true);
  }
  }
  
  
  

