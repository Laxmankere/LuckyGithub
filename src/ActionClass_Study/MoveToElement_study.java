package ActionClass_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MoveToElement_study {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
	
		 Actions A = new Actions(driver);
		 WebElement Contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		 A.moveToElement(Contact).perform();
		//Contact.click();
		 Thread.sleep(1000);
		
	  //  Take ScreenShot 1
			File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		    String random=RandomString.make(2);
			File address =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+random+".png");
			FileHandler.copy(abc, address);
			Thread.sleep(1000);
		
		// 2. Click on Checkbox
		WebElement option = driver.findElement(By.xpath("//input[@value='option2']"));
		A.moveToElement(option).perform();
		A.click().perform();
		Thread.sleep(1000);
		
		 //  Take ScreenShot 2
     	File xy = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
	    String dest=RandomString.make(2);
		File add =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+dest+".png");
		FileHandler.copy(xy, add);
		Thread.sleep(1000);
	
	}

}
