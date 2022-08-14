package POM_WithoutExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_Kite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
		
		KiteTest_1stPage k1 = new KiteTest_1stPage(driver);  // Object for login page
		k1.userid();
		k1.password();
		k1.Clickonloginbutton();
		Thread.sleep(200);
		
		KiteTest_2ndPage k2 = new KiteTest_2ndPage(driver);  // object for Pin page
		k2.SendPin();
		k2.ClickOnContinuebutton();
		Thread.sleep(200);
		
		KiteTest_3rdPage k3 = new KiteTest_3rdPage(driver);
		k3.Useridclick();
		k3.Clicklogout();
		Thread.sleep(500);
		driver.close();
		
		
		
		
	}

}
