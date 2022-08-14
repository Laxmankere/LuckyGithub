package WaitStudy;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement Dp1 = driver.findElement(By.id("checkBoxOption1"));
		
		// Fluent Wait declaration
		
		 FluentWait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(5))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class);
		 
		 // Usage of Fluent wait
		 
		
			 
		 }
		 
	
}
