package AutoSuggestiveListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("London");
		Thread.sleep(2000);
		
		List<WebElement> london = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count = london.size();
		
		for(WebElement l:london)
		{
			System.out.println(l.getText());
		}
		
		System.out.println(count);
		//london.get(count-19).click();
		london.get(10).click();
	
	
	}

}
