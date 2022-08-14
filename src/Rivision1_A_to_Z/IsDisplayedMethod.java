package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		// Locator
		//input[@name='show-hide'] --> name
		////input[@class='inputs displayed-class']--->class
		
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		
		//hidebutton.click();
		showbutton.click();
		if(textbox.isDisplayed())
		{
			System.out.println("textbox is displayed");
			textbox.sendKeys("Laxman");
		}
		else
		{
			System.out.println("text box not displaying click on showbutton");
			showbutton.click();
			textbox.sendKeys("LuckyBhai");
			//textbox.clear();
		}
	}

}
