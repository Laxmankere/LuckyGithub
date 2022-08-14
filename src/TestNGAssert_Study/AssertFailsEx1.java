package TestNGAssert_Study;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFailsEx1 {
  @Test
  public void FailTest()
  {
	  Reporter.log("Method failed intentonely");
	 Assert.fail();
 }

}

