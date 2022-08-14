
package AutoSuggestiveListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		List<WebElement>check = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println(check.size());
		
		for(WebElement c:check)
		{
			System.out.println(c.getText());
		}
		System.out.println("===================================");
		int count = check.size();
		check.get(count-2).click();
		System.out.println("======================================");
		driver.findElement(By.linkText("Images")).click();
		
		
		
		
		
	}

}
