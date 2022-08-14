package POM_WithExcel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class KiteTest_1stPage {

	// First page of kite
	
	//1. Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(id="userid")private WebElement userid;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;

	//2. Initialize within a constructor with access level public using pagefactory
	
	public  KiteTest_1stPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void senduserid(String UID)
	{
		userid.sendKeys(UID);
	}
	public void sendpassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void Clickonloginbutton(){
		{
			loginbutton.click();
		}
	}
	

}
