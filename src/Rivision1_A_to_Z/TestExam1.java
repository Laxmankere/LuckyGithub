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
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TestExam1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userid = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		System.out.println("Userid displayed result is "+userid.isDisplayed());
		System.out.println("password displayed result is "+pass.isDisplayed());
		System.out.println("password Enabled result is "+pass.isEnabled());
		System.out.println("---------------------------------------------------");
		
		
		WebElement Signup = driver.findElement(By.linkText("Sign up for Facebook"));
		Signup.click();
		
		WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		WebElement female = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		
		System.out.println("male is selected result is "+male.isSelected());
		male.click();
		
		System.out.println("male is selected result is "+male.isSelected());
		System.out.println("female is selected result is "+female.isSelected());
		
		female.click();
		System.out.println("female is selected result is "+female.isSelected());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest = new File("D:\\automation\\screenshot"+random+".jpg");
		FileHandler.copy(src, dest);

		
		}
		
	}


