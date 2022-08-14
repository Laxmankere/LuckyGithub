package TestNGListnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sanity {
  @Test
  public void Test3() {
	  Reporter.log("Test3 is okay from sanity",true);
  }
  @Test
  public void Test4() {
	  Reporter.log("Test4 found defect from sanity",true);
	  Assert.fail();
  }
  @Test
  public void Test5() {
	  Reporter.log("Test5 is okay from sanity",true);
  }
}
