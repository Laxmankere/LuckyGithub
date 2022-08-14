package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//ul[@class='rLrQHf']/li"));
		System.out.println(results.size());
		
		for(WebElement r:results)// to see list in console
		{
		System.out.println(r.getText());
		}
		for(WebElement r:results)// to click on specific item--> honda Amaze
		{
		String expectedResult = "honda amaze";
		String actualText=r.getText();
		if(actualText.equals(expectedResult))
		{
		r.click();
		break;
		}
		}
		
		
	}	

}
