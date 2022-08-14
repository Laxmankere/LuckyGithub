package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement multiSelect = driver.findElement(By.id("cars"));
		Select s= new Select(multiSelect);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(200);
		s.selectByVisibleText("Audi");
		Thread.sleep(200);
		s.selectByValue("saab");
		
		s.deselectAll();
	driver.quit();
		
	}

}
