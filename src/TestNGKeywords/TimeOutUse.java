package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test
  public void a() 
  {
	 Reporter.log("a method is running", true); 
  }
  @Test(timeOut = 1000)
  public void b() throws InterruptedException
  {
	  Thread.sleep(5000);
	  Reporter.log("b method is running", true); 
  }
  @Test
  public void c()
  {
	  Reporter.log("c method is running", true); 
  }
  @Test
  public void d()
  {
	  Reporter.log("d method is running", true); 
  }
  @Test
  public void e()
  {
	  Reporter.log("e method is running", true); 
  }
}
