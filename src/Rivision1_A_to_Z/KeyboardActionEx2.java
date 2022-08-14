package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionEx2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	// create object of action class	
		Actions a =  new Actions(driver);
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		WebElement firsname = driver.findElement(By.name("firstname"));
		
		// How to enter text ‘name’ in capital letters help of actions class in Selenium?
		a.moveToElement(firsname).click().keyDown(Keys.SHIFT).sendKeys("laxman").build().perform();
	
		// by using keyboard action with loops statements 
		a.click(day).perform();
		for(int i=1; i<=25; i++)
		{
			a.sendKeys(Keys.ARROW_UP).perform();
		}
		a.sendKeys(Keys.ENTER).perform();
		
		a.click(month).perform();
		for( int i=1; i<=1; i++)
		{
			a.sendKeys(Keys.ARROW_UP).perform();
		}
		a.sendKeys(Keys.ENTER).perform();
		
		a.click(year).perform();
		for(int i=1; i<=29; i++)		
		{
			a.sendKeys(Keys.ARROW_DOWN).perform();
		}
		a.sendKeys(Keys.ENTER).perform();
	}

}
