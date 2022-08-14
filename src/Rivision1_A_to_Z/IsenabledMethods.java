package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsenabledMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.discoveryplus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		login.click();
	
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		boolean result = OTPButton.isEnabled();
		System.out.println("OTP button Enabled result is "+result);
		
		WebElement MoNo = driver.findElement(By.id("mobileNumber"));
		MoNo.sendKeys("9370129593");
		
		boolean result1 = OTPButton.isEnabled();
		System.out.println("OTP button Result1 is "+result1);
		
		if (result1)
		{
			OTPButton.click();
			System.out.println("Clicked on OTP button");
		}
		else
		{
			MoNo.sendKeys("888888888");
			System.out.println("failed to click on button");
		}
		
		

	}

}
