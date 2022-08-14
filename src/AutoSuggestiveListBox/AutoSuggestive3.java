package AutoSuggestiveListBox;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class AutoSuggestive3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("mercedes new");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		
		for(WebElement l:list)
		{
			System.out.println(l.getText());
		}
		
		for(WebElement l:list)
		{
			String expectedResult = "mercedes new car";
			String ActualResult = l.getText();
					
					if(ActualResult.equals(expectedResult))
					{
					l.click();
					break;
					}
			
		}
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(1000);
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		String random=RandomString.make(2);
		File address =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+random+".png");
		FileHandler.copy(abc, address);
		
	}

}
