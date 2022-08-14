package AutoSuggestiveListBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggectiveListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("tom cruise");
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e']) [1]/li"));
		System.out.println(result.size());
		
		for(WebElement r:result)// to see list in console
		{
		System.out.println(r.getText());
		}
		for(WebElement r:result)// to click on specific item--> honda Amaze
		{
		String expectedResult = "tom cruis imgages";
		String actualText=r.getText();
		if(actualText.equals(expectedResult))
		{
		r.click();
		break;
		}
		}
		driver.findElement(By.linkText("Images")).click();
		}
		
		

	}


