package Popups;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Alert_PopUps {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		
		// Selenium focus changed to Alert
		Alert Alt = driver.switchTo().alert();
		
		System.out.println(Alt.getText());
		Alt.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
		
		//  screenshot
		File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random1 = RandomString.make(3);
		File dest2 = new File ("D:\\automation\\Shreenshot\\image"+random1+".png");
		FileHandler.copy(f2, dest2);
		
		
	}

}
