package KiteUtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew {
	
public static String ReadDatafromPropertyFile(String key) throws EncryptedDocumentException, IOException
	
	{
		Properties prop= new Properties();// created object of properties class
	
		FileInputStream myfile= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_PROJ\\myproperty.properties");
		prop.load(myfile); //loaded the file
		String value = prop.getProperty(key);
		return value;	
	}

	public static void captureScreenShot(WebDriver driver,String TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("D:\\automation\\Shreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taken SCreenshot",true);
	}
	public static void WaitProvider(WebDriver driver,int W)
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
