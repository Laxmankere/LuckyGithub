package TestNGAssert_Study;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AsertEqualEx1 {
  @Test
  public void Validation() 
  {
	  String a ="Laxman";
	  String b ="Laxman";
	  int d=10;
	  int e=15;
	  
	  assertEquals(a, b);
	  assertEquals(d, e, " d is notequal to e so TC faileds");
  }
}
