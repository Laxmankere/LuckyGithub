package TestNGAssert_Study;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class AssertFalseEx1 {
  @Test
  public void Falsetest() 
  {
	  boolean a= true;
	  boolean b= false;
	  
	  assertFalse(b, "b is false TC passed");
	 // assertFalse(a, "a true TC should failed");
  }
}
