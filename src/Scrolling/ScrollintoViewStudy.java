package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoViewStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com//");
		Thread.sleep(1000);
		
		WebElement katrajpune = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();",katrajpune);
		

	}

}
