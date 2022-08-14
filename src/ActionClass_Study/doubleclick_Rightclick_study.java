package ActionClass_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick_Rightclick_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		// 1 create a object of Action class
		Actions act = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'See Alert')]"));
		
		//act.doubleClick(doubleclick).perform();
		act.moveToElement(doubleclick).doubleClick().build().perform();
		Thread.sleep(3000);
		
		// 2 change the focus of selenium to Alert Pop-ups
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(1000);
		
		//3 use contextmethod and right click
		WebElement Rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(Rightclick).perform();
		Thread.sleep(3000);
		
		// 4 use navigate method and open Another browser
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
		//5 find source & destination & use Drag&Drop Method
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		act.dragAndDrop(src, dest).perform();
				
		

	}

}
