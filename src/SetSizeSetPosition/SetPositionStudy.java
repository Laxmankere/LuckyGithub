package SetSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		
		 //  1. Create object of point class and pass x and y values
		Point p = new Point(-1,-1);
	   
		//2.call setPosition method and pass object of Point class
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
