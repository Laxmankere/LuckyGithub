package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1.switch focus of Selenium to iframe
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement text = driver.findElement(By.xpath("//h2[text()='My First JavaScript']"));
		System.out.println("Iframe text is "+text.getText());
		
		// 2.Switch focus of Selenium to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menuButton")).click();
		
		
	}

}
