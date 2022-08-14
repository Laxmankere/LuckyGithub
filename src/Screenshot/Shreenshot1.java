package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shreenshot1 {

	private static final String Output = null;
	private static final String Outputtype = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    Thread.sleep(1000);

	    
	  
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Location= new File("D:\\automation\\Shreenshot\\picture.png");

	FileHandler.copy(src, Location);
	
	
	}

}
