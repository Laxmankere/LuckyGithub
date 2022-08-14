package WebElements;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium_Xpath.Xpath;

public class IsSelectedMakeMytrip {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		 WebElement check3 = driver.findElement(By.xpath("(//i[contains(@class,'checkbox')])[3]"));
		 check3.click();
		 if(check3.isSelected())//-->true
			 
		 {   
			 System.out.println("Already selected");
			
		 }
		 else {
			
			 System.out.println("Now selected");
		 }
		
	

		
		
		

	}

}
