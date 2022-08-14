package POM_TestNg_ReddiffEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReddiffLoginPage1 {
	
	// 1. declare Data member globally and private
	
	@FindBy(id="login1") private WebElement UserID;
	@FindBy(id="password")private WebElement Password;
	@FindBy(name="proceed")private WebElement Submit;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement CreatAcc;
	
	
	public ReddiffLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUid(String UID)
	{
		UserID.sendKeys(UID);
	}
	public void sendPwd(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void clickOKButton()
	{
	Submit.click();
	}
	public boolean isenabledCheck()
	{
	boolean value = UserID.isDisplayed();
	return value;
	
	}
	public void CrateNewAcc()
	{
	CreatAcc.click();
	
	}
	
	
	

}
