package Rivision1_A_to_Z;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MoveToElementEX1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// To take action by mouse need to create object of Action action and pass argument as driver
		
		Actions A = new Actions(driver);
		
		WebElement Contact = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		// now take action by using action class object 'A'
		
		A.moveToElement(Contact).perform();
		A.click().perform();
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		A.moveToElement(radio1).click().build().perform();
		System.out.println(radio1.isSelected());
		
		// TakescreenShot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\automation\\screenshot.jpg");
		FileHandler.copy(src, dest);
		
		
		
		
		

	}

}
