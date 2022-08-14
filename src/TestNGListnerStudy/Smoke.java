package TestNGListnerStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Smoke {
  @Test
  public void Test1() {
	  Reporter.log("test1 is ok from smoke",true);
  }
  @Test
  public void Test2() {
	  Reporter.log("test2 is ok from smoke",true);
  }
}
