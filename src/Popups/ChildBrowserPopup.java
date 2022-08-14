package Popups;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(1000);
		
		//  get id of main page
			String idofmainpage = driver.getWindowHandle();
			System.out.println(idofmainpage);
		//  get id of child window
			Set<String> idbothmainchild = driver.getWindowHandles();
			System.out.println(idbothmainchild);
			
			ArrayList<String> al = new ArrayList<String>(idbothmainchild);
			 String Idofmainpage = al.get(0);
			String Idifchildwindow = al.get(1);
			
		//  switch focus from main page to child page
			driver.switchTo().window(Idifchildwindow);
			driver.manage().window().maximize();
			driver.findElement(By.id("the7-search")).sendKeys("Hello Lakshaman");
			
		// Take ScreenShot of ChildWindow
			File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
			String random=RandomString.make(2);
			File address =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+random+".png");
			FileHandler.copy(abc, address);
			Thread.sleep(1000);
			
			driver.close();
			driver.switchTo().window(Idofmainpage);
			Thread.sleep(1000);
			driver.findElement(By.name("home")).click();
			
	  //    Take ScreenShot of  Mainpage
			File xyz = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
			String fast=RandomString.make(2);
		    File dest =new File("D:\\\\automation\\\\Shreenshot\\Shreenshot"+fast+".png");
			FileHandler.copy(xyz, dest)
			;
	}

}
