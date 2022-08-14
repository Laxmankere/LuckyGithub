package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/aclk?sa=L&ai=DChcSEwj-2MuMjMT4AhVXDysKHQQwCkMYABABGgJzZg&ae=2&sig=AOD64_113do5UkcN_lV3DJXfvaw4VlrOvg&q&adurl&ved=2ahUKEwiXiMSMjMT4AhXA7XMBHSmWAgYQ0Qx6BAgDEAE");
		Thread.sleep(1000);
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		String random=RandomString.make(2);
		File address =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+random+".png");
		FileHandler.copy(abc, address);
		
	}
}

	

