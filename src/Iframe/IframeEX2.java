package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEX2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/addClass/");
		
		driver.switchTo().frame("sidebar");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("spinner")).sendKeys("Laxman");
		
		
	}

}
