package Selenium_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/aclk?sa=L&ai=DChcSEwj5y-WV96_4AhXMESsKHfRXCFwYABAAGgJzZg&ae=2&sig=AOD64_1U9lsY9s-Jplzq2OrM1JzXJA2NDw&q&adurl&ved=2ahUKEwi8jd6V96_4AhUSSGwGHbJiBtwQ0Qx6BAgCEAE");
	
	    // driver.close();
		
	    //driver.quit();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
	
	
	}

}
