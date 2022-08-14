package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		//driver.findElement(By.id("email")).sendKeys("Thaliava");
		//Thread.sleep(1000);
		//driver.findElement(By.name("pass")).sendKeys("Kere@Don");
		//Thread.sleep(500);
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(500);
		//driver.findElement(By.name("pass")).clear();
		//driver.findElement(By.id("email")).clear();
		//Thread.sleep(500);
		//driver.close();
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]")).getText();
		System.out.println("text is "+text);
		driver.quit();
		Thread.sleep(500);
		
		
		
		

	}

}
