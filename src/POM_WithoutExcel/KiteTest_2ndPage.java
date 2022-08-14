package POM_WithoutExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class KiteTest_2ndPage {
	//1. Data member should be declared globally with access level private using @findBy Annotation
	@FindBy(id="pin") WebElement pin;
	@FindBy(xpath="//button[@type='submit']") WebElement Continue;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteTest_2ndPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//3. Utilize within a method with access level public
	
	public void SendPin()
	{
		pin.sendKeys("982278");
	}
	public void ClickOnContinuebutton()
	{
		Continue.click();
	}

}
