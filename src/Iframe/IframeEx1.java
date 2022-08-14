package Iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IframeEx1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.switchTo().frame("iframe-name");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Lakshaman in Infosys");
		
		Thread.sleep(1000);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File ("D:\\automation\\Shreenshot\\Image.jpg");
		
		FileHandler.copy(src1, dest);
		driver.quit();
		

}
}
