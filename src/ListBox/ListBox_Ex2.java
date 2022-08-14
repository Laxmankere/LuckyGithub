package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		Thread.sleep(5000);
		//identify element and store in ref variable
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(2000);
		//create object of store class
		Select s = new Select(year);
		//s.selectByVisibleText("2009");
		//s.selectByValue("2011");
		System.out.println(s.isMultiple());
		for(int i=0; i<=9; i++)
		{
		{ 
			s.selectByIndex(i);
			Thread.sleep(500);
		}
		
		}
	}
}
	



