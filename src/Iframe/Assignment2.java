package Iframe;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		// Switch on iframe
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		Thread.sleep(1000);
		
		// Switch on main page and clickon Elements and Textbox & Passes value
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("item-0")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Lakshaman Kere Automation Tester");
		
		// Take Screenshot
		File xyz = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest = new File ("D:\\automation\\Shreenshot\\image"+random+".png");
		FileHandler.copy(xyz, dest);
	}

}
