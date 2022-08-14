import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class External8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=6437556997081951710&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9304071&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=CjwKCAjwh-CVBhB8EiwAjFEPGaQTXgxvOextO84pXKXodxZKvUDfhgknLhnRSUibCQdaS8e9sFM3DhoC35EQAvD_BwE");
		Thread.sleep(4000);
		driver.findElement(By.className("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=6437556997081951710&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9304071&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=CjwKCAjwh-CVBhB8EiwAjFEPGaQTXgxvOextO84pXKXodxZKvUDfhgknLhnRSUibCQdaS8e9sFM3DhoC35EQAvD_BwE")).click();

		Thread.sleep(1000);
	}

}
