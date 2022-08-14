package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ListboxEX3_MultipleSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement multiple = driver.findElement(By.id("cars")); 
		Select s1 = new Select(multiple);
		System.out.println(s1.isMultiple());
		s1.selectByIndex(1);
		s1.selectByValue("audi");
		s1.selectByVisibleText("Opel");
		
		s1.deselectAll();
		
	}

}
