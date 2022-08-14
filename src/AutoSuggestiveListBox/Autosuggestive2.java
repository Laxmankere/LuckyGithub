package AutoSuggestiveListBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // hidden popup removed
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		List<WebElement> list = driver.findElements(By.xpath("(//li[@class='Y5N33s']) [1]"));
		System.out.println(list.size());
	

	}

}
