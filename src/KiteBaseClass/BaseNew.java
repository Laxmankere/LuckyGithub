package KiteBaseClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteUtilityClass.UtilityNew;

public class BaseNew {
	
	protected WebDriver driver;
	public void openApplication() throws EncryptedDocumentException, IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 driver.get(UtilityNew.ReadDatafromPropertyFile("URL"));
		  Reporter.log("launching Kite APP",true);
		  
	}

}



