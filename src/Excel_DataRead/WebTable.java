package Excel_DataRead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// How to find No of row
		 List<WebElement> NoOfRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("No of Row in Table = "+NoOfRows.size());
		
		// How to find No of columns
		 List<WebElement> NoOfColumns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		System.out.println("No of column = "+NoOfColumns.size());
		
		// How to find table data
			 List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='product']//tr[1]//td"));
			System.out.println("No of column = "+NoOfColumns.size());

		// To Print header in Table
		for (WebElement c:NoOfColumns)
		{
			System.out.print(c.getText()+" || ");
		}
		System.out.println();
		
		int d =0;
	   for( int i =1; i<NoOfRows.size(); i++)
	     {
		for (int j =0; j<3; j++)
		 {
			System.out.println(tabledata.get(d).getText());
			System.out.println(" || ");
			d++;
			 }
		System.out.println();
	}
	}

}
