package TestNGCrossBTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CompatibilityTesting {
	
  @Parameters("browserName")
  @Test
  public void CT(String Bname) 
  {
		WebDriver driver = null;
		if(Bname.equals("chrome"))
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
  }
		
		else if(Bname.equals("firefox"))
		{
	  System.setProperty("webdriver.gecko.driver", "D:\\automation\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");	
		}
	  
	  
  }
}
