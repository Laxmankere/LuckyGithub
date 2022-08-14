package Iframe;

import java.io.File;
import java.io.IOException;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class IFrameEx3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		//get text from main page
		WebElement text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
		Thread.sleep(1000);
		System.out.println(text);
		// sendkeys to iframe1
		
		driver.switchTo().frame("frame1");
		Thread.sleep(500);
		driver.findElement(By.tagName("input")).sendKeys("Selenium Content");
		
		// click on iframe3
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement Listbox = driver.findElement(By.id("animals"));
		
		Select s = new Select(Listbox);
		s.selectByVisibleText("Avatar");
		Thread.sleep(500);
		s.selectByIndex(0);
		Thread.sleep(500);
		s.selectByValue("big baby cat");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement text1 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		System.out.println(text1);
		
		driver.quit();
		//Thread.sleep(1000);
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(3);
		File dest = new File ("D:\\automation\\Shreenshot\\snap"+random+"png");
		FileHandler.copy(src, dest);
			
	*/
		
}
}
