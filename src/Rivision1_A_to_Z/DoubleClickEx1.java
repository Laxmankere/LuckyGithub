package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions Act = new Actions(driver);
		
		WebElement Doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Act.moveToElement(Doubleclick).doubleClick().build().perform();
		
		// handle alert Popups
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
		
	}

}
