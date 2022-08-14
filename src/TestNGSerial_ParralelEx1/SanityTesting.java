package TestNGSerial_ParralelEx1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SanityTesting {
  @Test
  public void Build1() 
  {
	  Reporter.log("Build1 is passed",true);
  }
  @Test
  public void Build2()
  {
	  Reporter.log("Build2 is passed",true);
  }
  @Test
  public void Build3() 
  {
	  Reporter.log("Build3 is passed",true);
  }
  @Test
  public void Build4() 
  {
	  Reporter.log("Build4 is passed",true);
  }
}
