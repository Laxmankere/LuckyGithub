package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		WebElement Textbox = driver.findElement(By.id("displayed-text"));
		//hideButton.click();
		Thread.sleep(500);
		hideButton.click();
		if(Textbox.isDisplayed())
		{
			System.out.println("text box  visible");
			Textbox.sendKeys("Welcome Kere");
			
		}
		else
		{
			System.out.println("Text box now clicking & will displayed");
			showButton.click();
			Textbox.sendKeys("Welcome Agaian Kere");
		}
		driver.quit();
	}
}
