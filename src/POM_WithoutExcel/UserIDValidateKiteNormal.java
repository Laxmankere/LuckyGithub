package POM_WithoutExcel;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserIDValidateKiteNormal {

	public static void main(String[] args) throws InterruptedException {
		
		// Kite User Id Validating Without POM Class
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		// Kite 1st page
		WebElement UserID = driver.findElement(By.id("userid"));
		WebElement PW = driver.findElement(By.id("password"));
		WebElement Button = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserID.sendKeys("ELR321");
		PW.sendKeys("Dhana1111");
		Button.click();
		Thread.sleep(300);
		
		// Kite 2nd Page
		WebElement PIN = driver.findElement(By.id("pin"));
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		PIN.sendKeys("982278");
		Submit.click();
		Thread.sleep(400);
		
		// Kite 3rd Page 
		
		WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String ExpectedUID = UID.getText();
		String ActtualUID = "ELR321";
		
		if (ExpectedUID.equals(ActtualUID))
		{	
			System.out.println("Test Case  Is Passed  Because it Matched");
		}
		else
		{
			System.out.println("Test Case  Is Failed  Because it Not Matched");
		}
		UID.click();
		WebElement LogOut = driver.findElement(By.xpath("//a[@target='_self']"));
		LogOut.click();
		driver.close();
		}

}
