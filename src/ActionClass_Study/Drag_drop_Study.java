package ActionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		// 1 create Action class object
		Actions A = new Actions(driver);
		
		//2 find source & destination
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		A.dragAndDrop(src, dest).perform();
		//A.click(dest).moveToElement(dest).release().build().perform();
		
	}

}
