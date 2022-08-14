package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked_PartialTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// locator by linkedText
		//driver.findElement(By.linkText("Gmail")).click();
		
		// locator by PartiallinkedText
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.quit();

	}

}
