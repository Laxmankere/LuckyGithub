package Webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(500);
		driver.manage().window().maximize()	;
		Thread.sleep(1000);
		//driver.navigate().to("https://www.google.com/");
		//driver.manage().window().maximize()	;
		//Thread.sleep(500);
		//driver.navigate().back();
		//Thread.sleep(500);
		//driver.navigate().forward()	;
		// driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(500);
		// driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
		
		
		
		
	}

}
