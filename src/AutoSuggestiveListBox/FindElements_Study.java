package AutoSuggestiveListBox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Study {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=17515033644394751204&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=Cj0KCQjwn4qWBhCvARIsAFNAMihYdCUpuw3bsfUhszX-3Uq_QwSRuFQXOYDGL2wJ6BNgPRUi2zFF0PoaAqFaEALw_wcB");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total No of links = "+links.size()); // How many links 
		
		// what are the links
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
	}

}
