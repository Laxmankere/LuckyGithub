package Rivision1_A_to_Z;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://vctcpune.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// latest syntax after selenium 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// latest syntax after selenium 4
	     driver.navigate().to("https://www.facebook.com/");
	     
	  WebElement email = driver.findElement(By.id("email"));
	  WebElement pass = driver.findElement(By.id("pass"));
	  WebElement login = driver.findElement(By.name("login"));
	  WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
	  WebElement text1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	 
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	    // get title of current url
	
		String title = driver.getTitle();
		System.out.println(title); // -----------> get title
		
		// get current url 
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);  //-----------> getcurrentUrl
		
		email.sendKeys("laxman@123"); //sendkeys
		pass.sendKeys("8494951651"); // sendkeys
		login.click(); //click
		System.out.println(text.getText());  // ---> getText
		System.out.println(text1.getText()); // ----> getText
		
		
		
	}
}

