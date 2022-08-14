package Rivision1_A_to_Z;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChilBrowser_PopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("NewTab")).click();
		
		// get id of main window
		String MainWindowID = driver.getWindowHandle();
		System.out.println("MainWindowID is "+MainWindowID);
		
		// get Id of of both Window( Main+child)
		Set<String> AllWindowID = driver.getWindowHandles();
		System.out.println(AllWindowID);
		System.out.println("--------------------------------------------------");
		
		// convert Set String to ArrayList
		ArrayList<String> AL = new ArrayList<String>(AllWindowID);
		String Newidofmainpage = AL.get(0);
		String idchildwindow = AL.get(1);
		
		// switch selenium focus from mainpage to childwindow
		driver.switchTo().window(idchildwindow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.id("default-btn-e7ee868a2a719787b1d3727d4dc156df")).click();
		WebElement text2 = driver.findElement(By.xpath("//h3[text()='QA tools & automation testing techniques']"));
		System.out.println("ChildWindow2 text is = "+text2.getText());
		System.out.println("---------------------------------------------------");
		driver.quit();
		

	}

}
