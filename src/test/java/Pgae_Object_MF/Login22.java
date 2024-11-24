package Pgae_Object_MF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login22 {
	
 public WebDriver cdriver;
	
	
	
	public Login22(WebDriver cdd) 
	{
		cdriver=cdd;
		PageFactory.initElements(cdriver, this);
	}

	@FindBy(id="username") WebElement UN;
	@FindBy(id="password") WebElement PW;
	@FindBy(id="submit")  WebElement Sub;

	
	public void User_name(String user) 
	{
		UN.sendKeys(user);
	}
	public void Pass_word(String Pass) 
	{
		PW.sendKeys(Pass);
	}
	public void Submit12() 
	{
		Sub.click();
	}
}
