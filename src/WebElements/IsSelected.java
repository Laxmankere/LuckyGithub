package WebElements;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement Chekbox3 = driver.findElement(By.id("checkBoxOption3"));
		Thread.sleep(3000);
		if(Chekbox3.isSelected())
		{
			System.out.println("not clicked");
		}
     else
{
	Chekbox3.click();
	System.out.println("now selected");
}
		//.quit();
}

}
