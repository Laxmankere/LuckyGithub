package AutoSuggestiveListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.name("q")).sendKeys("lg led tv");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'] )[1]//span)[6]"));
			System.out.println("Review of LG LED is = "+review.getText());
			
			
	}

}
