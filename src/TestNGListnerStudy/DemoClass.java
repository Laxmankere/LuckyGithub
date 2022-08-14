package TestNGListnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListnerStudy.Listners.class)
public class DemoClass {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Method1 started", true);
  }
  @Test
  public void myMethod2() 
  {
	  Reporter.log("Method2 started", true);
	  Assert.fail();
  }
  @Test
  public void myMethod3() 
  {
	  Reporter.log("Method3 started", true);
  }
}
