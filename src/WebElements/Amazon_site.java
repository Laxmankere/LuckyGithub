package WebElements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_site {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b/ref_=junbauherobath?ie=UTF8&node=28071127031&pf_rd_r=XG14A6BXPMZF2JVS3S1S&pf_rd_p=9e24bac2-d99a-4579-8cd9-8bc47dc0b660&pd_rd_r=323c7d7e-b016-47e6-94b2-4192faab6e13&pd_rd_w=ha1au&pd_rd_wg=D7UKk&ref_=pd_gw_unk");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		// Perticular Element ScreenShot
		WebElement Section = driver.findElement(By.xpath("//i[@class='a-icon a-icon-logo']"));
		File src = Section.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\automation\\Shreenshot\\Amazon.jpg");
		FileHandler.copy(src, trg);
	}

}
