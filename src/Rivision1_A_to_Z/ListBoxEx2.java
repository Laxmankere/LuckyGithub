package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		WebElement year = driver.findElement(By.id("year"));
		Select s1 = new Select(year);
		//s1.selectByVisibleText("1993");
		System.out.println(s1.isMultiple());
		
		for(int i =0; i<=29;i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(500);
		}
		for(int i=29; i>=0;i--)
		{
			s1.selectByIndex(i);
		}
	}

}
