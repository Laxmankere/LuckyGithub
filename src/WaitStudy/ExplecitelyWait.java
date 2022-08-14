package WaitStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitelyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement Dp1 = driver.findElement(By.id("checkBoxOption1"));
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement element = mywait.until(ExpectedConditions.visibilityOf(Dp1));
		element.click();
	}
	

}
