package KiteBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base {
	
	protected WebDriver driver;
	public void openApplication()
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  Reporter.log("launching Kite APP",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
