package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions act = new Actions(driver);
		
		WebElement from = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));	
		//act.dragAndDrop(from, dest).perform();
		act.clickAndHold(from).moveToElement(dest).release().build().perform();

	}

}
