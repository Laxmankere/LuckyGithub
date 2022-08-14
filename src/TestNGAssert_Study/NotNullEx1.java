package TestNGAssert_Study;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

public class NotNullEx1 {
  @Test
  public void Notnulltest() 
  {
	  String a = "laxman";
	  
	  assertNotNull(a, " value is present TC passed");
  }
}
