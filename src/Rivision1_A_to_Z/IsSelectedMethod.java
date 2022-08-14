package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		Radio1.click();
		if(Radio1.isSelected()) // true -- false
		{
			
			System.out.println("Already selected");
		}
		else
		{
			
			System.out.println("Now selected ");
		}

	}

}
