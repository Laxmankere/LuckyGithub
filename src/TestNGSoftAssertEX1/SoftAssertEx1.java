package TestNGSoftAssertEX1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
  @Test
  public void TestValidation() 
  {
	SoftAssert s = new SoftAssert() ; 
	  
	  
	  String a="V.V.S.Laxman";
	  String b="V.V.S.Laxman";
	  boolean c = true;
	  String x=null;
	  
	  s.assertEquals(a, b);
	  s.assertNotEquals(a, b);
	  s.assertTrue(c);
	  s.assertFalse(c);
	  s.assertNull(x); 
	  s.assertNotNull(a);
	  
	  s.assertAll();
	  
	  
  }
}