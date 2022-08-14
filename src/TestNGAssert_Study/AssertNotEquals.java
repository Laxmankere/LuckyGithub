package TestNGAssert_Study;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void NotEqualTest() 
  {
	  char a= 'A';
	  char b= 'B';
	  
	  assertNotEquals(a, b, "a is not equalto b hence TC Passed");
	  
  }
}
