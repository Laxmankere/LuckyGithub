package POM_TestNg_ReddiffEx3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAcountRediff {
	// 1. declare Data member globally and private
	
	@FindBy(name="named8f4adef")private WebElement name;
	
	
	// 2.Create Constructor
	
	public NewAcountRediff(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3.Methods
	
	public void EnterNewName (String NM)
	{
		name.sendKeys(NM);
		name.getText();
	}
	
	
	
	
	
	
	
}
