package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	
		File destination = new File ("D:\\automation\\Shreenshot\\snapshot.png");
		FileHandler.copy(abc, destination);
		
		
	}

}
