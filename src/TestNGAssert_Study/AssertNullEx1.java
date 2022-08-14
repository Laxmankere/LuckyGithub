package TestNGAssert_Study;

import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class AssertNullEx1 {
  @Test
  public void NullTest() 
  {
	  String a = null;
	  
	  assertNull(a, "value us null Tc passed");
  }
}
