package com.definition;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;


import Pom.FacebookLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageDefintion  extends FacebookLoginPage{
	

	
	WebDriver driver;
	//public static FacebookLoginPage obj;
	@Given("launch the facebook")
	public static void launch_the_facebook() {
		driver();
		launchUrl("https://www.facebook.com");
	}
	@Then("login with {string} and {string}")
	public static void login_with_username_and_password(String username, String password) {
		
		//loginPage("test", "test@gmail.com");
		FacebookLoginPage obj = new FacebookLoginPage();
//		obj.gettxtUserName().sendKeys("123@gmail.com");
//		obj.gettxtpassword().sendKeys("123@123");
		loginPage(obj.gettxtUserName(), username);
		loginPage(obj.gettxtpassword(), password);

	}
	
	@Then("click the login button")
	public static void click_the_login_button() {
		
		FacebookLoginPage obj = new FacebookLoginPage();
		obj.getbtnLogin().click();
	}


}
