package TestNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 5)
  public void Mymethod() {
	  Reporter.log("My Method is running", true);
  }
  @Test(groups = {"smoke"})
  public void Apple() {
	  Reporter.log("My Method is running", true);
  }
}
