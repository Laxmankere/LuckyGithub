package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopus_Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Searchbar = driver.findElement(By.name("q"));
		Searchbar.sendKeys("iphone13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement Review = driver.findElement(By.xpath("(//span[@class='_2_R_DZ'])[1]"));
		System.out.println("iphone13 reviesw is "+Review.getText());
		
		WebElement reivew12 = driver.findElement(By.xpath("//span[text()='12,122 Reviews']"));
		
		System.out.println("iphone12 review is "+reivew12.getText());
		
		
		

	}

}
