package TestNGAssert_Study;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AsserttrueEx1 {
  @Test
  public void AsserttrueTest() 
  {
	  boolean a = true;
	 // boolean b = false;
	  
	  assertTrue(a, "a is true hence TC passed");
	  //assertTrue(b,"b is false TC failed");
  }
}
