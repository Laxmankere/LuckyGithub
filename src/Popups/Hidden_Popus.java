package Popups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Hidden_Popus {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.className("_3704LK")).sendKeys("College Bag");
	
		// Click on PopUps cancel marks
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		   //  screenshot
			File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String random1 = RandomString.make(3);
			File dest2 = new File ("D:\\automation\\Shreenshot\\image"+random1+".png");
			FileHandler.copy(f2, dest2);
			
		
	}

}
