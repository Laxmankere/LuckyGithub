package POM_WithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteTest_3rdPage {
	
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteTest_3rdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//3. Utilize within a method with access level public
	
	public void ValidateUserId(String expectedUID)
	{
		String actualUID=userid.getText();
		if(actualUID.equals(expectedUID))
		{
			System.out.println("Actual and Expected UserID's are matching TC is PASSED");
		}
		else
		{
		System.out.println("Actual and Expected UserID's are not matching TC is FAILED");
		}
		}
	
	
	public void Clicklogout() throws InterruptedException
	{	userid.click();
		Thread.sleep(200);
		logout.click();
		
		
	
		
	}
}

