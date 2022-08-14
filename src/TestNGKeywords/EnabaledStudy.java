package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabaledStudy {
  @Test
  public void a()
  {
	  Reporter.log("a method running", true);
  }
  @Test(enabled = false)
  public void b()
  {
	  Reporter.log("b method running", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c method running", true); 
  }
  
  
}
