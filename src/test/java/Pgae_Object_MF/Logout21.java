package Pgae_Object_MF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout21 {
	
	
WebDriver ldriver;
	
	
	public Logout21(WebDriver d) {
		ldriver=d;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(xpath="//a[text()='Log out']") WebElement L;
	
	public void Log_out1() 
	{
		L.click();
	}
}
