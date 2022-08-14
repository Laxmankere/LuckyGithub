package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.com/");
		Thread.sleep(6000);
		//driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click(); // we have to synchronize to match speed
		Thread.sleep(4000);
		
	WebElement OTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	
	boolean result = OTPbutton.isEnabled();
	System.out.println(result);
	
	WebElement MoNofield = driver.findElement(By.xpath("//input[@id='mobileNumber']"));
	MoNofield.sendKeys("9999999999");
	Thread.sleep(200);
	
	boolean result1 = OTPbutton.isEnabled();
	System.out.println("OTPButton is "+result1);
	
	}

}
