package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Switch MainPage to Iframe
		driver.switchTo().frame("courses-iframe");
		WebElement text = driver.findElement(By.xpath("//span[text()='Motivating & Inspiring Staff']"));
		System.out.println("iframe text is --> "+text.getText());
		driver.findElement(By.xpath("(//a[text()='Read More'])[3]")).click();
		
		// Switch focus iframe to mainpage
		driver.switchTo().defaultContent();
		WebElement mainpage = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]"));
		System.out.println("main page text is --> "+mainpage.getText());
	}
	

}
