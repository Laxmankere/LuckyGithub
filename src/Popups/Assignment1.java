package Popups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		
				//  get id of 1st Tab
				String Idmainpage = driver.getWindowHandle();
				System.out.println("MainPage ID = "+Idmainpage);
				System.out.println("----------------------------------------------------------------");
				//  get id of 2nd Tab
				Set<String> Idbothmainchild = driver.getWindowHandles();
				System.out.println("Both ID "+Idbothmainchild);
				System.out.println("-----------------------------------------------------------------");
				
				ArrayList<String> Al = new ArrayList<String>(Idbothmainchild);
				 String Idofmainpage = Al.get(0);
				String Idchildwindow = Al.get(1);
				
			//  switch focus from 1st Tab to 2nd Tab
				driver.switchTo().window(Idchildwindow);
				driver.findElement(By.id("autocomplete")).sendKeys("Selenium");
				driver.findElement(By.xpath("//input[@value='Radio1']")).click();
				driver.findElement(By.name("checkBoxOption2")).click();
;				String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
				System.out.println("Text on 2nd tab is = "+text);
				System.out.println("----------------------------------------------------------");
				Thread.sleep(2000);
			//  Take ScreenShot of 2nd Tab
				File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
				String random=RandomString.make(2);
				File address =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+random+".png");
				FileHandler.copy(abc, address);
				Thread.sleep(1000);
				
			//  switch focus from 2nd tab to 1st tab
				driver.switchTo().window(Idofmainpage);
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("Total number of links on Main Page "+links.size());
				System.out.println("------ Below are the name of 51 links  -------------------------");
				
				//what are the links
				for(WebElement l:links)
				{
				System.out.println(l.getText());
				}
			// Take ScreenShot of ChildWindow
				File xy = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
				String dest=RandomString.make(2);
				File loc =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+dest+".png");
				FileHandler.copy(xy, loc);
				Thread.sleep(1000);
		
				driver.quit();
				
				
		
	}

}
