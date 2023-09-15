package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class FacebookLoginPage extends BaseClass{
	
	public FacebookLoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private static WebElement txtUserName;
	
	@FindBy(id="pass")
	private static WebElement txtPassWord;
	
	@FindBy(name="login")
	private static WebElement btnlogin;
	
	public WebElement gettxtUserName() {
		return txtUserName;
	}
	
	public WebElement gettxtpassword() {
		return txtPassWord;
	}
	
	public WebElement getbtnLogin() {
		return btnlogin;
	}
	
}
