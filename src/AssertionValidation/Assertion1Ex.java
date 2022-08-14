package AssertionValidation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion1Ex {
  @Test
  public void Test1() 
  {
   Reporter.log("Method is failed intentionly");
	
  }
}
