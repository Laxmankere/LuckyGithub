package ActionClass_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		
	// 1. Create object of ACtions class
		Actions act= new Actions(driver);
		WebElement day = driver.findElement(By.id("day"));
		System.out.println("------------------------------------------");
		
	// 2. Enter Name
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Lakshaman");
		Thread.sleep(500);
		System.out.println("------------------------------------------");
		
	// 3. Enter last name
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Kere");
		Thread.sleep(500);
		System.out.println("------------------------------------------");
		
	// 4. Enter Mobile No
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9370129593");
		Thread.sleep(500);
		System.out.println("------------------------------------------");
		
	// 5. Enter New Password
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		Password.sendKeys("kere12345");
		Thread.sleep(500);	
		System.out.println("------------------------------------------");	
		
	// 6. select day
		act.click(day).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("------------------------------------------");
		
	// 7. select month
		WebElement month = driver.findElement(By.id("month"));
		act.click(month).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		System.out.println("------------------------------------------");
		
	// 8. select year
		WebElement year = driver.findElement(By.id("year"));
		act.click(year).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("------------------------------------------");
			
	// 9. Select gender
		WebElement sex = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		act.click(sex).perform();
		Thread.sleep(500);	
		
		System.out.println("------------------------------------------");
		
			

	}

}
