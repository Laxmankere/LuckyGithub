package AutoSuggestiveListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");	
		Thread.sleep(2000);
		
		List<WebElement> grp = driver.findElements(By.xpath("//ul[@role='listbox']/li]"));
		Thread.sleep(2000);
		System.out.println(grp.size());
		for(WebElement g:grp)
		{
			System.out.println(g.getText());
		}
		
		System.out.println("==================================");
		

	}

}
