package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 1. Identify  the list box and store in variable
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		// 2.create an object for select class
		Select s = new Select(listbox);
		
		// by using select class methods perform action
		
		//s.selectByVisibleText("Option1");  // ---> SelectByVisibleText
		//s.selectByValue("option2");       // --->selectByValue
		s.selectByIndex(3);                //----->selectByIndex
		

	}

}
