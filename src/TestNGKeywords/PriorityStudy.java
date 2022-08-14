package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test
  public void a()
  {
	  System.out.println("a method is running");
	  Reporter.log("a methos is running", true);
  }
  @Test
  public void b()
  {
	 Reporter.log("b method is running", true); 
  }
  @Test(groups = {"smoke"},priority = -5)
  public void c()
  {
	  Reporter.log("c method is running ", true);
  }
  @Test
  public void d()
  {
	Reporter.log("d method is running", true);  
  }
  @Test(priority = -1)
  public void e()
  {
	  Reporter.log("e method is runnig", true);
  }
}
