package Rivision1_A_to_Z;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1. How to find No Of Row
		
		List<WebElement> NoOfRow = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		// 1. How to find No of Column
		List<WebElement> NoOfColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		System.out.println("No Of Columns = "+NoOfColumns.size());
		
		// 2.To print header in table
		
		for(WebElement c:NoOfColumns)
		{
			System.out.print(c.getText()+" || ");
		}
		System.out.println();
		for(WebElement R:NoOfRow)
		{
			System.out.print(R.getText()+" || ");
		}
		System.out.println();
		

	}

}
